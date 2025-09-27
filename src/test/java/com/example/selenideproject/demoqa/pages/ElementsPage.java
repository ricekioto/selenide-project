package com.example.selenideproject.demoqa.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

public class ElementsPage {
    private final SelenideElement textBoxCard = Selenide.$x("//span[text()='Text Box']");

    public void textBoxCardClick() {
        textBoxCard.click();
    }

}
