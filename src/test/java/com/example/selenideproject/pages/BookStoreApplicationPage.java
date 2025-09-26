package com.example.selenideproject.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class BookStoreApplicationPage {
    SelenideElement selector = $x("//h5[text()='Book Store Application']");

    public void open() {
        selector.scrollIntoView(true).click();
    }
}
