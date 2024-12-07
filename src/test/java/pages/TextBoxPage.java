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
        chooseSizeSnikers1 = $("[data-aspect-name='37.5']"),
        addToBasket = $("[title='Добавить в корзину']");

    @DisplayName("Выборка товаров")

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

}
