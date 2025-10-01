package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import static com.codeborne.selenide.Selenide.$x;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class WebTablesPage {
    SelenideElement addButton = $x("//button[@id='addNewRecordButton']");
    SelenideElement inputFirstName = $x("//input[@placeholder='First Name']");
    SelenideElement inputLastName = $x("//input[@placeholder='Last Name']");
    SelenideElement inputEmail = $x("//input[@placeholder='name@example.com']");
    SelenideElement inputAge = $x("//input[@placeholder='Age']");
    SelenideElement inputSalary = $x("//input[@placeholder='Salary']");
    SelenideElement inputDepartment = $x("//input[@placeholder='Department']");
    SelenideElement submitButton = $x("//button[@id='submit']");
    SelenideElement tableDiv = $x("//div[@class='rt-table']");

    public void open() {
        Selenide.open("/webtables"); // Переключение на первое окно
    }

    public void clickAddButton() {
        addButton.click();
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void selectFirstName(String firstName) {
        inputFirstName.setValue(firstName);
    }

    public void selectLastName(String lastName) {
        inputLastName.setValue(lastName);
    }

    public void selectEmail(String email) {
        inputEmail.setValue(email);
    }

    public void selectAge(String age) {
        inputAge.setValue(age);
    }

    public void selectSalary(String salary) {
        inputSalary.setValue(salary);
    }

    public void selectDepartment(String department) {
        inputDepartment.setValue(department);
    }

    public void verifyResult(String text) {
        tableDiv.shouldHave(Condition.text(text));
    }
}
