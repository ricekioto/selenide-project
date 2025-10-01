package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TextBoxPage {
    SelenideElement inputFullName = Selenide.$x("//input[@placeholder='Full Name']");
    SelenideElement inputEmail = Selenide.$x("//input[@placeholder='name@example.com']");
    SelenideElement inputCurrentAddress = Selenide.$x("//textarea[@placeholder='Current Address']");
    SelenideElement inputPermanentAddress = Selenide.$x("//textarea[@id='permanentAddress']");
    SelenideElement submitButton = Selenide.$x("//button[@class='btn btn-primary']");
    SelenideElement result = Selenide.$x("//div[@class='mt-4 row']");

    public void open() {
        Selenide.open("/text-box"); // Переключение на первое окно
    }

    public void enterFullName(String fullName) {
        inputFullName.setValue(fullName);
    }

    public void enterEmail(String email) {
        inputEmail.setValue(email);
    }

    public void enterCurrentAddress(String address) {
        inputCurrentAddress.setValue(address);
    }

    public void enterPermanentAddress(String address) {
        inputPermanentAddress.setValue(address);
    }

    public void submitButtonClick() {
        submitButton.click();
    }

    public void verifyOutput(String expectedOutput) {
        result.scrollIntoView(true).shouldHave(Condition.text(expectedOutput));
    }
}