package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$x;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class DynamicPropertiesPage {
    SelenideElement enableAfterButton = $x("//button[@id='enableAfter']");
    SelenideElement colorChangeButton = $x("//button[@id='colorChange']");
    SelenideElement visibleAfterButton = $x("//button[@id='visibleAfter']");

    public void open() {
        Selenide.open("/dynamic-properties"); // Переключение на первое окно
    }

    public void verifyEnableButton() {
        enableAfterButton.shouldBe(enabled);
    }

    public void verifyColorChangeButton() {
        colorChangeButton.shouldHave(cssValue("color", "rgba(220, 53, 69, 1)"));
    }

    public void verifyVisibleButton() {
        visibleAfterButton.shouldBe(visible);
    }
}
