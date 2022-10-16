Feature: Dashboard


Scenario: Open the settings icon from dashboard
      Given User launch chrome browser
      When User opens login URL "https://www.redbeltgym.com"
      Then Page Title should be "Red Belt Gym - Login"
      And User will enter Email as "test-user26@rbg.in" and Password as "123456"
      And User will click on Login button
      Then User can view Dashboard URL "https://www.redbeltgym.com/dashboard"
      When User clicks on Settings menu
      Then User can view his account setup