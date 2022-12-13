package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.RegistrationPage;

public class RegistrationPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    @Tag("checkRegistrationRedirect")
    @Tag("RegistrationPageTests")
    @DisplayName("Проверка срабатывания кнопки регистрации")
    void checkThatRegistrationButtonRedirectToNewPage() {

        mainPage.openPage()
                .clickOnRegistrationButton();

        registrationPage.checkRegistrationPageIsOpen();
    }
}
