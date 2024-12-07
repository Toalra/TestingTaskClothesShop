package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v116.network.Network.clearBrowserCookies;

public class TextBoxPage {
    SelenideElement
        selectCatalogy = $("#rubrics-toggle"),
        selectCategory1 = $("[data-idx='0']"), //Мужчины
        selectItem1 = $("div .rubrics-items-grid").$(".product-listing-card", 3), //выбор товара
        selectItemSize1 = $("[data-selector='options-group:root']")
                .$(".options-group__list").$(".options-group__list-item", 2), //размер
        addToBasket = $("[title='Добавить в корзину']"),
        openBasker = $("[data-selector='basket-desktop']"),
        chooseKindGoods2 = $("[title='Женщинам']"),
        chooseTypeGoods2 = $("[title='Куртки']"),
        chooseGoods2 = $("[title='Adidas Parka Coats Men']"),
        chooseSizeJacket = $("[title='Размер: XL']"),
        chooseKindCategory3 = $("[title='Аксессуары']"),
        chooseTypeGoods3 = $("[title='Наручные часы']"),
        choosGoods3 = $("[title='Хэмптон AX2104']");

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
    public TextBoxPage getCategory1() {
        selectCategory1.click();
        return this;
    }
    public TextBoxPage getItem1() {
        selectItem1.click();
        return this;
    }
    public TextBoxPage getSizeItem1() {
        selectItemSize1.click();
        return this;
    }
    public TextBoxPage addGoodsToBasket() {
        addToBasket.click();
        return this;
    }
    public TextBoxPage selectKindGategory2() {
        chooseKindGoods2.hover();
        return this;
    }
    public TextBoxPage selectTypeGoods2() {
        chooseTypeGoods2.click();
        return this;
    }
    public TextBoxPage selectGoods2() {
        chooseGoods2.click();
        return this;
    }
    public TextBoxPage selectSizeJacket() {
        chooseSizeJacket.click();
        return this;
    }
    public TextBoxPage selectKindCategory3() {
        chooseKindCategory3.hover();
        return this;
    }
    public TextBoxPage selectTypeGoods3() {
        chooseTypeGoods3.click();
        return this;
    }
    public TextBoxPage selectGoods3() {
        choosGoods3.click();
        return this;
    }

    @DisplayName("Открываем корзину с нашими товарами")
    public TextBoxPage openBasketWithOurGoods() {
        openBasker.click();
        return this;
    }
}
