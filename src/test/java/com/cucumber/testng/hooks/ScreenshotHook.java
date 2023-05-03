package com.cucumber.testng.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class ScreenshotHook {

    private static final String PNG_FILE_EXTENSION = "image/png";

    @After
    public void takeScreenshot(Scenario scenario) {
        byte[] screenshot = ((TakesScreenshot) getWebDriver())
                .getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, PNG_FILE_EXTENSION, scenario.getName());
    }
}
