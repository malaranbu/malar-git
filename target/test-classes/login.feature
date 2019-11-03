@britishtest
Feature: british airways registration

  Scenario Outline: login check for british airways
    When enter the loginid
    Then enter the password
    And Check for the status

    Examples: 
      | loginid             | password    | status |
      | malar.cse@gmail.com | v1n0thm@l@r | pass   |
      | malar@gmail.com     | v1n0thm@l@r | fail   |
      | malar.cse@gmail.com | vinothm@l@r | fail   |
      |                     | v1n0thm@l@r | fail   |
      | malar.cse@gmail.com |             | fail   |
