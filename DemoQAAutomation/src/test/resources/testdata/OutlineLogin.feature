@OutlineLogin
Feature: DemoQA Login

  Scenario Outline: Login with multiple users
    Given user is on login page with Outline 
    When user enters username "<username>" and password "<password>"
    And clicks on login button
    Then login result should be "<result>"

    Examples:
      | username     | password    | result  |
      | testuser    | Password@123     | success |
      | wronguser    | wrongpass   | fail    |