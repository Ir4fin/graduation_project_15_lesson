package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class SearchResultsPage {
    private final static String TEXT_ON_SEARCH_RU = "Результаты поиска";

    @Step("Вводим текст в инпут на странице с результатами поиска и нажимаем 'Найти'")
    public SearchResultsPage putNewDestinationToInputOnResultPage(String newDestination) {
        $(".ce45093752").sendKeys(Keys.CONTROL + "A");
        $(".ce45093752").sendKeys(Keys.BACK_SPACE);
        $(".ce45093752").setValue(newDestination);
        $(".e57ffa4eb5").click();

        return this;
    }

    @Step("Проверяем, что открылась страница с результатам поиска")
    public SearchResultsPage checkResultPageIsOpenAndHasContent() {
        $("#searchresultsTmpl").should(visible);
        $("a[aria-current='location']").shouldHave(text(TEXT_ON_SEARCH_RU));

        return this;
    }


}
