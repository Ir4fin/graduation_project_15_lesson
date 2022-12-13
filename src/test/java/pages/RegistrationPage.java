package pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    private final static String TEXT_ON_REGISTRATION_RU = "Войдите или создайте аккаунт";

    @Step("Проверяем, что открылась страница регистрации")
    public RegistrationPage checkRegistrationPageIsOpen() {
        $(".bui_font_display_two").should(visible);
        $(".bui_font_display_two").shouldHave(text(TEXT_ON_REGISTRATION_RU));

        return this;
    }
}
