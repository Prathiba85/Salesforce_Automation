Feature: This feature will be used to test the login functionlity of simplilearn

  Background: 
   Given I have launched the application
   When I enter username as "prathiba.sankararaj@gmail.com"
    And I enter password as "Chifley_08"
    And Click on login
    Then I should be able to see the Home page.

   
    Scenario: Validate if minimum pay is less than maximum pay then error message pops up   
    When I click apps and search for recruting app
    And I search and select "Recruiting" 
    And I create new Position record
    And I enter position title as "Aws"
    And I enter minimum pay as "1000"
    And I enter maximum pay as "10"
    And Click on save
    Then I should see the error message "Minimum Pay can't be greater than maximum pay".
    