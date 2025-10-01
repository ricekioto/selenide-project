package com.example.selenideproject.demoqa.test.elements;

import com.example.selenideproject.demoqa.config.SelenideConfig;
import com.example.selenideproject.demoqa.pages.elements.UploadAndDownloadPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class UploadAndDownloadPageTest implements SelenideConfig {
    private static UploadAndDownloadPage uploadAndDownloadPage;

    @BeforeAll
    public static void beforeAll() {
        uploadAndDownloadPage = new UploadAndDownloadPage();
        uploadAndDownloadPage.open();
    }

    @Test
    public void uploadAndDownloadTest() throws IOException {
        String fileUrl = "https://demoqa.com/sampleFile.jpeg";
        String downloadFilePath = "src/test/resources/downloadedfile.jpeg";

        uploadAndDownloadPage.downloadFile(fileUrl, downloadFilePath);

        uploadAndDownloadPage.upload();
        uploadAndDownloadPage.verifyUploadedFile();
    }
}
