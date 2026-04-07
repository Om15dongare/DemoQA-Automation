Feature: DemoQA Login

Scenario: Login using external Excel data
  Given user is on login page
  When user logs in using excel data
  And clicks on login button with excel
  Then login result should be profile page for success and login page for failure