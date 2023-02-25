@Logout @stg
Feature: Logout to system
  As a QA
  I want to check function logout
  So that verify function work well

  Scenario: Landlord logout to system
    
    When Click to dynamic "menu_info" a button
    And  Click to dynamic "log_out" a button
    Then Verify "Login" text is displayed




