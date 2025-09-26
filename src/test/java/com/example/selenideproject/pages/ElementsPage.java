package com.example.selenideproject.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsPage {
    SelenideElement selector = $x("//h5[text()='Elements']");

    public void open() {
        selector.scrollIntoView("{block: 'center'}").click();
    }
}
