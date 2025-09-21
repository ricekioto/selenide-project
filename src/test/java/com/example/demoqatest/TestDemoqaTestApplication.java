package com.example.demoqatest;

import org.springframework.boot.SpringApplication;

public class TestDemoqaTestApplication {

    public static void main(String[] args) {
        SpringApplication.from(DemoqaTestApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
