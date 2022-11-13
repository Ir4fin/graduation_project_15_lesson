package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.MainPageObjects;

import java.util.Locale;

public class MainPageTests extends TestBase {

    MainPageObjects mainPageObjects = new MainPageObjects();
    Faker faker = new Faker(new Locale("en"));
    String destinationName,
    newDestination;

    @BeforeEach
    void PrepareTestData() {
    destinationName = faker.address().country();
    newDestination = faker.address().country();
    }


   @Test
    void SimpleSearchFromMainPage() {
        mainPageObjects.openPage()
                .putTextToInputOnMainPage(destinationName)
                .clickOnSearchButton()
                .checkResult();
    }

    @Test
    void ChangeLanguage() {
        mainPageObjects.openPage()
                .changeLanguageModalIsAppear()
                .setAnotherLanguage("Deutsch")
                .checkNewLanguageIsSet();

    }

    @Test
    void CheckValidationIfInputIsEmpty() {
    mainPageObjects.openPage()
            .clickOnSearchButton()
            .checkValidationMessage();
    }

    @Test
    void CheckContactButtonWorks() {
        mainPageObjects.openPage()
                .clickOnSupportButton()
                .checkSupportPageIsOpen();
    }

    @Test
    void CheckContactPageWithoutLogin() {
        mainPageObjects.openPage()
                .clickOnSupportButton()
                .checkSupportPageIsOpen()
                .clickOnContinueWithoutAnAccount()
                .checkBookingDetailPageIsOpen();
    }

    @Test
    void CheckThatRegistrationButtonRedirectToNewPage() {
        mainPageObjects.openPage()
                .clickOnRegistrationButton()
                .checkRegistrationPageIsOpen();
    }

    @Test
    void SimpleSearchFromResultPage() {
       mainPageObjects.openPage()
               .putTextToInputOnMainPage(destinationName)
               .clickOnSearchButton()
               .checkResult()
               .putNewDestinationToInputOnResultPage(newDestination)
               .checkResult();
    }

}


