package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v116.network.Network.clearBrowserCookies;

public class TextBoxPage {
    String itemName;
    String itemBasketName;
    SelenideElement
        catalogy = $(".container mega-burger__inner"),
        selectCatalogy = $("#rubrics-toggle"),
    //1 товар
        selectCategory1 = $("[data-idx='0']"), //Мужчины
        selectItem1 = $("div .rubrics-items-grid").$(".product-listing-card", 3), //выбор товара
        selectSizeItem1 = $("[data-selector='options-group:root']")
                .$(".options-group__list").$(".options-group__list-item", 2), //размер
        addToBasket = $("[title='Добавить в корзину']"),

    //2 товар
        selectCategory2 = $("[data-idx='1']"), //Женщины
        selectItem2 = $("div .rubrics-items-grid").$(".product-listing-card", 2), //выбор товара
        selectSizeItem2 = $("[data-selector='options-group:root']")
                .$(".options-group__list").$(".options-group__list-item", 1), //размер,

    //3 товар
        selectCategory3 = $("[data-idx='4']"), //Аксессуары
        selectItem3 = $("div .rubrics-items-grid").$(".product-listing-card", 2), //выбор товара
        openBasket = $("[data-selector='basket-desktop']"),

    //Проверки
        checkCountItems = $(".toolbar-item__bage"),
        checkCountItemsBasket = $(".basket-summary__btn-more").$(".js-more"),
        findTitleOfItem = $("#name"), //название на товаре
        checkTitleOfItem = $(".cart-item-default__title"), //название в корзине
        sizeItem1 = $("[data-selector='options-group:root']")
                    .$(".options-group__list").$(".options-group__list-item", 2),//размер в корзине
        checkInBasketSizeItem1 = $(".group-items__content")
                .$(".cart-item-default", 0)
                .$(".cart-item-default__area-content", 1)
                .$(".cart-item-default__props", 0)
                .$("li", 0),
        checkInBasketSizeItem2 = $(".group-items__content");

    public TextBoxPage openWebSite() {
        open("");
        clearBrowserCookies();
        return this;
    }

    @DisplayName("Цикл, если каталог отобразился не сразу")
    public TextBoxPage getCatalogy() {
        if (!catalogy.exists()) {
            selectCatalogy.click();
        }
        return this;
    }

    //1 товар
    public TextBoxPage getCategory1() {
        selectCategory1.click();
        return this;
    }
    public TextBoxPage getItem1() {
        selectItem1.click();
        return this;
    }
    public TextBoxPage getSizeItem1() {
        selectSizeItem1.click();
        return this;
    }
    public TextBoxPage addItemToBasket() {
        addToBasket.click();
        return this;
    }

    //2 товар
    public TextBoxPage getGategory2() {
        selectCategory2.click();
        return this;
    }
    public TextBoxPage getItem2() {
        selectItem2.click();
        return this;
    }
    public TextBoxPage getSizeItem2() {
        selectSizeItem2.click();
        return this;
    }

    //3 товар
    public TextBoxPage getCategory3() {
        selectCategory3.click();
        return this;
    }
    public TextBoxPage getItem3() {
        selectItem3.click();
        return this;
    }
    @DisplayName("Открываем корзину с нашими товарами")
    public TextBoxPage openBasketWithOurGoods() {
        openBasket.click();
        return this;
    }

    //Проверки
    public TextBoxPage countItems() {
        checkCountItems.getText();
        return this;
    }
    public TextBoxPage countItemsBasket() {
        checkCountItemsBasket.getText();
        return this;
    }
    public TextBoxPage checkSizeItem1() {
        checkInBasketSizeItem1.getText();
        return this;
    }
    @DisplayName("Парсинг название товара")
    public TextBoxPage nameItem1() {
        itemName = findTitleOfItem.getText();
        return this;
    }
    public String getItemName() {
        return itemName;
    }
    @DisplayName("Парсинг названия товара в корзине")
    public TextBoxPage nameBasketItem1() {
        itemBasketName = checkTitleOfItem.getText();
        return this;
    }
    public String getBasketItemName() {
        return itemBasketName;
    }
}
