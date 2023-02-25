@DeleteProject @Verify
Feature: CRUD project process
  As a QA
  I want to check function CRUD project process
  So that verify function work well

  Scenario: Login to system
    When Input to dymanic textbox "phone-login-form" with value "379934271"
    And Input to dymanic textbox "password-login-form" with value "123123"
    And Click to dynamic "login-button" button
    Then Verify "left-menu-home" text is displayed
    And Verify text noti "Login success" is displayed in noti "Login success"
    And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti

  Scenario: Create project
    When Click to dynamic "left-menu-projects" page link
    And Input to dymanic textbox "new_name" with value "Chung Cu Testing"
    And Input to dymanic textbox "new_code_name" with value random
    And Click to dynamic "create_project" button
    Then Verify text noti "Create Project success" is displayed in noti "Create Project success"
    And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti

  Scenario: Edit project
    When Click to dynamic "fa fa-edit" first button link
    And Input to dymanic textbox "edit_project_name" with value random
    And Click to dynamic "edit_project" button
    Then Verify text noti "Edit Project success" is displayed in noti "Edit Project success"
    And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti

  Scenario: Delete project
    When Click to dynamic "fa fa-trash-o" first button link
    And Accept dynamic in alert
    Then Verify text noti "Delete Project success" is displayed in noti "Delete Project success"
    And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti

