package pages;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.devtools.v116.network.Network.clearBrowserCookies;

public class TextBoxPage {
    String itemName;
    String itemBasketName;
    String sizeBasketItem1;
    String itemSpecColor;
    String itemSpecSize;
    String itemSpecBrend;
    String item2BasketName;
    String item2Name;
    String sizeBasketItem2;
    String item3Name;
    String item3BasketName;
    String item3BasketColor;
    String itemsCount;
    String itemsBasketCount;
    String price1;
    String price3;
    String priceBasketItem1;
    String priceBasketItem2;
    String priceBasketItem3;
    SelenideElement
            scrollElement = $(".card-product-layout__area-content"),
            catalogy = $(".container mega-burger__inner"),
            selectCatalogy = $("#rubrics-toggle"),
    //1 товар
            selectCategory1 = $("[data-idx='0']"), //Мужчины
            selectItem1 = $("div .rubrics-items-grid").$(".product-listing-card", 3), //выбор товара
            selectSizeItem1 = $("[data-selector='options-group:root']")
                    .$(".options-group__list").$(".options-group__list-item", 0), //размер
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

    //ПРОВЕРКИ
    //Количество
            checkCountItems = $(".toolbar-item__bage"),
            checkCountItemsBasket = $(".basket-summary__btn-more").$(".js-more"),
    //Размеры
            checkInBasketSizeItem1 = $(".group-items__content") //размер 1-го товара в корзине
                    .$(".cart-item-default", 0)
                    .$(".cart-item-default__area-content")
                    .$(".cart-item-default__props")
                    .$(".cart-item-default__props-item", 0),
            checkInBasketSizeItem2 = $(".group-items__content") //размер 2-го товара в корзине
                    .$(".cart-item-default", 1)
                    .$(".cart-item-default__area-content")
                    .$(".cart-item-default__props")
                    .$(".cart-item-default__props-item", 0),

    //Цвет
            checkColorItem3 = $(".group-items__content") //цвет 3-го товара в корзине
                    .$(".cart-item-default").$(".cart-item-default__area-content")
                    .$(".cart-item-default__props"),


    //Названия товаров
            findTitleOfItem = $("#name"), //название на товаре
            checkTitleOfItem1 = $(".js-items").$(".cart-item-default", 0)
                     .$(".cart-item-default__title"), //название 1-го в корзине
            checkTitleOfItem2 = $(".js-items").$(".cart-item-default", 0)
                     .$(".cart-item-default__title"), //название 2-го в корзине
            checkTitleOfItem3 = $(".js-groups").$(".group-items", 0)
                     .$(".group-items__content").$(".cart-item-default")
                     .$(".cart-item-default__area-content").$(".cart-item-default__title"),
    //Цена
            checkPrice = $(".price__regular"),
            checkBasketPriceItem1 = $(".basket__block-groups").$(".group-items", 1)
                    .$(".group-items__content").$(".cart-item-default", 0)
                    .$(".cart-item-default__area-price").$(".cart-item-default__price"),
            checkBasketPriceItem2 = $(".basket__block-groups").$(".group-items", 1)
                    .$(".group-items__content").$(".cart-item-default", 1)
                    .$(".cart-item-default__area-price").$(".cart-item-default__price"),
            checkBasketPriceItem3 = $(".basket__block-groups").$(".group-items", 0)
                    .$(".group-items__content").$(".cart-item-default")
                    .$(".cart-item-default__area-price"),

    //Характеристики

