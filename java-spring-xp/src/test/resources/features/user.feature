Feature: User service 
    Client wants to get User's first name[Fizz], last name[Buzz] and the fullname[Fizz Buzz]
    when they give any random number which is divisible by 3, 5 and both.

Scenario: Client receives user firstname
  Given the user has full name 'Fizz Buzz'
  When the Client request User servie /user/firstname$ with code 3
  Then the Client receives user first name 'Fizz'
