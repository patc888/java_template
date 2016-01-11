Feature: Yahoo

Scenario: visit the home page and search
  Given I am on the Yahoo home page
  When I search for "pig"
  Then search results are returned
