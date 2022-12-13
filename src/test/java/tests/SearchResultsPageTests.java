package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.MainPage;
import pages.SearchResultsPage;

import java.util.Locale;

public class SearchResultsPageTests extends TestBase {

    MainPage mainPage = new MainPage();
    SearchResultsPage searchResultsPage = new SearchResultsPage();

    Faker faker = new Faker(new Locale("en"));


    @Test
    @Tag("SearchResultsPageTests")
    @Tag("Second search from result page")
    @DisplayName("Проверка поиска нового места назначения со страницы с результатами для другого поиска")
    void simpleSearchFromResultPage() {
        String destinationName = faker.address().country();
        String newDestination = faker.address().country();

        mainPage.openPage()
                .putTextToInputOnMainPage(destinationName)
                .clickOnSearchButton();

        searchResultsPage.checkResultPageIsOpenAndHasContent()
                .putNewDestinationToInputOnResultPage(newDestination)
                .checkResultPageIsOpenAndHasContent();
    }
}
