package com.example.selenideproject.demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    private final SelenideElement elementsCard = $x("//h5[text()='Elements']");
    private final SelenideElement formsCard = $x("//h5[text()='Forms']");
    private final SelenideElement bookStoreCard = $x("//h5[text()='Book Store Application']");

    public void clickElementsCard() {
        elementsCard.scrollIntoView("{block: 'center'}").click();
    }

    public void clickFormsCard() {
        formsCard.scrollIntoView("{block: 'center'}").click();
    }

    public void clickBookStoreCard() {
        bookStoreCard.scrollIntoView(true).click();
    }
}
