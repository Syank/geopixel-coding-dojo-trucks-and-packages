package gropixel.coding.dojo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Component
public class DatabaseInitializer implements InitializingBean {
    private JdbcTemplate jdbcTemplate;
    private Resource schemaScript;
    private Resource dataScript;

    public DatabaseInitializer(JdbcTemplate jdbcTemplate,
                               @Value("classpath:schema.sql") Resource schemaScript,
                               @Value("classpath:data.sql") Resource dataScript) {
        this.jdbcTemplate = jdbcTemplate;

        this.schemaScript = schemaScript;
        this.dataScript = dataScript;

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (schemaScript.exists()) {
            String sql = FileCopyUtils.copyToString(new InputStreamReader(schemaScript.getInputStream(), StandardCharsets.UTF_8));

            jdbcTemplate.execute(sql);

        }

        if (dataScript.exists()) {
            String sql = FileCopyUtils.copyToString(new InputStreamReader(dataScript.getInputStream(), StandardCharsets.UTF_8));

            jdbcTemplate.execute(sql);

        }

    }

}
