Feature: An example

  Scenario: The example
    // mai jos given imi ruleaza pagina step definitions dupa ce dau clik dreapta si Run

    Given I am on the main page
    When I write the email address of "test@tester.com"
    And I click the submit button
    Then the confirmation pop-up appears

  Scenario: # 1 Positive. Cand verific adresa de mail in campul de mail
    Given I am on the main page
    When I write the email address of "irina@tester.ro"
    And I click the submit button
    Then the confirmation pop-up appears

  Scenario: # 1 Negative. Cand completez peste 100 de caractere
    Given I am on the main page
    When I write the email address of "ttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt"
    And I click the submit button

  Scenario: # 2 Positive. Cand apas butonul Start the enrollment se deschide pagina noua unde trebuie completate campurile
    Given I am on the main page
    When I click start the enrollment
    Then the new page opens

  Scenario: # 3 Positive. Cand apas sus in pagina Questions ma duce la sectiunea FAQ (Frequently Asked Questions)
    Given I am on the main page
    When I click the Question button
    Then the page goes down to the FAQ sections

  Scenario: # 4 Positive. Cand apas butonul de Read More de la Virtual se deschide o noua pagina
    Given I am on the main page
    When I click the Read More button from Virtual
    Then the new page opens from Virtual

  Scenario: # 5 Positive. Cand apas butonul de Read More de la  Hybrid se deschide o noua pagina
      Given I am on the main page
      When I click the Read More button from Hybrid
      Then the new page opens from Hybrid

  Scenario: # 6 Positive. Cand apas butonul de Read More de la  In Person se deschide o noua pagina
    Given I am on the main page
    When I click the Read More button from In Person
    Then the new page opens from In Person

  Scenario: # 7 Pozitive. Cand apas butonul de Read More de la Learn The Fundamentals se deschide o noua pagina
    Given I am on the main page
    When I click the Read More button from Learn The Fundamentals
    Then the new page opens from Fundamentals page

  Scenario: # 8 Positive. Cand apas sus in pagina Instructors ma duce jos la sectiunea Our Instructors
    Given I am on the main page
    When I click the Istructors button
    Then the page goes down to the Our Instructors

  Scenario: # 9 Positive. Cand apas sageata albastra din dreapta jos din pagina ma duce la inceputul paginii
    Given I am on the main page
    When I click the blue arrow from the bottom of the page
    Then the page move back to the top

    Scenario: # 10 Positive. Cand sunt pe pagina de E
      Given I am on the course options page
      When I select the manual tester option
      And  I click the next button from the course options page
      Then a payment information page opens