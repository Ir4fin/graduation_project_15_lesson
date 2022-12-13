package tests;

import com.github.javafaker.Faker;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactPage;
import pages.MainPage;
import pages.SearchResultsPage;

import java.util.Locale;

public class MainPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();

    SearchResultsPage searchResultsPage = new SearchResultsPage();
    Faker faker = new Faker(new Locale("en"));


    @Test
    @DisplayName("Поиск с главной страницы без заданных дат")
    void simpleSearchFromMainPage() {
        String destinationName = faker.address().country();

        mainPage.openPage()
                .putTextToInputOnMainPage(destinationName)
                .clickOnSearchButton();

        searchResultsPage.checkResultPageIsOpenAndHasContent();
    }

    @Test
    @Tag("changeLanguage")
    @Tag("MainPageTests")
    @DisplayName("Проверка функционала по смене языка")
    void changeLanguage() {
        mainPage.openPage()
                .changeLanguageModalIsAppear()
                .setAnotherLanguage("Deutsch")
                .checkNewLanguageIsSet();

    }

    @Test
    @Tag("checkValidationError")
    @Tag("MainPageTests")
    @DisplayName("Проверка наличия ошибки валидации на форме ввода")
    void checkValidationIfInputIsEmpty() {
        mainPage.openPage()
                .clickOnSearchButton()
                .checkValidationMessage();
    }

    @Test
    @Tag("checkSupportButton")
    @Tag("MainPageTests")
    @DisplayName("Проверка срабатывания кнопки обратной связи")
    void checkContactButtonWorks() {
        mainPage.openPage()
                .clickOnSupportButton();

        contactPage.checkSupportPageIsOpen();
    }

}


