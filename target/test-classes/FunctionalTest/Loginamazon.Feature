Feature: Login of amazon 
Scenario Outline: Login to amzon with different password
 Given User navigates to amazon page Url 
 When User enters Username "<Username>" and Password "<Password>"Credentails 
 Then Login page of the current user should be displayed 

  
  Examples:
  |Username| Password|
   |admin| Pass123|
   |879345689|Samansld@2123|
   | 8792348457|Anagha$123|
    
