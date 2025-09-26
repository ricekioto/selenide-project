package com.example.selenideproject.tests;

import com.example.selenideproject.config.SelenideConfig;
import com.example.selenideproject.pages.ElementsPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class ElementsPageTest implements SelenideConfig {
    @Test
    public void elementsPageClickTest() {
        open("/");
        ElementsPage elementsPage = new ElementsPage();
        elementsPage.open();
        $("#app").shouldHave(text("Elements"));
    }
}
