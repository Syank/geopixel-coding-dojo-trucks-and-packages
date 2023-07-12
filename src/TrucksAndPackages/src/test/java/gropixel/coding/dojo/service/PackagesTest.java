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
    public void should_packageBePersisted_when_entityIsSaved() {

    }

    @Test
    public void should_packageBeUpdated_when_theEntityBeEditedAndSaved() {

    }

    @Test
    public void should_packageBeDeleted_when_itBeRequestedToTheService() {

    }

    @Test
    public void should_packagesListBeRetrieved_when_itBeRequestedFromTheService() {

    }

    @Test
    public void should_packageBeFound_when_searchedById() {

    }

    @Test
    public void should_packagesBeFound_when_searchedByContentType() {

    }

    @Test
    public void should_packageNotBeRegistered_when_triedToBeRegisteredWithoutContentType() {

    }

    @Test
    public void should_packageBeAssignedToTruck_when_requestedToTheService() {

    }

    @Test
    public void should_packageNotBeAssignedToMoreThanOneTruck_when_assignedToATruckWhenAlreadyIsAssignedToOneAndExpectException() {

    }

    @Test
    public void should_packageBeWithoutTruck_when_aPackageFromATruckBeUnassignedFromIt() {

    }

    @Test
    public void should_packagesFromTruckBeRetrieved_when_requestedThePackagesOfATruck() {

    }

}
