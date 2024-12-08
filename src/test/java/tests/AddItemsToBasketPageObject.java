package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddItemsToBasketPageObject extends TestBase{
    TextBoxPage openWebPage = new TextBoxPage();
    TextBoxPage addItem = new TextBoxPage();
    TextBoxPage itemsInBasket = new TextBoxPage();


    @DisplayName("1. Открытие Web-сайта")
    @Test
    void test01() {
        step("Открытие сайта", () -> {
            openWebPage
                    .openWebSite();
        });
    }
    @DisplayName("2. Добавление товаров в корзину")
    @Test
    void test02() {
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
        step("Добавление через каталог 3-го товара в корзину", () -> {
            addItem
                    .getCatalogy()
                    .getCategory3()
                    .getItem3()
                    .addItemToBasket();
        });

    }
    @DisplayName("3. Открытие корзины")
    @Test
    void test03() {
        itemsInBasket.openBasketWithOurGoods();

    }
    @DisplayName("4. Проверка по кол-ву товара в корзине")
    @Test
    void test04() {
    step("Проверка количества товара в корзине", () -> {
        assertEquals(
                itemsInBasket.countItems(),
                itemsInBasket.countItemsBasket());
        System.out.print(itemsInBasket.countItems());
        System.out.print(itemsInBasket.countItemsBasket());
    });
    }
    @DisplayName("5. Проверка по названию")
    @Test
    void test05() {
        step("Проверка названий товара", () -> {
            assertEquals(itemsInBasket.getTitleOfItems(), itemsInBasket.getTitleOfItemInBasket());
            System.out.print(itemsInBasket.getTitleOfItems());
            System.out.print(itemsInBasket.getTitleOfItemInBasket());
        });
    }
}
