package com.example.selenideproject.demoqa.test.elements;

import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.ButtonsPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class ButtonsPageTest implements SelenideConfig {
    private static ButtonsPage buttonsPage;

    @BeforeAll
    public static void beforeAll() {
        buttonsPage = new ButtonsPage();
        buttonsPage.open();
    }

    @Test
    public void buttonsPageTest() {
        buttonsPage.clickDoubleClickMeButton();
        buttonsPage.verifyResultDoubleClick("You have done a double click");

        buttonsPage.clickRightClickMeButton();
        buttonsPage.verifyResultRightClick("You have done a right click");

        buttonsPage.clickMeButton();
        buttonsPage.verifyResultClick("You have done a dynamic click");
    }

}
