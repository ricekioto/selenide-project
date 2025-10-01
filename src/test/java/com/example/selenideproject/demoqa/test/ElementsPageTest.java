package com.example.selenideproject.demoqa.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.ElementsPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ElementsPageTest implements SelenideConfig {
    private static ElementsPage elementsPage;

    @BeforeAll
    public static void beforeAll() {
        elementsPage = new ElementsPage();
        elementsPage.open();
    }

    @Test
    public void textBoxCardClickTest() {
        elementsPage.textBoxCardClick();
        Selenide.$("#app").shouldHave(Condition.text("Forms"));
    }

    @Test
    public void checkBoxCardClickTest() {
        elementsPage.checkBoxCardClick();
        Selenide.$("#app").shouldHave(Condition.text("Check Box"));
    }
}
