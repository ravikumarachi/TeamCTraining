@regression
Feature: Signin


  @reg
  Scenario: sign in with valid data positive scenario
    When I click on sign in button on home page
    Given I enter email id as "punam@gmail.com"
    And I enter password as "pw123"
    When I click on sign in button on sign in page
    Then I should see error message as "Authentication failed."
    And I should see sign in button
#    And I should see "Sign in" text on the Sign in Button

  @out1
  Scenario Outline: sign in with valid data positive scenario
    When I click on sign in button on home page
    Given I enter email id as "<emailId>"
    And I enter password as "<password>"
    When I click on sign in button on sign in page
    Then I should see error message as "Authentication failed."
#    And I should see sign in button
#    And I should see "<expectedText>" text on the Sign in Button


    Examples:
      | emailId              | password | expectedText |
      | poonam@gmail.com     | pwd123   | Sign In      |
      | javnika@gmail.com    | pwd123   | Sign In      |
      | Bharti@gmail.com     | pwd123   | Sign In      |
      | ravi@gmail.com       | pwd123   | Sign In      |
      | kalyani@gmail.com    | pwd123   | Sign In      |
      | kisshore@gmail.com   | pwd123   | Sign In      |
      | something@gmail.com  | pwd123   | Sign In      |
      | something2@gmail.com | pwd123   | Sign In      |

