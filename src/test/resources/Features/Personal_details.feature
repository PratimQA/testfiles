Feature: Personal Details

Scenario: Set the personal details of the account
      Given User launch chrome browser
      When User opens login URL "https://www.redbeltgym.com"
      Then Page Title should be "Red Belt Gym - Login"
      And User will enter Email as "test-user26@rbg.in" and Password as "123456"
      And User will click on Login button
      Then User can view Dashboard URL "https://www.redbeltgym.com/dashboard"
      When User clicks on Settings menu
      Then User can view his account setup
      Then User will click on Personal Details
      And User will enter Current Password as "123456"
      And User will enter New Password as "!Aworker5#"
      And User will enter Confirm Password as "!Aworker5#"
      And User will click on Save button