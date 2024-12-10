package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.Selenide.refresh;
import static com.codeborne.selenide.logevents.SelenideLogger.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpecificationsItemsPageOpject extends TestBase {
    TextBoxPage openWebPage = new TextBoxPage();
    TextBoxPage specsItems = new TextBoxPage();

    @DisplayName("1. Открытие Web-сайта")
    @Test
    void test01() {
        step("Открытие сайта", () -> {
            openWebPage
                    .openWebSite();
            refresh();
        });
    }

    @DisplayName("1. Открытие карточки 1-го товара")
    @Test
    void test02() {
        step("Отобржение карточки 1-го товара", () -> {
            specsItems
                    .getCatalogy()
                    .getCategory1()
                    .getItem1()
                    .nameItem1()
                    .scrollSpec()
                    .parsSpecsColor();
        });
        step("Проверка характеристики цвета 1-го товара", () -> {

            String itemColor = specsItems.getItemName();
            String itemSpecColor = specsItems.getSpecColor();
            assertTrue(itemColor.contains(itemSpecColor));

            System.out.println(specsItems.getItemName());
            System.out.println(specsItems.getSpecColor());
        });
    }
}
