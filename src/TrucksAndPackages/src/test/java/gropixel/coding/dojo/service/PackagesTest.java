package gropixel.coding.dojo.service;

import gropixel.coding.dojo.TrucksAndPackagesApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


@AutoConfigureMockMvc
@ContextConfiguration(classes = TrucksAndPackagesApplication.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PackagesTest {

    @Test
    public void assertPackageCanBeRegistered() {

    }

    @Test
    public void assertPackageCanBeUpdated() {

    }

    @Test
    public void assertPackageCanBeDeleted() {

    }

    @Test
    public void assertPackagesListCanBeRetrieved() {

    }

    @Test
    public void assertPackageCanBeFoundById() {

    }

    @Test
    public void assertPackagesCanBeFoundByContentType() {

    }

    @Test
    public void assertPackageCanNotBeRegisteredWithoutContentType() {

    }

    @Test
    public void assertPackageCanBeAssignedToTruck() {

    }

    @Test
    public void assertPackageCanNotBeAssignedToMoreThanOneTruckAtTimeAndExpectException() {

    }

    @Test
    public void assertPackageCanBeUnassignedFromTruck() {

    }

}
