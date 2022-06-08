

Feature: login application
  
  Scenario: home page default login
    Given user on login page
    When user login with user name and password
    Then home page is open
    And bus time table is displayed

 