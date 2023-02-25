@Login @stg

Feature: Login to system success
  As a QA
  I want to check function Login to systeam and CRUD Process
  So that verify function work well

 # Scenario: Check language display is Vietnamese
   #Then Verify "Đăng nhập" text is displayed

  Scenario: Change language to English
    When Click to dynamic "translate" page link
    And Click to dynamic "undefined_1" action first button link
    Then Verify "Login" text is displayed

  Scenario: Login to system
    When Input to dymanic textbox "username" with value "388933459"
    And Input to dymanic textbox "password" with value "123456"
    And Click to dynamic "btn_login" button
   # Then Verify text noti "Đăng nhập thành công!" is displayed in noti "Đăng nhập thành công!"
   # When Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti
    And Verify dynamic text "Projects" is display "Projects" of page

  
  

  
  
  
  
  
  
  
  
  
  
  
  
  

  

  
  
  
  