package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ContactPage {

    private final static String TEXT_ON_SUPPORT_PAGE_RU = "Добро пожаловать в Центр поддержки";
    private final static String BOOKING_DETAIL_INPUT_ON_SUPPORT_PAGE_RU = "Ввод деталей бронирования";

    @Step("Проверяем, что открылась страница Центра поддержки")
    public ContactPage checkSupportPageIsOpen() {
        $(".f8391587e4").should(visible);
        $(".f8391587e4").shouldHave(text(TEXT_ON_SUPPORT_PAGE_RU));

        return this;
    }

    @Step("Нажимаем 'Продолжить без регистрации'")
    public ContactPage clickOnContinueWithoutAnAccount() {
        $(".fc63351294.a822bdf511.e3c025e003").click();

        return this;
    }

    @Step("Проверяем, что открылась страница 'Ввод деталей бронирования'")
    public ContactPage checkBookingDetailPageIsOpen() {
        $("#maincontent").should(visible);
        $("#maincontent").shouldHave(text(BOOKING_DETAIL_INPUT_ON_SUPPORT_PAGE_RU));

        return this;
    }
}
