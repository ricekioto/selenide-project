package com.example.selenideproject.demoqa.test;

import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.WebTablesPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class WebTablesPageTest implements SelenideConfig {
    private static WebTablesPage webTablesPage;

    @BeforeAll
    public static void beforeAll() {
        open("/webtables");
        webTablesPage = new WebTablesPage();
    }

    @Test
    public void addNewRecordWebTablesPageTest() {
        String firstName = "Alex";
        String lastName = "Rojer";
        String email = "email@email.com";
        String age = "22";
        String Salary = "2200";
        String department = "DevOps";

        webTablesPage.clickAddButton();

        webTablesPage.selectFirstName(firstName);
        webTablesPage.selectLastName(lastName);
        webTablesPage.selectEmail(email);
        webTablesPage.selectAge(age);
        webTablesPage.selectSalary(Salary);
        webTablesPage.selectDepartment(department);

        webTablesPage.clickSubmitButton();

        webTablesPage.verifyResult(firstName);
        webTablesPage.verifyResult(lastName);
        webTablesPage.verifyResult(email);
        webTablesPage.verifyResult(age);
        webTablesPage.verifyResult(Salary);
        webTablesPage.verifyResult(department);
    }

}
