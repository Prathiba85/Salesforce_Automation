Feature: This feature will be used to test the login functionlity of simplilearn

  Background: 
    Given I have launched the application
   

    Scenario: Validate the login failure using parameters
    When I enter username as "prathiba.sankararaj@gmail.com"
    And I enter password as "Test_1234"
    And Click on login
    Then I should be able to see the Home page.
