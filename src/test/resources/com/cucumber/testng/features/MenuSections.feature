@smoke
Feature: As a user
  I want to get ability to use menu sections
  So that I can

  Background:
    Given some precondition before each scenario

  Scenario: Docs sections should contains appropriate columns
    Given the user opens Cucumber website
    When the user clicks on the "Docs" section
    And the user clicks on the "Gherkin Syntax" item
    Then page with title "Gherkin Syntax" is displayed

  Scenario: test scenario with list as parameter
    When user doing something
    Then something happens
    And the following list of links is displayed
      | link1 |
      | link2 |
      | link3 |

  Scenario: test scenario with map as parameter
    When user doing something
    Then something happens
    And the following values are displayed
      | key1 | a |
      | key2 | b |
      | key3 | c |

  Scenario Outline: test scenario with examples
    When user clicks on link "<link>"
    Then something happens
    Examples:
      | link     |
      | linkName |

  Scenario: test scenario with enum
    When user navigates to page DOCS
    Then something happens











