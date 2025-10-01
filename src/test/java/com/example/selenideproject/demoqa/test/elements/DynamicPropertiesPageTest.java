package com.example.selenideproject.demoqa.test.elements;

import com.codeborne.selenide.Selenide;
import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.DynamicPropertiesPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DynamicPropertiesPageTest implements SelenideConfig {
    private static DynamicPropertiesPage dynamicPropertiesPage;

    @BeforeAll
    public static void beforeAll() {
        dynamicPropertiesPage = new DynamicPropertiesPage();
        dynamicPropertiesPage.open();
    }

    @Test
    public void dynamicPropertiesPageTest() {
        Selenide.sleep(5000);
        dynamicPropertiesPage.verifyEnableButton();
        dynamicPropertiesPage.verifyColorChangeButton();
        dynamicPropertiesPage.verifyVisibleButton();
    }
}
