Feature: As a user with some subscription
  I want to get ability to use menu sections
  So that I can navigate to needed resourses

  Scenario : Docs sections should contains appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "Gherkin Syntax" item
    Then page with title "Gherkin Syntax" is displayed

