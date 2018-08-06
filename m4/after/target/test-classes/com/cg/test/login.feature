Feature: Login
 
  Scenario: Sign in to account
    Given that I am on login page
    When I enter username as admin
    And  I enter password as root
    Then I should be logged into my github account
   
  Scenario: Sign in failed due to incorrect password Relogin should appear
    Given that I am on login page
    When I enter username as admin
    And  I enter password as Harshini@1997
    Then I should relogin for password

       
  Scenario: Sign in failed due to incorrect username Relogin should appear
    Given that I am on login page
    When I enter username as admit
    And  I enter password as root
    Then I should relogin for username
    