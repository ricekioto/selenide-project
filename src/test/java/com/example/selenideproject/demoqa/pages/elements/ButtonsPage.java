package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Selenide.$x;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ButtonsPage {
    SelenideElement doubleClickMeButton = $x("//button[@id='doubleClickBtn']");
    SelenideElement rightClickMeButton =  $x("//button[@id='rightClickBtn']");
    SelenideElement clickMeButton =  $x("//button[text()='Click Me']");
    SelenideElement doubleClickMessage = $x("//p[@id='doubleClickMessage']");
    SelenideElement rightClickMessage = $x("//p[@id='rightClickMessage']");
    SelenideElement clickButtonMessage = $x("//p[@id='dynamicClickMessage']");

    public void clickDoubleClickMeButton() {
        doubleClickMeButton.doubleClick();
    }
    public void clickRightClickMeButton() {
        rightClickMeButton.contextClick();
    }
    public void clickMeButton() {
        clickMeButton.click();
    }
    public void verifyResultDoubleClick(String text) {
        doubleClickMessage.shouldHave(Condition.text(text));
    }

    public void verifyResultRightClick(String text) {
        rightClickMessage.shouldHave(Condition.text(text));
    }

    public void verifyResultClick(String text) {
        clickButtonMessage.shouldBe(Condition.text(text));
    }
}
