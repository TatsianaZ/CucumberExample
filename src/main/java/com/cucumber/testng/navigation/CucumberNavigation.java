package com.cucumber.testng.navigation;

import com.cucumber.testng.driver.DriverManager;

import static com.codeborne.selenide.Selenide.open;

public class CucumberNavigation {
    private static final String BASE_URL = "https://cucumber.io/";

    public static void navigateToPortalPage(PortalUrl url) {
        open(BASE_URL + url.getUrl());
    }
}
