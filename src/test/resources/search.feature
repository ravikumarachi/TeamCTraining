Feature:

  @poonamTest
  Scenario Outline:
    Given I enter "<searchText>" in search field
    When I click search button
    Then I should see "<resultsText>"
#    And I should see "<headerText>


    Examples:
      | searchText | resultsText                | headerText |
      | SHIRT      | 1 result has been found.   | SHIRT      |
      | dress      | 7 results have been found. | DRESS      |