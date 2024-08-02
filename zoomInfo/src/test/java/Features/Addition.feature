Feature: Calculator

  @Test
  Scenario: Addition
    Given add 2 and 3 numbers
    Then verify result as 5


  @Test
  Scenario: Subtract
    Given Sub 10 and 2 numbers
    Then verify result as 8


  @Test
  Scenario: Multiple
    Given Sub 10 and 2 and multiple 2 numbers
    Then verify result not as 20

  @Test1
  Scenario: Sin details
    Given Sin 30 number
    Then verify result value as "0.5"


