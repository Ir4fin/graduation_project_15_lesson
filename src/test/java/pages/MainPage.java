package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {


    private SelenideElement buttonForSearch = $("button[type='submit']"),
            inputForSearch = $("input[name='ss']"),
            buttonForRegistration = $(".js-header-login-link"),
            buttonSupport = $(".bui-button__icon");

    private final static String TEXT_ON_MAIN_RU = "Спецпредложения";
    private final static String TEXT_ON_MAIN_DE = "Angebote";
    private final static String ERROR_MESSAGE_RU = "Чтобы начать поиск, введите направление.";


    @Step("Открываем главную страницу")
    public MainPage openPage() {
        open("index.ru.html");
        $(".promo-section").shouldHave(text(TEXT_ON_MAIN_RU));

        return this;
    }

    @Step("Вводим название пункта назначения")
    public MainPage putTextToInputOnMainPage(String destinationName) {
        inputForSearch.click();
        inputForSearch.sendKeys(destinationName);

        return this;
    }

    @Step("Кликаем на кнопку поиска")
    public MainPage clickOnSearchButton() {
        buttonForSearch.click();

        return this;
    }

    @Step("Кликаем по иконке флага и проверяем, что открылось модальное окно с вариантами языка")
    public MainPage changeLanguageModalIsAppear() {
        $(".bui-avatar__image").click();
        $(".bui-modal__inner").should(visible);

        return this;
    }

    @Step("Меняем язык")
    public MainPage setAnotherLanguage(String language) {
        $(byText(language)).click();

        return this;
    }

    @Step("Проверяем, что смена языка применилась")
    public MainPage checkNewLanguageIsSet() {
        $(".promo-section").shouldHave(text(TEXT_ON_MAIN_DE));

        return this;
    }

    @Step("Проверяем сообщение о необходимости заполнить поле ввода")
    public MainPage checkValidationMessage() {
        $(byText(ERROR_MESSAGE_RU));

        return this;
    }

    @Step("Кликаем на кнопку регистрации")
    public MainPage clickOnRegistrationButton() {
        buttonForRegistration.click();

        return this;
    }

    @Step("Кликаем на кнопку саппорта")
    public MainPage clickOnSupportButton() {
        buttonSupport.click();

        return this;
    }


}

