package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class AddGoodsToBasketPageObject extends TestBase{
    TextBoxPage openWebPage = new TextBoxPage();
    TextBoxPage addItem = new TextBoxPage();


    @DisplayName("Открытие Web-сайта")
    @Test
    void openWeb() {
        step("Открытие сайта", () -> {
            openWebPage
                    .openWebSite();
        });
    }
    @DisplayName("Добавление товаров в корзину")
    @Test
    void setAddSnikers() {
        step("Добавление через каталог 1-го товара в корзину", () -> {
            addItem
                    .selectCatalogy()
                    .selectKindCategory()
                    .selectTypeGoods1()
                    .selectGoods1()
                    .selectSizeSnikers1()
                    .addGoodsToBasket();
        });
        step("Добавление через каталог 2-го товара в корзину", () -> {
            addItem
                    .selectCatalogy()
                    .selectKindGategory2()
                    .selectTypeGoods2()
                    .selectGoods2()
                    .selectSizeJacket()
                    .addGoodsToBasket();
        });
        step("Добавление через каталог 3-го товара в корзину", () -> {
            addItem.selectCatalogy()
                    .selectKindCategory3()
                    .selectTypeGoods3()
                    .selectGoods3()
                    .addGoodsToBasket();
        });
    }
}
