package com.example.selenideproject.demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Selenide.$x;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class HomePage {
    SelenideElement elementsCard = $x("//h5[text()='Elements']");
    SelenideElement formsCard = $x("//h5[text()='Forms']");
    SelenideElement bookStoreCard = $x("//h5[text()='Book Store Application']");

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
