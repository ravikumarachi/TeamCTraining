Feature:

  @signout
  Scenario: sign out
    When I click on sign in button on home page
    Given I enter email id as "punam@gmail.com"
    And I enter password as "pw123"
    When I click on sign in button on sign in page
    Then I should see "sign in text"
#    When I click on Signout button
#    Then I should not see signout button
    And I should see sign in button

  Scenario:
    Given

  Scenario:
    Given

  Scenario:
    Given

  Scenario:
    Given

  Scenario:
    Given