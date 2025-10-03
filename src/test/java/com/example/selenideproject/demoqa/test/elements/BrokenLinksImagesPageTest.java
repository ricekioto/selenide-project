package com.example.selenideproject.demoqa.test.elements;

import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.BrokenLinksImagePage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BrokenLinksImagesPageTest implements SelenideConfig {
    private static BrokenLinksImagePage brokenLinksImagesPage;

    @BeforeAll
    public static void beforeAll() {
        brokenLinksImagesPage = new BrokenLinksImagePage();
        brokenLinksImagesPage.open();
    }

    @Test
    public void brokenLinksImagesPageTest() {
        brokenLinksImagesPage.verifyValidImage();
        brokenLinksImagesPage.verifyBrokenImage();

        brokenLinksImagesPage.clickValidLink();
        brokenLinksImagesPage.verifyVelidLink();
        brokenLinksImagesPage.open();

        brokenLinksImagesPage.clickBrokenLink();
        brokenLinksImagesPage.verifyBrokenLink();
    }

}
