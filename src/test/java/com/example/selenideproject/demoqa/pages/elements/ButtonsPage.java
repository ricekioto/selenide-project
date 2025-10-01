package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Selenide.$x;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ButtonsPage {
    SelenideElement doubleClickMeButton = $x("//buttonp[@id='doubleClickBtn']");
    SelenideElement rightClickMeButton =  $x("//button[@id='rightClickBtn']");
    SelenideElement clickMeButton =  $x("//button[@id='8RDXB']");
    SelenideElement doubleClickMessage = $x("p[@id='doubleClickMessage']");
    SelenideElement rightClickMessage = $x("p[@id='rightClickMessage']");
    SelenideElement clickButton = $x("//button[@id='dynamicClickMessage']");

    public void clickDoubleClickMeButton() {
        doubleClickMeButton.click();
    }
    public void clickRightClickMeButton() {
        rightClickMeButton.click();
    }
    public void clickMeButton() {
        clickMeButton.click();
    }
    public void verifyResultDoubleClick(String text) {
        doubleClickMessage.shouldHave(Condition.text(text));
    }
}
