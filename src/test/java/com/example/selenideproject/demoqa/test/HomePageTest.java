package com.example.selenideproject.demoqa.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.HomePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class HomePageTest implements SelenideConfig {

    private static HomePage homePage;

    @BeforeAll
    public static void beforeAll() {
        Selenide.open("/");
        homePage = new HomePage();
    }

    @Test
    public void elementsCardClickTest() {
        homePage.clickElementsCard();
        Selenide.$("#app").shouldHave(Condition.text("Elements"));
    }

    @Test
    public void formCardClickTest() {
        homePage.clickFormsCard();
        Selenide.$("#app").shouldHave(Condition.text("Forms"));
    }

    @Test
    public void BookStoreApplicationCardClickTest() {
        homePage.clickBookStoreCard();
        Selenide.$("#app").shouldHave(Condition.text("Book Store Application"));
    }
}
