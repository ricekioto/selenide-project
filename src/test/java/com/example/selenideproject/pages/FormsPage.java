package com.example.selenideproject.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class FormsPage {
    SelenideElement selector = $x("//h5[text()='Forms']");

    public void open() {
        selector.scrollIntoView("{block: 'center'}").click();
    }
}
