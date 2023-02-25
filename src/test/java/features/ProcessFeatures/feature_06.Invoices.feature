@Invoices
Feature: Invoices
  As a QA
  I want to check function invoices
  So that verify function work well

  Pre-condition: Login acc

  Scenario: Login to system
    When Input to dymanic textbox "phone-login-form" with value "379999271"
    And Input to dymanic textbox "password-login-form" with value "969259"
    And Click to dynamic "login-button" button
    Then Verify text noti "Login success" is displayed in noti "Login success"
    When Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti
    And Verify "left-menu-home" text is displayed


  Scenario: Landlord can see total invoices of this month
    When Click to dynamic "left-menu-projects" page link
    And Click to dynamic "fa fa-money" first button link
    Then Verify dynamic text "" is displayed in table ""

  Scenario: As Landlord, I can see total unpay invoices of this month
    When Click to dynamic "left-menu-projects" page link
    And Click to dynamic "fa fa-money" first button link
    When I select in dynamic custom dropdown "" with item ""
    Then Verify dynamic text "" is displayed in table ""
    Then Verify dynamic text "" is displayed in table ""
    Then Verify dynamic text "" is displayed in table ""


  Scenario: As Landlord, I can see total money of this month
    When Click to dynamic "left-menu-projects" page link
    And Click to dynamic "fa fa-money" first button link
    Then Verify dynamic text "" is displayed in table ""
    Then Verify dynamic text "" is displayed in table ""
    Then Verify dynamic text "" is displayed in table ""


  Scenario: As Landlord, I can see total unpay money of this month
    When Click to dynamic "left-menu-projects" page link
    And Click to dynamic "fa fa-money" first button link
    When I select in dynamic custom dropdown "" with item ""
    Then Verify dynamic text "" is displayed in table ""
    Then Verify dynamic text "" is displayed in table ""
    Then Verify dynamic text "" is displayed in table ""








