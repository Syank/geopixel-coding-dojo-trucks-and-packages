package gropixel.coding.dojo.controller;


import gropixel.coding.dojo.TrucksAndPackagesApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@AutoConfigureMockMvc
@ContextConfiguration(classes = TrucksAndPackagesApplication.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TrucksControllerTest {

}
