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
    public void should_truckBePersisted_when_entityIsSaved() {

    }

    @Test
    public void should_truckBeUpdated_when_theEntityBeEditedAndSaved() {

    }

    @Test
    public void should_truckBeDeleted_when_itBeRequestedToTheService() {

    }

    @Test
    public void should_trucksListBeRetrieved_when_itBeRequestedFromTheService() {

    }

    @Test
    public void should_truckBeFound_when_searchedById() {

    }

    @Test
    public void should_truckBeFound_when_searchedByLicensePlate() {

    }

    @Test
    public void should_truckHasThreeAssignedPackages_when_packagesAreAssignedToIt() {

    }

    @Test
    public void should_exceptionBeThrow_when_moreThanThreePackagesAreAssignedToTruck() {

    }

    @Test
    public void should_packageIsRemovedFromTruck_when_packageIsUnassignedFromTruck() {

    }

    @Test
    public void should_exceptionBeThrow_when_truckIsRegisteredWithoutLicensePlate() {

    }

    @Test
    public void should_trucksBeFound_when_searchForTrucksWithASpecificAmountOfPackages() {

    }

}
