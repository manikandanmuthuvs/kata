Feature: User service 
    Client wants to get User's first name[Fizz], last name[Buzz] and the fullname[Fizz Buzz]
    when they give any random number which is divisible by 3, 5 and both.

Scenario: Client receives user firstname
  Given the User has full name "Fizz Buzz"
  When the Client request User servie /user$ with username code divisible by 3
  Then the Client receives User first name "Fizz"

Scenario: Client receives user lastname
  Given the User has full name "Fizz Buzz"
  When the Client request User servie /user$ with username code divisible by 5
  Then the Client receives User last name "Buzz"

Scenario: Client receives user fullname
  Given the User has full name "Fizz Buzz"
  When the Client request User servie /user$ with username code divisible by both 3 and 5
  Then the Client receives User full name "Fizz Buzz"