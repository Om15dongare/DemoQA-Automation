Feature: DemoQA Login

Scenario: Login with user testuser
  Given user is on login page
  When user enters username "testuser" and password "Password@1234"
  And clicks on login button
  Then login result should be "success"

Scenario: Login with user wronguser
  Given user is on login page
  When user enters username "wronguser" and password "wrong"
  And clicks on login button
  Then login result should be "fail"

Scenario: Login with user vinod
  Given user is on login page
  When user enters username "vinod" and password "nagpur"
  And clicks on login button
  Then login result should be "fail"

Scenario: Login with user pramit
  Given user is on login page
  When user enters username "pramit" and password "pramit"
  And clicks on login button
  Then login result should be "fail"

Scenario: Login with user Bhushan
  Given user is on login page
  When user enters username "Bhushan" and password "More"
  And clicks on login button
  Then login result should be "fail"

Scenario: Login with user Virat
  Given user is on login page
  When user enters username "Virat" and password "Kohli"
  And clicks on login button
  Then login result should be "fail"

Scenario: Login with user Rohit
  Given user is on login page
  When user enters username "Rohit" and password "Sharma"
  And clicks on login button
  Then login result should be "fail"

Scenario: Login with user Jasprit
  Given user is on login page
  When user enters username "Jasprit" and password "Bumrah"
  And clicks on login button
  Then login result should be "fail"

Scenario: Login with user Rohit
  Given user is on login page
  When user enters username "Rohit" and password "Sh@rma123"
  And clicks on login button
  Then login result should be "success"

