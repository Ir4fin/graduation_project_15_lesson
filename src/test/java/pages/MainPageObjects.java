package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class MainPageObjects {


    private SelenideElement buttonForSearch = $("button[type='submit']"),
            inputForSearch = $("input[name='ss']"),
            buttonForRegistration = $(".js-header-login-link"),
            buttonSupport = $(".bui-button__icon");

    private final static String TEXT_ON_MAIN_RU = "Спецпредложения";
    private final static String TEXT_ON_MAIN_ENG = "Offers";
    private final static String TEXT_ON_REGISTRATION_RU = "Войдите или создайте аккаунт";
    private final static String TEXT_ON_SEARCH_RU = "найдено";
    private final static String ERROR_MESSAGE_RU = "Чтобы начать поиск, введите направление.";
    private final static String TEXT_ON_SUPPORT_PAGE_RU = "Добро пожаловать в Центр поддержки";
    private final static String BOOKING_DETAIL_INPUT_ON_SUPPORT_PAGE_RU = "Ввод деталей бронирования";

    @Step("Открываем главную страницу")
    public MainPageObjects openPage() {
        open("index.ru.html");
        $(".promo-section").shouldHave(text(TEXT_ON_MAIN_RU));

        return this;
    }

    @Step("Вводим название пункта назначения")
    public MainPageObjects putTextToInputOnMainPage(String destinationName) {
        inputForSearch.click();
        inputForSearch.sendKeys(destinationName);

        return this;
    }

    @Step("Кликаем на кнопку поиска")
    public MainPageObjects clickOnSearchButton() {
        buttonForSearch.click();

        return this;
    }

    @Step("Проверяем, что открылась страница с результатам поиска")
    public MainPageObjects checkResult() {
        $("#searchresultsTmpl").should(appear);
        $(".efdb2b543b").shouldHave(text(TEXT_ON_SEARCH_RU));

        return this;
    }

    @Step("Кликаем по иконке флага и проверяем, что открылось модальное окно с вариантами языка")
    public MainPageObjects changeLanguageModalIsAppear() {
        $(".bui-avatar__image").click();
        $(".bui-modal__inner").should(appear);

        return this;
    }

    @Step("Меняем язык")
    public MainPageObjects setAnotherLanguage(String language) {
        $(byText(language)).click();

        return this;
    }

    @Step("Проверяем, что смена языка применилась")
    public MainPageObjects checkNewLanguageIsSet() {
        $(".promo-section").shouldNotHave(text(TEXT_ON_MAIN_RU));

        return this;
    }

    @Step("Проверяем сообщение о необходимости заполнить поле ввода")
    public MainPageObjects checkValidationMessage() {
        $(byText(ERROR_MESSAGE_RU));

        return this;
    }

    @Step("Кликаем на кнопку регистрации")
    public MainPageObjects clickOnRegistrationButton() {
        buttonForRegistration.click();

        return this;
    }

    @Step("Проверяем, что открылась страница регистрации")
    public MainPageObjects checkRegistrationPageIsOpen() {
        $(".bui_font_display_two").should(appear);
        $(".bui_font_display_two").shouldHave(text(TEXT_ON_REGISTRATION_RU));

        return this;
    }

    @Step("Кликаем на кнопку саппорта")
    public MainPageObjects clickOnSupportButton() {
        buttonSupport.click();

        return this;
    }

    @Step("Проверяем, что открылась страница Центра поддержки")
    public MainPageObjects checkSupportPageIsOpen() {
        $(".f8391587e4").should(appear);
        $(".f8391587e4").shouldHave(text(TEXT_ON_SUPPORT_PAGE_RU));

        return this;
    }

    @Step("Нажимаем 'Продолжить без регистрации'")
    public MainPageObjects clickOnContinueWithoutAnAccount() {
        $(".fc63351294.a822bdf511.e3c025e003").click();

        return this;
    }

    @Step("Проверяем, что открылась страница 'Ввод деталей бронирования'")
    public MainPageObjects checkBookingDetailPageIsOpen() {
        $(".a1b3f50dcd.f7c6687c3d.e6f05e293e").should(appear);
        $(".a1b3f50dcd.f7c6687c3d.e6f05e293e").shouldHave(text(BOOKING_DETAIL_INPUT_ON_SUPPORT_PAGE_RU));

        return this;
    }

    @Step("Вводим текст в инпут на странице с результатами поиска и нажимаем 'Найти'")
    public MainPageObjects putNewDestinationToInputOnResultPage(String newDestination) {
        $(".ce45093752").sendKeys(Keys.CONTROL + "A");
        $(".ce45093752").sendKeys(Keys.BACK_SPACE);
        $(".ce45093752").sendKeys(newDestination);
        $(".e57ffa4eb5").click();

        return this;
    }

}

