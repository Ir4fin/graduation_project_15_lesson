package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.ContactPage;
import pages.MainPage;

public class ContactPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    ContactPage contactPage = new ContactPage();

    @Test
    @Tag("contactPageTests")
    @Tag("HelpCentreTest")
    @DisplayName("Проверка функционала отправления заявки на обратную связь без совершенного логина в систему")
    void checkContactPageWithoutLogin() {

        mainPage.openPage()
                .clickOnSupportButton();

        contactPage.checkSupportPageIsOpen()
                .clickOnContinueWithoutAnAccount()
                .checkBookingDetailPageIsOpen();
    }
}
