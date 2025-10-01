package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ElementsPage {
    SelenideElement textBoxCard = Selenide.$x("//span[text()='Text Box']");
    SelenideElement checkBoxCard = Selenide.$x("//span[text()='Checkbox']");
    SelenideElement radioButtonCard = Selenide.$x("//span[text()='Radio Button']");
    SelenideElement webTablesCard = Selenide.$x("//span[text()='Web Tables']");
    SelenideElement buttonsCard = Selenide.$x("//span[text()='Buttons']");
    SelenideElement linksCard = Selenide.$x("//span[text()='Links']");
    SelenideElement brokenLinksImagesCard = Selenide.$x("//span[text()='Broken Links - Images']");
    SelenideElement uploadAndDownloadCard = Selenide.$x("//span[text()='Upload And Download']");
    SelenideElement dynamicPropertiesCard = Selenide.$x("//span[text()='Dynamic Properties']");

    public void textBoxCardClick() {
        textBoxCard.click();
    }

    public void checkBoxCardClick() {
        checkBoxCard.click();
    }

    public void radioButtonCardClick() {
        radioButtonCard.click();
    }

    public void webTablesCardClick() {
        webTablesCard.click();
    }

    public void buttonsCardClick() {
        buttonsCard.click();
    }

    public void linksCardClick() {
        linksCard.click();
    }

    public void brokenLinksImagesCardClick() {
        brokenLinksImagesCard.click();
    }

    public void uploadAndDownloadCardClick() {
        uploadAndDownloadCard.click();
    }

    public void dynamicPropertiesCardClick() {
        dynamicPropertiesCard.click();
    }
}