            specsItemColor = $(".card-product-layout__block-parameters")
                    .$(".parameters-list-group", 2)
                    .$(".parameters-list")
                    .$("parameters-list__item")
                    .$(".parameters-list__detail"),
            specsItemSize = $(".card-product-layout__content-col-tabs")
                    .$(".card-product-layout__block-parameters")
                    .$(".parameters-list-group", 1)
                    .$(".parameters-list")
                    .$("parameters-list__item")
                    .$(".parameters-list__detail"),
            specsItemBrend = $(".card-product-layout__content-col-tabs")
                    .$(".card-product-layout__block-parameters")
                    .$(".parameters-list-group", 0)
                    .$(".parameters-list")
                    .$(".parameters-list__item", 2)
                    .$(".parameters-list__detail");


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
    public TextBoxPage clickSizeItem1() {
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
    @DisplayName("Парсинг названия 1-го товара")
    public TextBoxPage nameItem1() {
        itemName = findTitleOfItem.getText();
        return this;
    }
    public String getItemName() {
        return itemName;
    }
    @DisplayName("Парсинг названия 1-го товара в корзине")
    public TextBoxPage nameBasketItem1() {
        itemBasketName = checkTitleOfItem1.getText();
        itemBasketName.equals(itemName);
        return this;
    }
    public String getBasketNameItem1() {
        return itemBasketName;
    }

    //Размер 1-го товара
    public TextBoxPage parsSizeBasketItem1() {
        sizeBasketItem1 = checkInBasketSizeItem1.getText();
        return this;
    }
    public String getSizeBasketItem1() {
        return sizeBasketItem1;
    }
    //Цена
    public TextBoxPage parsBasketPrizeItem1() {
        priceBasketItem1 = checkBasketPriceItem1.getText();
        return this;
    }
    public String getPriceBasketItem1() {
        return priceBasketItem1;
    }
    @DisplayName("Парсинг цены 1-го товара")
    public TextBoxPage priceItem1() {
        price1 = checkPrice.getText();
        return this;
    }
    public String getPriceItem1() {
        return price1;
    }
    @DisplayName("Парсинг характеристик Цвет")
    public TextBoxPage parsSpecsColor() {
        itemSpecColor = specsItemColor.getText();
        return this;
    }
    public String getSpecColor() {
        return itemSpecColor;
    }
    public TextBoxPage scrollSpec() {
        scrollElement.scrollTo();
        return this;
    }

    @DisplayName("Парсинг характеристик Размер")
    public TextBoxPage parsSpecsSize() {
        itemSpecColor = specsItemSize.getText();
        return this;
    }
    public String getSpecSize() {
        return itemSpecColor;
    }


//------------------------------------------------------------------------------------
    @DisplayName("Парсинг названия 2-го товара")
    public TextBoxPage nameItem2() {
        item2Name = findTitleOfItem.getText();
        return this;
    }
    public String getItem2Name() {
        return item2Name;
    }
    @DisplayName("Парсинг названия 2-го товара в корзине")
    public TextBoxPage nameBasketItem2() {
        item2BasketName = checkTitleOfItem2.getText();
        item2BasketName.equals(item2Name);
        return this;
    }
    public String getBasketNameItem2() {
        return item2BasketName;
    }
    //Размер 2-го товара
    public TextBoxPage parsSizeBasketItem2() {
        sizeBasketItem2 = checkInBasketSizeItem2.getText();
        return this;
    }
    public String getSizeBasketItem2() {
        return sizeBasketItem2;
    }
    //Цена
    @DisplayName("Парсинг цены 2-го товара")
    public TextBoxPage priceItem2() {
        price3 = checkPrice.getText();
        return this;
    }
    public String getPriceItem2() {
        return price3;
    }
    public TextBoxPage parsBasketPrizeItem2() {
        priceBasketItem2 = checkBasketPriceItem2.getText();
        return this;
    }
    public String getPriceBasketItem2() {
        return priceBasketItem2;
    }
//--------------------------------------------------------------
    @DisplayName("Парсинг названия 3-го товара")
    public TextBoxPage nameItem3() {
        item3Name = findTitleOfItem.getText();
        return this;
    }
    public String getItem3Name() {
        return item3Name;
    }
    @DisplayName("Парсинг названия 3-го товара из корзины")
    public TextBoxPage nameBasketItem3() {
        item3BasketName = checkTitleOfItem3.getText();
        return this;
    }
    public String getBasketNameItem3() {
        return item3BasketName;
    }

    @DisplayName("Парсинг цвета 3-го товара из корзины")
    public TextBoxPage colorBasketItem3() {
        item3BasketColor = checkColorItem3.getText();
        return this;
    }
    public String getItem3Color() {
        return item3BasketColor;
    }
    //Цена
    @DisplayName("Парсинг цены 3-го товара")
    public TextBoxPage priceItem3() {
        price3 = checkPrice.getText();
        return this;
    }
    public String getPriceItem3() {
        return price3;
    }
    public TextBoxPage parsBasketPrizeItem3() {
        priceBasketItem3 = checkBasketPriceItem3.getText();
        return this;
    }
    public String getPriceBasketItem3() {
        return priceBasketItem3;
    }
//--------------------------------------------------------------------------------------
    @DisplayName("Парсинг кол-ва товара")
    public TextBoxPage countItems() {
        itemsCount = checkCountItems.getText();
        return this;
    }
    public String getCountItems() {
        return itemsCount;
    }
    @DisplayName("Парсинг кол-ва товара в корзине")
    public TextBoxPage countItemsBasket() {
        itemsBasketCount = checkCountItemsBasket.getText();
        return this;
    }
    public String getItemsBasketCount() {
        return itemsBasketCount;
    }
}
