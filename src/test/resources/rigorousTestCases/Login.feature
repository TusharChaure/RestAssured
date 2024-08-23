@Test
Feature: Test login functionality application

  Scenario: User login
    Given Create request body with valid username and password field
    When Get login request response
    Then Collect token from response body
