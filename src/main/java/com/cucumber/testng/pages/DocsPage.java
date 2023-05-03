package com.cucumber.testng.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$x;
import static java.lang.String.format;

public class DocsPage extends BasePage {
    private static final String PAGE_TITLE_PATTERN =
            "//*[@class='page-header']/*[contains(@class, 'title') and contains(text(), '%s')]";

    public boolean isPageWithTitleDisplayed(String title) {
        return $x(format(PAGE_TITLE_PATTERN, title)).isDisplayed();
    }
}
