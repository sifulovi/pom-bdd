Feature: Login Authentication

  Scenario Outline:
    Given navigate to login page
      | url | <url> |
    And fill up authentication credential and submit:
      | Field    | <Value>    |
      | email    | <email>    |
      | password | <password> |
    Then validate authentication

  @Login
    Examples:
      | email | password | url |
      |       |          |     |
