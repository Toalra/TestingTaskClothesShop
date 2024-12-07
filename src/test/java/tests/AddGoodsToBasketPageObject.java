package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class AddGoodsToBasketPageObject extends TestBase{
    TextBoxPage openWebPage = new TextBoxPage();
    TextBoxPage addItem = new TextBoxPage();


    @Test
    void openWeb() {
        step("Открытие сайта", () -> {
            openWebPage.openWebSite();
        });
    }
    @DisplayName("Добавление товаров в корзину")
    @Test
    void setAddSnikers() {
        step("Открытие каталога с 1-ым товаром и добавление в корзину", () -> {
            addItem.selectCatalogy()
                    .selectKindCategory()
                    //.selectTypeGoods1()
                    .selectGoods1()
                    .selectSizeSnikers1()
                    .addGoodsToBasket();
        });
        step("Открытие каталога с 2-ым товаром и добавление в корзину", () -> {
            addItem.selectCatalogy()
                    .selectKindGategory2()
                    .selectTypeGoods2()
                    .selectGoods2()
                    .selectSizeJacket()
                    .addGoodsToBasket();
        });
        step("Открытие каталога с 3-им товаром и добавление в корзину", () -> {
            addItem.selectCatalogy();
        });
    }

}
