package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static org.junit.jupiter.api.Assertions.*;

public class AddItemsToBasketPageObject extends TestBase{
    TextBoxPage openWebPage = new TextBoxPage();
    TextBoxPage addItem = new TextBoxPage();

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
            addItem
                    .getCatalogy()
                    .getCategory1()
                    .getItem1()
                    .getSizeItem1()
                    .addItemToBasket()
                    .nameItem1()
                    .openBasketWithOurGoods()
                    .nameBasketItem1();
        });
        step("Проверка названия товаров", () -> {

            String itemName = addItem.getItemName();
            String basketItemName = addItem.getBasketNameItem1();
            assertTrue(basketItemName.contains(itemName));

            System.out.println(addItem.getItemName());
            System.out.println(addItem.getBasketNameItem1());
        });

    }
//    @DisplayName("3. Добавление 2-го товара в корзину")
//    @Test
//    void test03(){
//        step("Добавление через каталог 2-го товара в корзину", () -> {
//            refresh();
//            addItem
//                    .getCatalogy()
//                    .getGategory2()
//                    .getItem2()
//                    .getSizeItem2()
//                    .addItemToBasket()
//                    .nameItem2()
//                    .openBasketWithOurGoods()
//                    .nameBasketItem2();
//        });
//        step("Проверка названия товара 2", () -> {
//            String item2Name = addItem.getItem2Name();
//            String basketItemName = addItem.getBasketNameItem2();
//            assertTrue(basketItemName.contains(item2Name));
//
//            System.out.println(addItem.getItem2Name());
//            System.out.println(addItem.getBasketNameItem2());
//        });
//
//    }


//    @DisplayName("3. Открытие корзины")
//    @Test
//    void test03() {
//        step("Открытие корзины", () -> {
//            addItem.openBasketWithOurGoods()
//                    .nameBasketItem1();
//        });
//        step("Проверка названия товаров", () -> {
//            String itemName = addItem.getItemName();
//            String basketItemName = addItem.getBasketItemName();
//            assertTrue(basketItemName.contains(itemName));
//
//            System.out.println(addItem.getItemName());
//            System.out.println(addItem.getBasketItemName());
//        });
//
//    }
//    @DisplayName("4. Проверка по кол-ву товара в корзине")
//    @Test
//    void test04() {
//    step("Проверка количества товара в корзине", () -> {
//        assertEquals(
//                itemsInBasket.countItems(),
//                itemsInBasket.countItemsBasket());
//        System.out.print(itemsInBasket.countItems());
//        System.out.print(itemsInBasket.countItemsBasket());
//    });
//    }
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
