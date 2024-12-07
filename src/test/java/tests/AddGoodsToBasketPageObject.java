package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class AddGoodsToBasketPageObject extends TestBase{
    TextBoxPage openWebPage = new TextBoxPage();
    TextBoxPage addSnikers = new TextBoxPage();


    @Test
    void openWeb() {
        step("Открытие сайта", () -> {
            openWebPage()
        });
    }
    @DisplayName("Добавление 1-го товара в корзину")
    @Test
    void setAddSnikers() {
        step("Открытие каталога с 1-ым товаром и добавление в корзину", () -> {
            addSnikers.selectCatalogy()
                    .selectKindCategory()
                    .selectTypeGoods1()
                    .selectGoods1()
                    .selectSizeSnikers1()
                    .addGoodsToBasket();
        });
    }

}
