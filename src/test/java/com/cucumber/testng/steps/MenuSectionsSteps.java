package com.cucumber.testng.steps;

import com.cucumber.testng.navigation.PortalUrl;
import com.cucumber.testng.pages.DocsPage;
import com.cucumber.testng.pages.HomePage;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class MenuSectionsSteps {

    private HomePage homePage = new HomePage();
    public DocsPage docsPage = new DocsPage();

    @Given("the user opens Cucumber website")
    public void userOpensCucumberWebsite() {
        homePage.openCucumberWebsite();
    }

    @When("the user clicks on the {string} section")
    public void theUserClicksOnTheSection(String section) {
        homePage.menuSection(section).click();
    }

    @When("the user clicks on the {string} item")
    public void theUserClickOnTheItem(String item) {
        homePage.menuChildItem(item).click();
    }

    @Then("page with title {string} is displayed")
    public void pageWithTitleIsDisplayed(String pageTitle) {
        assertThat(docsPage.isPageWithTitleDisplayed(pageTitle))
                .as("Page title '%s' is not displayed", pageTitle)
                .isTrue();
    }

    @Given("some precondition before each scenario")
    public void somePreconditionBeforeEachScenario() {
        System.out.println("Background execution");
    }

    @When("user doing something")
    public void userDoingSomething() {
        System.out.println("userDoingSomething");
    }

    @Then("something happens")
    public void somethingHappens() {
        System.out.println("somethingHappens");
    }

    @Then("the following list of links is displayed")
    public void followingListOfLinksIsDisplayed(List<String> links) {
        links.forEach(System.out::println);
    }

    @When("user clicks on link {string}")
    public void userClicksOnLink(String link) {
        System.out.println(link);
    }

    @Then("the following values are displayed")
    public void theFollowingValuesAreDisplayed(Map<String, String> values) {
        values.forEach((key, value) -> System.out.println(key + " -> " + value));
    }

    @ParameterType("DOCS|HOME|TOOLS")
    public PortalUrl cucumberPortalUrl(String value) {
        return PortalUrl.valueOf(value);
    }

    @When("user navigates to page {cucumberPortalUrl}")
    public void userNavigatesToPage(PortalUrl url) {
        System.out.println(url.getUrl());
        // CucumberNavigation.navigateToPortalPage(url);
    }
}
