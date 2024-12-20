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
    @DisplayName("Открытие карточки товара")
    @Test
    void test02() {
        step("Отображение карточки товара", () -> {
            specsItems
                    .getCatalogy()
                    .getCategory1()
                    .getItem1()
                    .nameItem1()
                    .scrollSpec()
                    .parsSpecsColor()
                    .parsSpecsSize()
                    .parsSpecsBrend();
        });
        step("Проверка характеристики цвета товара", () -> {
            String itemColor = specsItems.getItemName();
            String itemSpecColor = specsItems.getSpecColor();
            assertTrue(itemColor.contains(itemSpecColor));

            System.out.println(specsItems.getItemName());
            System.out.println(specsItems.getSpecColor());
        });

        step("Проверка характеристики бренда товара", () -> {
            String itemBrend = specsItems.getItemName();
            String itemSpecBrend = specsItems.getSpecBrend();
            assertTrue(itemBrend.contains(itemSpecBrend));

            System.out.println(specsItems.getItemName());
            System.out.println(specsItems.getSpecBrend());
        });
        step("Проверка характеристики размера товара", () -> {
            String itemSize = specsItems.getItemName();
            String itemSpecSize = specsItems.getSpecSize();
            assertTrue(itemSize.contains(itemSpecSize));

            System.out.println(specsItems.getItemName());
            System.out.println(specsItems.getSpecSize());
        });
    }
}
