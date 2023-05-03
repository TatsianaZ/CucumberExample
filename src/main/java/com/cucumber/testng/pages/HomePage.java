package com.cucumber.testng.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;
import static java.time.Duration.ofSeconds;

public class HomePage extends BasePage {
    private static final String CUCUMBER_URL = "https://cucumber.io/";

    private static final String TEXT_PATTERN =
            "%s[contains(text(), '%s')]";
    private static final String MENU_SECTION =
            "//*[contains(@class, 'nav-link')]";
    private static final String CHILD_MENU_ITEM =
            "//*[contains(@class, 'dropdown')]//*[contains(@class, 'item')]";

    public void openCucumberWebsite() {
        open(CUCUMBER_URL);
    }

    public SelenideElement menuSection(String linkText) {
        return $x(format(TEXT_PATTERN, MENU_SECTION, linkText))
                .shouldBe(visible, ofSeconds(2));
    }

    public SelenideElement menuChildItem(String linkText) {
        return $x(format(TEXT_PATTERN, CHILD_MENU_ITEM, linkText))
                .shouldBe(visible, ofSeconds(30));
    }
}
