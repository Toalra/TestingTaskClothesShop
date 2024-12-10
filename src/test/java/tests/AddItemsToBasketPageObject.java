package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static org.junit.jupiter.api.Assertions.*;

public class AddItemsToBasketPageObject extends TestBase{
    TextBoxPage openWebPage = new TextBoxPage();
    TextBoxPage items = new TextBoxPage();

    @DisplayName("1. Открытие Web-сайта")
    @Test
    void test01() {
        step("Открытие сайта", () -> {
            openWebPage
                    .openWebSite();
            refresh();
        });
    }
    @DisplayName("2. Добавление 1-го товара в корзину")
    @Test
    void test02() {
        step("Добавление через каталог 1-го товара в корзину", () -> {
            items
                    .getCatalogy()
                    .getCategory1()
                    .getItem1()
                    .clickSizeItem1()
                    .addItemToBasket()
                    .nameItem1()
                    .priceItem1()
                    .openBasketWithOurGoods()
                    .nameBasketItem1()
                    .parsSizeBasketItem1()
                    .parsBasketPrizeItem1();
        });
        step("Проверка названия товаров", () -> {

            String itemName = items.getItemName();
            String basketItemName = items.getBasketNameItem1();
            assertTrue(itemName.contains(basketItemName));

            System.out.println(items.getItemName());
            System.out.println(items.getBasketNameItem1());
        });
        step("Проверка размера 1-го товара", () -> {
            String itemSize = items.getItemName();
            String basketItemSize = items.getSizeBasketItem1();
            assertTrue(itemSize.contains(basketItemSize));

            System.out.println(items.getItemName());
            System.out.println(items.getSizeBasketItem1());
        });
        step("Проверка цены 1-го товара", () -> {
            String itemsPrice = items.getPriceItem1();
            String basketItemsPrice = items.getPriceBasketItem1();
            assertTrue(itemsPrice.contains(basketItemsPrice));

            System.out.println(items.getPriceItem1());
            System.out.println(items.getPriceBasketItem1());
        });

    }

    @DisplayName("3. Добавление 2-го товара в корзину")
    @Test
    void test04(){
        step("Добавление через каталог 2-го товара в корзину", () -> {
            refresh();
            items
                    .getCatalogy()
                    .getGategory2()
                    .getItem2()
                    .getSizeItem2()
                    .addItemToBasket()
                    .nameItem2()
                    .priceItem2()
                    .openBasketWithOurGoods()
                    .nameBasketItem2()
                    .parsSizeBasketItem2()
                    .parsBasketPrizeItem2();
        });
        step("Проверка названия товара 2", () -> {
            String item2Name = items.getItem2Name();
            String basketItem2Name = items.getBasketNameItem2();
            assertTrue(item2Name.contains(basketItem2Name));

            System.out.println(items.getItem2Name());
            System.out.println(items.getBasketNameItem2());
        });
        step("Проверка размера 2-го товара", () -> {
            String item2Size = items.getItem2Name();
            String basketItemSize = items.getSizeBasketItem2();
            assertTrue(item2Size.contains(basketItemSize));

            System.out.println(items.getItem2Name());
            System.out.println(items.getSizeBasketItem2());
        });
        step("Проверка цены 2-го товара", () -> {
            String itemsPrice = items.getPriceItem2();
            String basketItemsPrice = items.getPriceBasketItem2();
            assertTrue(itemsPrice.contains(basketItemsPrice));

            System.out.println(items.getPriceItem2());
            System.out.println(items.getPriceBasketItem2());
        });
    }

    @DisplayName("4. Добавление 3-го товара в корзину")
    @Test
    void test05() {
        step("Добавление через каталог 3-го товара в корзину", () -> {
            refresh();
            items
                    .getCatalogy()
                    .getCategory3()
                    .getItem3()
                    .addItemToBasket()
                    .nameItem3()
                    .priceItem3()
                    .openBasketWithOurGoods()
                    .nameBasketItem3()
                    .colorBasketItem3()
                    .parsBasketPrizeItem3();
        });
        step("Проверка названия товара 3", () -> {
            String item3Name = items.getItem3Name();
            String basketItemName = items.getBasketNameItem3();
            assertTrue(item3Name.contains(basketItemName));

            System.out.println(items.getItem3Name());
            System.out.println(items.getBasketNameItem3());
        });
        step("Проверка по цвету товара 3", () -> {
            String item3Color = items.getItem3Name();
            String basketItem3Color = items.getItem3Color();
            assertTrue(item3Color.contains(basketItem3Color));

            System.out.println(items.getItem3Name());
            System.out.println(items.getItem3Color());
        });
        step("Проверка цены 3-го товара", () -> {
            String itemsPrice = items.getPriceItem3();
            String basketItemsPrice = items.getPriceBasketItem3();
            assertTrue(itemsPrice.contains(basketItemsPrice));

            System.out.println(items.getPriceItem3());
            System.out.println(items.getPriceBasketItem3());
        });

    }
    @DisplayName("5. Проверка по кол-ву товара в корзине")
    @Test
    void test06() {
    step("Парсинг кол-ва товара", () -> {
            items
                    .countItems()
                    .countItemsBasket();
        });
    step("Проверка количества товара в корзине", () -> {
        String itemsCount = items.getCountItems();
        String itemsBasketCount = items.getItemsBasketCount();
        assertTrue(itemsBasketCount.contains(itemsCount));

        System.out.println(items.getCountItems());
        System.out.println(items.getItemsBasketCount());
    });
    }
}
