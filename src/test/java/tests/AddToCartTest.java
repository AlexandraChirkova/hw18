package tests;

import org.junit.jupiter.api.Test;
import pages.CatalogPage;
import pages.MainPage;

public class AddToCartTest extends BaseTest {

    MainPage mainPage = new MainPage();
    CatalogPage catalogPage = new CatalogPage();


    @Test
    public void addProductToCartTest() {
        mainPage.openPage()
                .searchQuery("Смартфон");
        catalogPage.selectFirstProduct();


    }
}
