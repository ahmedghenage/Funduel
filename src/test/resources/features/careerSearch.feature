Feature: Career search functionality

  @regression
  Scenario: Career search
    Given user is on the FUNDUEL Home page
    When user clicks on careers button
    And user fill in keywords or job title
    And user selects a team
    And user selects a location
    And user clicks on find your position button
    Then user should see all open positions based on his selections

