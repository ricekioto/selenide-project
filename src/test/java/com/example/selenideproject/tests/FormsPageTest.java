package com.example.selenideproject.tests;

import com.example.selenideproject.config.SelenideConfig;
import com.example.selenideproject.pages.FormsPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class FormsPageTest implements SelenideConfig {
    @Test
    public void formPageClickTest() {
        open("/");
        FormsPage formsPage = new FormsPage();
        formsPage.open();
        $(By.xpath("//div[@id='app']")).shouldHave(text("Forms"));
    }
}
