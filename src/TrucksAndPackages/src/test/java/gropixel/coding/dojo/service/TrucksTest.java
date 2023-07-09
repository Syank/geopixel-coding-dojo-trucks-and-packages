package gropixel.coding.dojo.service;

import gropixel.coding.dojo.TrucksAndPackagesApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@AutoConfigureMockMvc
@ContextConfiguration(classes = TrucksAndPackagesApplication.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TrucksTest {

    @Test
    public void assertTruckCanBeRegistered() {

    }

    @Test
    public void assertTruckCanBeUpdated() {

    }

    @Test
    public void assertTruckCanBeDeleted() {

    }

    @Test
    public void assertTrucksListCanBeRetrieved() {

    }

    @Test
    public void assertTruckCanBeFoundById() {

    }

    @Test
    public void assertTruckCanBeFoundByLicensePlate() {

    }

    @Test
    public void assertCanAssignThreePackagesToTruck() {

    }

    @Test
    public void assertCanNotAssignMoraThanThreePackagesToTruckAndExpectException() {

    }

    @Test
    public void assertCanUnassignPackagesFromTruck() {

    }

    @Test
    public void assertTruckCanNotBeRegisteredWithoutLicensePlateAndExpectException() {

    }

    @Test
    public void assertCanFindTrucksWithSpecificAmountOfAssignedPackages() {

    }

}
