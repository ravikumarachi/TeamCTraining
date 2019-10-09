Feature:

  @datatable1
  Scenario:
    When I click on sign in button on home page
    Given I enter new email id as "test_27@test.com"
    When I click on Create an account button
    And I enter below details:
      | FirstName | LastName  | Password    | Date of Birth |
      | test_27   | Testing27 | Password123 | 1/2/1980      |
    When I click "Sign up for our newsletter!" check box

