Feature: Table

Scenario: the table has size one after adding one item
  Given a new table
  When I add a key "k" and value "v"
  Then the table size is 1
