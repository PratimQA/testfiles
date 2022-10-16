Feature: RBG Login

  Scenario: Successful login with valid credentials
      Given User launch chrome browser
      When User opens login URL "https://www.redbeltgym.com"
      Then Page Title should be "Red Belt Gym - Login"
      And User will enter Email as "test-user26@rbg.in" and Password as "123456"
      And User will click on Login button
      
    
   
      
      