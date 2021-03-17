



Feature: Admin module

@sanity
Scenario: Verify admin module

Given user on login page

When  user enter correct username "Admin" and password "admin123"
 
And   click on login button
 
Then  display the hrm home page
 
And   verify the current url of home page
 
Then  user logout the page



@regression 
 Scenario Outline: login data driven

Given user on login page

When user enter correct username "<Email>" and password "<password>"
 
 And click on login button
 
 Then display the hrm home page
 
 And verify the current url of home page
 
 Then user logout the page
 
 Examples:
 
     |Email | password|
     
      |Admin | admin123|
       |Admin | adrin123|
 
 
 
 


