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
                    .getCatalogy()
                    .getCategory1()
                    .getItem1()
                    .getSizeItem1()
                    .addItemToBasket();
        });

        step("Добавление через каталог 2-го товара в корзину", () -> {
            addItem
                    .getCatalogy()
                    .getGategory2()
                    .getItem2()
                    .getSizeItem2()
                    .addItemToBasket();
        });
//        step("Добавление через каталог 3-го товара в корзину", () -> {
//            addItem.selectCatalogy()
//                    .selectKindCategory3()
//                    .selectTypeGoods3()
//                    .selectGoods3()
//                    .addGoodsToBasket();
//        });
    }
}
