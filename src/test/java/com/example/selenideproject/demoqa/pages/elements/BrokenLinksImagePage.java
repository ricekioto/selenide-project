package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Selenide.*;

@FieldDefaults(level = AccessLevel.PRIVATE,  makeFinal = true)
public class BrokenLinksImagePage {
    SelenideElement validImage = $x("//img[@src='/images/Toolsqa.jpg']");
    SelenideElement brokenImage = $x("//img[@src='/images/Toolsqa_1.jpg']");
    SelenideElement validLink = $x("//a[text()='Click Here for Valid Link']");
    SelenideElement brokenLink = $x("//a[text()='Click Here for Broken Link']");

    public void verifyValidImage() {
        validImage.shouldBe(Condition.visible);
    }

    public void verifyBrokenImage() {
        brokenImage.shouldBe(Condition.visible);
    }

    public void clickValidLink() {
        validLink.scrollIntoView(true).shouldBe(Condition.visible).click();
    }
    public void clickBrokenLink() {
        brokenLink.scrollIntoView(true).shouldBe(Condition.visible).click();
    }

    public void verifyVelidLink() {
        $("#app").shouldBe();
    }

    public void verifyBrokenLink() {
        $("#content").shouldHave(Condition.text("500 status"));
    }

    public void open() {
        Selenide.open("/broken"); // Переключение на первое окно
    }
}
