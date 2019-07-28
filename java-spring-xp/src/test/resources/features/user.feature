Feature: Display users first name last name and full name
    User wants to see their first name[Fizz], last name[Buzz] and the fullname[Fizz Buzz]
    when they give any random number which is divisible by 3, 5 and both.

Scenario: User gets firstname
  Given User has full name
  When User enters number divisible by 3
  Then User gets first name
