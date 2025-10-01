package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CheckBoxPage {
    SelenideElement angularSelector = $x("//span[contains(text(),'Angular')]");
    SelenideElement generalSelector = $x("//span[contains(text(),'General')]");
    SelenideElement notesSelector = $x("//span[contains(text(),'Notes')]");
    SelenideElement result = $x("//div[@id='result']");
    SelenideElement buttonExpendAll = $x("//button[@title='Expand all']");

    public void open() {
        Selenide.open("checkbox"); // Переключение на первое окно
    }

    public void clickAngularSelector() {
        angularSelector.scrollIntoView(true).click();
    }

    public void clickGeneralSelector() {
        generalSelector.scrollIntoView(true).click();
    }

    public void clickNotesSelector() {
        notesSelector.scrollIntoView(true).click();
    }

    public void clickbuttonExpendAll() {
        buttonExpendAll.click();
    }

    public void verifyResult(String result) {
        this.result.shouldHave(text(result));
    }
}
