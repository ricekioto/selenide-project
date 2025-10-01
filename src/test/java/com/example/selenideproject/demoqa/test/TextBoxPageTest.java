package com.example.selenideproject.demoqa.test;

import com.codeborne.selenide.Selenide;
import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.TextBoxPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TextBoxPageTest implements SelenideConfig {
    private static TextBoxPage textBoxPage;

    @BeforeAll
    public static void beforeAll() {
        textBoxPage = new TextBoxPage();
        Selenide.open("/text-box");
    }

    @Test
    public void textBoxPageTest() {
        String fullName = "Alex";
        String email = "alex@gmail.com";
        String currentAddress = "street 90";
        String permanentAddress = "street 32";

        textBoxPage.enterFullName(fullName);
        textBoxPage.enterEmail(email);
        textBoxPage.enterCurrentAddress(currentAddress);
        textBoxPage.enterPermanentAddress(permanentAddress);

        textBoxPage.submitButtonClick();

        textBoxPage.verifyOutput("Name:" + fullName);
        textBoxPage.verifyOutput("Email:" + email);
        textBoxPage.verifyOutput("Current Address :" + currentAddress);
        textBoxPage.verifyOutput("Permananet Address :" + permanentAddress);
    }
}
