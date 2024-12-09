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
                    .openBasketWithOurGoods()
                    .nameBasketItem1()
                    .parsSizeBasketItem1();
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

    }
//    @DisplayName("Проверка размера 1-го товара")
//    @Test
//    void test03() {
//        items
//                .parsSizeBasketItem1();
//
//
//    }
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
                    .openBasketWithOurGoods()
                    .nameBasketItem2()
                    .parsSizeBasketItem2();
        });
        step("Проверка названия товара 2", () -> {
            String item2Name = items.getItem2Name();
            String basketItem2Name = items.getBasketNameItem2();
            assertTrue(item2Name.contains(basketItem2Name));

            System.out.println(items.getItem2Name());
            System.out.println(items.getBasketNameItem2());
        });
        step("Проверка размера 1-го товара", () -> {
            String item2Size = items.getItemName();
            String basketItemSize = items.getSizeBasketItem2();
            assertTrue(item2Size.contains(basketItemSize));

            System.out.println(items.getItemName());
            System.out.println(items.getSizeBasketItem2());
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
                    .openBasketWithOurGoods()
                    .nameBasketItem3();
        });
        step("Проверка названия товара 3", () -> {
            String item3Name = items.getItem3Name();
            String basketItemName = items.getBasketNameItem3();
            assertTrue(item3Name.contains(basketItemName));

            System.out.println(items.getItem3Name());
            System.out.println(items.getBasketNameItem3());
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

        System.out.print(items.getCountItems());
        System.out.print(items.getItemsBasketCount());
    });
    }
//    @DisplayName("5. Проверка по названию")
//    @Test
//    void test05() {
//        step("Проверка названий товара", () -> {
//         //   assertEquals(itemsInBasket.getTitleOfItems(), itemsInBasket.getTitleOfItemInBasket());
//            System.out.print(itemsInBasket.getTitleOfItems());
//            System.out.print(itemsInBasket.getTitleOfItemInBasket());
//        });
//    }
//    @DisplayName("6. Проверка размера")
//    @Test
//    void test06() {
//        step("Проверка размера", () -> {
//         //   assertEquals(itemsInBasket.getSizeItem1(), itemsInBasket.checkSizeItem1());
//            System.out.print(itemsInBasket.getSizeItem1());
//            System.out.print(itemsInBasket.checkSizeItem1());
//        });
//    }
}
