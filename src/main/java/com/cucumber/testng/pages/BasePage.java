package com.cucumber.testng.pages;

import com.cucumber.testng.driver.DriverManager;

public abstract class BasePage {
    public BasePage() {
        DriverManager.initDriver();
    }
}
