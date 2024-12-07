package tests;

import org.junit.jupiter.api.BeforeAll;
import com.codeborne.selenide.Configuration;


public class TestBase {
    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://navisale.ru";
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy="normal";
    }
}
