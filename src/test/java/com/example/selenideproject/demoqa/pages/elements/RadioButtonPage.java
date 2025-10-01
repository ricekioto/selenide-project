package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Selenide.$x;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class RadioButtonPage {
    SelenideElement yesRadio = $x("//label[@for='yesRadio']");
    SelenideElement impressiveRadio = $x("//label[@for='impressiveRadio']");
    SelenideElement noRadio = $x("//label[@for='noRadio']");
    SelenideElement result = $x("//p[@class='mt-3']");

    public void open() {
        Selenide.open("/radio-button"); // Переключение на первое окно
    }

    public void clickYesRadio() {
        yesRadio.click();
    }

    public void clickImpressiveRadio() {
        impressiveRadio.click();
    }

    public void clickNoRadio() {
        noRadio.click();
    }

    public void verifyResult(String text) {
        result.shouldBe(Condition.text(text));
    }
}
