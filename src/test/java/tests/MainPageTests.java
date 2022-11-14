package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
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
   @Tag("simpleSearch")
   @Tag("MainPageTests")
    void SimpleSearchFromMainPage() {
        mainPageObjects.openPage()
                .putTextToInputOnMainPage(destinationName)
                .clickOnSearchButton()
                .checkResult();
    }

    @Test
    @Tag("changeLanguage")
    @Tag("MainPageTests")
    void ChangeLanguage() {
        mainPageObjects.openPage()
                .changeLanguageModalIsAppear()
                .setAnotherLanguage("Deutsch")
                .checkNewLanguageIsSet();

    }

    @Test
    @Tag("checkValidationError")
    @Tag("MainPageTests")
    void CheckValidationIfInputIsEmpty() {
    mainPageObjects.openPage()
            .clickOnSearchButton()
            .checkValidationMessage();
    }

    @Test
    @Tag("checkSupportButton")
    @Tag("MainPageTests")
    void CheckContactButtonWorks() {
        mainPageObjects.openPage()
                .clickOnSupportButton()
                .checkSupportPageIsOpen();
    }

    @Test
    @Tag("checkContactWithoutLogin")
    @Tag("MainPageTests")
    void CheckContactPageWithoutLogin() {
        mainPageObjects.openPage()
                .clickOnSupportButton()
                .checkSupportPageIsOpen()
                .clickOnContinueWithoutAnAccount()
                .checkBookingDetailPageIsOpen();
    }

    @Test
    @Tag("checkRegistrationRedirect")
    @Tag("MainPageTests")
    void CheckThatRegistrationButtonRedirectToNewPage() {
        mainPageObjects.openPage()
                .clickOnRegistrationButton()
                .checkRegistrationPageIsOpen();
    }

    @Test
    @Tag("checkSearchFromResult")
    @Tag("MainPageTests")
    void SimpleSearchFromResultPage() {
       mainPageObjects.openPage()
               .putTextToInputOnMainPage(destinationName)
               .clickOnSearchButton()
               .checkResult()
               .putNewDestinationToInputOnResultPage(newDestination)
               .checkResult();
    }

}


