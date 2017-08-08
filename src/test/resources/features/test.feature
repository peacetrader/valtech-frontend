Feature:

  Navigation


  Scenario: Verify if the Latest News section is displaying
    Given I am in the homepage
    Then I should be able to see the Latest News Section

    Scenario Outline: Verify if the pages are displaying relevant page name
      Given I navigate to the homepage
      When I navigate to '<top_navigation>'
      Then I should be able to see the '<page_name>' page name
      Examples:
      |page_name    | top_navigation             |
      | About       |    a[href='/about/']       |
      |  Work       |    a[href='/work/']        |
      |  Services   |    a[href='/services/']    |

      Scenario: Verify correct number of offices are displayed in the Contact page
        Given I am in the homepage
        When I navigate to Contact Page
        Then I should be able to see 36 offices in the Contact page





