package com.example.selenideproject.demoqa.pages.elements;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DownloadOptions;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import static com.codeborne.selenide.Selenide.$x;
import static org.assertj.core.api.Assertions.assertThat;

@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UploadAndDownloadPage {
    @Getter
    String imageTest = "src/test/resources/sampleFile.jpeg";
    SelenideElement download = $x("//a[text()='Download']");
    SelenideElement upload = $x("//input[@id='uploadFile']");
    SelenideElement uploadedFile = $x("//p[@id='uploadedFilePath']");

    public void open() {
        Selenide.open("/upload-download"); // Переключение на первое окно
    }

    public void download() {
        File file = download.download();
        assertThat(file).hasName("sampleFile.jpeg");
    }

    public void downloadFile(String fileUrl, String destinationPath) throws IOException {
        URL url = new URL(fileUrl);
        try (InputStream in = url.openStream()) {
            Path path = Paths.get(destinationPath);
            Files.copy(in, path, StandardCopyOption.REPLACE_EXISTING);
            assertThat(path).exists();
            path.toFile().deleteOnExit();
        }
    }

    public void upload() {
        upload.uploadFromClasspath("sampleFile.jpeg");
    }

    public void verifyUploadedFile() {
        uploadedFile.shouldHave(Condition.text("sampleFile.jpeg"));
    }
}