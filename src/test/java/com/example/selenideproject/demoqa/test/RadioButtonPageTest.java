package com.example.selenideproject.demoqa.test;

import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.RadioButtonPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class RadioButtonPageTest implements SelenideConfig {
    private static RadioButtonPage radioButtonPage;

    @BeforeAll
    public static void beforeAll() {
        open("/radio-button");
        radioButtonPage = new RadioButtonPage();
    }

    @Test
    public void radioButtonPageTest() {
        radioButtonPage.clickYesRadio();
        radioButtonPage.verifyResult("You have selected Yes");

        radioButtonPage.clickImpressiveRadio();
        radioButtonPage.verifyResult("You have selected Impressive");

        radioButtonPage.clickNoRadio();
        radioButtonPage.verifyResult("You have selected ");
    }
}
