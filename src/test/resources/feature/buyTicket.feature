Feature: Buy ticket

  Scenario: Buy Ticket on the first item of the list
    Given I'm at regular event page
    When I click on 1st item
    Then I can see ticket detail panel