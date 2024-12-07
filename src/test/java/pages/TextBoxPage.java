package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v116.network.Network.clearBrowserCookies;

public class TextBoxPage {
    SelenideElement
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
        chooseKindCategory3 = $("[title='Аксессуары']"),
        chooseTypeGoods3 = $("[title='Наручные часы']"),
        getGoods3 = $("[title='Хэмптон AX2104']"),
        openBasket = $("[data-selector='basket-desktop']");

    @DisplayName("Выборка товаров")
    public TextBoxPage openWebSite() {
        open("/");
        clearBrowserCookies();
        return this;
    }

    public TextBoxPage getCatalogy() {
        selectCatalogy.click();
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
    public TextBoxPage selectKindCategory3() {
        chooseKindCategory3.hover();
        return this;
    }
    public TextBoxPage selectTypeGoods3() {
        chooseTypeGoods3.click();
        return this;
    }
    public TextBoxPage selectGoods3() {
        getGoods3.click();
        return this;
    }

    @DisplayName("Открываем корзину с нашими товарами")
    public TextBoxPage openBasketWithOurGoods() {
        openBasket.click();
        return this;
    }
}
