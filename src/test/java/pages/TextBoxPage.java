package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    SelenideElement
        chooseCatalogy = $("[data-selector='header-rubrics-toggler-desktop']"),
        chooseKindCategory = $("[title='Обувь']"),
        chooseTypeGoods1 = $("[title='Кроссовки и кеды']"),
        chooseGoods1 = $("[title='Nike Air Max 1 Corduroy Baltic Blue']"),
        chooseSizeSnikers1 = $("[title='Размер (EU/US): 37.5']"),
        addToBasket = $("[title='Добавить в корзину']"),
        openBasker = $("[data-selector='basket-desktop']"),
        chooseKindGoods2 = $("[title='Женщинам']"),
        chooseTypeGoods2 = $("[title='Куртки']"),
        chooseGoods2 = $("[title='Adidas Parka Coats Men']"),
        chooseSizeJacket = $("[title='Размер: XL']");

    @DisplayName("Выборка товаров")
    public TextBoxPage openWebSite() {
        open("/");
        return this;
    }

    public TextBoxPage selectCatalogy() {
        chooseCatalogy.click();
        return this;
    }
    public TextBoxPage selectKindCategory() {
        chooseKindCategory.click();
        return this;
    }
    public TextBoxPage selectTypeGoods1() {
        chooseTypeGoods1.click();
        return this;
    }
    public TextBoxPage selectGoods1() {
        chooseGoods1.click();
        return this;
    }
    public TextBoxPage selectSizeSnikers1() {
        chooseSizeSnikers1.click();
        return this;
    }
    public TextBoxPage addGoodsToBasket() {
        addToBasket.click();
        return this;
    }
    public TextBoxPage selectKindGategory2() {
        chooseKindGoods2.click();
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

    @DisplayName("Открываем корзину")
    public TextBoxPage openBasketWithOurGoods() {
        openBasker.click();
        return this;
    }
}
