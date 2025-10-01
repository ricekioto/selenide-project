package com.example.selenideproject.demoqa.test.elements;

import com.codeborne.selenide.Selenide;
import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.LinksPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class LinksPageTest implements SelenideConfig {
    private static LinksPage linksPage;

    @BeforeAll
    public static void beforeAll() {
        linksPage = new LinksPage();
        linksPage.open();
    }
    @Test
    public void linksPageTest() {
        linksPage.clickHomeLink();
        linksPage.switchToNewWindow();
        Selenide.sleep(3000);
        linksPage.verifyNewWindowTitle("DEMOQA");
        linksPage.switchBackToOriginalWindow();

        linksPage.clickCreatedLink();
        linksPage.verifyLinkResponse("Link has responded with staus 201 and status text Created");

        linksPage.clickNoContentLink();
        linksPage.verifyLinkResponse("Link has responded with staus 204 and status text No Content");

        linksPage.clickMovedLink();
        linksPage.verifyLinkResponse("Link has responded with staus 301 and status text Moved Permanently");

        linksPage.clickBadRequestLink();
        linksPage.verifyLinkResponse("Link has responded with staus 301 and status text Moved Permanently");

        linksPage.clickUnauthorizedLink();
        linksPage.verifyLinkResponse("Link has responded with staus 401 and status text Unauthorized");

        linksPage.clickForbiddenLink();
        linksPage.verifyLinkResponse("Link has responded with staus 403 and status text Forbidden");

        linksPage.clickNotFoundLink();
        linksPage.verifyLinkResponse("Link has responded with staus 404 and status text Not Found");
    }
}
