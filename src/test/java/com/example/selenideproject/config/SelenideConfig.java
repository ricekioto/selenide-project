package com.example.selenideproject.config;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface SelenideConfig {
    WebDriver webDriver = new ChromeDriver();

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 1000;
        Configuration.pageLoadTimeout = 150000;
    }
    @AfterAll
    static void teardown() {
        webDriver.quit();
    }
}
