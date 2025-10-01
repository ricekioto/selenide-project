package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class LinksPage {
    SelenideElement homeLink = $x("//a[@id='simpleLink']");
    SelenideElement createdLink = $x("//a[@id='created']");
    SelenideElement noContentLink = $x("//a[@id='no-content']");
    SelenideElement movedLink = $x("//a[@id='moved']");
    SelenideElement badRequestLink = $x("//a[@id='bad-request']");
    SelenideElement unauthorizedLink = $x("//a[@id='unauthorized']");
    SelenideElement forbiddenLink = $x("//a[@id='forbidden']");
    SelenideElement notFoundLink = $x("//a[@id='invalid-url']");
    SelenideElement linkResponseDiv = $x("//p[@id='linkResponse']");

    public void open() {
        Selenide.open("/links"); // Переключение на первое окно
    }

    public void clickHomeLink() {
        homeLink.scrollIntoView(true).click();
    }

    public void clickCreatedLink() {
        createdLink.scrollIntoView(true).click();
    }

    public void clickNoContentLink() {
        noContentLink.scrollIntoView(true).click();
    }

    public void clickMovedLink() {
        movedLink.scrollIntoView(true).click();
    }

    public void clickBadRequestLink() {
        badRequestLink.scrollIntoView(true).click();
    }

    public void clickUnauthorizedLink() {
        unauthorizedLink.scrollIntoView(true).click();
    }

    public void clickForbiddenLink() {
        forbiddenLink.scrollIntoView(true).click();
    }

    public void clickNotFoundLink() {
        notFoundLink.scrollIntoView(true).click();
    }

    public void verifyLinkResponse(String expectedResponse) {
        linkResponseDiv.shouldHave(text(expectedResponse));
    }

    public void switchToNewWindow() {
        switchTo().window(1);
    }

    public void verifyNewWindowTitle(String actualTitle) {
        Assertions.assertEquals(title(), actualTitle);
    }

    public void closeWindow() {
        closeWindow();
    }

    public void switchBackToOriginalWindow() {
        switchTo().window(0);
    }
}
