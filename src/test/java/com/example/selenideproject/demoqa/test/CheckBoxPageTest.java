package com.example.selenideproject.demoqa.test;

import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.CheckBoxPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class CheckBoxPageTest implements SelenideConfig {
    private static CheckBoxPage checkBoxPage;

    @BeforeAll
    public static void beforeAll() {
        open("/checkbox");
        checkBoxPage = new CheckBoxPage();
    }

    @Test
    public void checkBoxPageTest() {
        checkBoxPage.clickbuttonExpendAll();

        checkBoxPage.clickAngularSelector();
        checkBoxPage.clickGeneralSelector();
        checkBoxPage.clickNotesSelector();

        checkBoxPage.verifyResult("You have selected : notes angular general");
    }
}
