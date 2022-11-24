package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
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
    void prepareTestData() {
    destinationName = faker.address().country();
    newDestination = faker.address().country();

    }


   @Test
   @Tag("simpleSearch")
   @Tag("MainPageTests")
   @DisplayName("Поиск с главной страницы без заданных дат")
    void simpleSearchFromMainPage() {
        mainPageObjects.openPage()
                .putTextToInputOnMainPage(destinationName)
                .clickOnSearchButton()
                .checkResult();
    }

    @Test
    @Tag("changeLanguage")
    @Tag("MainPageTests")
    @DisplayName("Проверка функционала по смене языка")
    void changeLanguage() {
        mainPageObjects.openPage()
                .changeLanguageModalIsAppear()
                .setAnotherLanguage("Deutsch")
                .checkNewLanguageIsSet();

    }

    @Test
    @Tag("checkValidationError")
    @Tag("MainPageTests")
    @DisplayName("Проверка наличия ошибки валидации на форме ввода")
    void checkValidationIfInputIsEmpty() {
    mainPageObjects.openPage()
            .clickOnSearchButton()
            .checkValidationMessage();
    }

    @Test
    @Tag("checkSupportButton")
    @Tag("MainPageTests")
    @DisplayName("Проверка срабатывания кнопки обратной связи")
    void checkContactButtonWorks() {
        mainPageObjects.openPage()
                .clickOnSupportButton()
                .checkSupportPageIsOpen();
    }

    @Test
    @Tag("checkContactWithoutLogin")
    @Tag("MainPageTests")
    @DisplayName("Проверка функционала отправления заявки на обратную связь без совершенного логина в систему")
    void checkContactPageWithoutLogin() {
        mainPageObjects.openPage()
                .clickOnSupportButton()
                .checkSupportPageIsOpen()
                .clickOnContinueWithoutAnAccount()
                .checkBookingDetailPageIsOpen();
    }

    @Test
    @Tag("checkRegistrationRedirect")
    @Tag("MainPageTests")
    @DisplayName("Проверка срабатывания кнопки регистрации")
    void checkThatRegistrationButtonRedirectToNewPage() {
        mainPageObjects.openPage()
                .clickOnRegistrationButton()
                .checkRegistrationPageIsOpen();
    }

    @Test
    @Tag("checkSearchFromResult")
    @Tag("MainPageTests")
    @DisplayName("Проверка поиска нового места назначения со страницы с результатами для другого поиска")
    void simpleSearchFromResultPage() {
       mainPageObjects.openPage()
               .putTextToInputOnMainPage(destinationName)
               .clickOnSearchButton()
               .checkResult()
               .putNewDestinationToInputOnResultPage(newDestination)
               .checkResult();
    }

}


