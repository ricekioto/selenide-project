package com.example.selenideproject.tests;

import com.example.selenideproject.config.SelenideConfig;
import com.example.selenideproject.pages.BookStoreApplicationPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BookStoreApplicationPageTest implements SelenideConfig {
    @Test
    public void bookStoreApplicationPageClickTest() {
        open("/");
        BookStoreApplicationPage bookStoreApplicationPage = new BookStoreApplicationPage();
        bookStoreApplicationPage.open();
        $("#app").shouldHave(text("Book Store Application"));
    }
}
