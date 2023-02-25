@ProjectProcess @stg
Feature: Project process
  As a QA
  I want to check function create and edit project process
  So that verify function work well

  Scenario: Create project
    When Click to dynamic "Projects" page link
    Then Verify active page is "Projects"
    And Click to dynamic "create_edit_project" button
    Then Verify "Create Project" text is displayed
    And Input to dymanic textbox "name" with value "Chung Cu Testing"
    And Input to dymanic textbox "code" with value random
    And Click to dynamic "create_project" button
    Then Verify text noti "Create Project success" is displayed in noti "Create Project success"
    And Verify dynamic tr "2" and td "1" has text is "Chung Cu Testing"
    And Verify dynamic tr "2" and td "2" is displayed random in table
  #  And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti
 #  And Verify dynamic text "Chung Cu Testing" is displayed in table
   # And Verify dynamic text "Chung Cu Testing" is displayed in table "name_0_0"
  #  And Verify dynamic text "code_0_1" is displayed random in table


  Scenario: Edit project
#    When Hover to tooltip dynamic "button_project_edit_0" first button link
    When Click to dynamic "edit_project_0" a button
    Then Verify "Edit Project" text is displayed
    And Input to dymanic textbox "name" with value random
    And Click to dynamic "create_project" button
    Then Verify text noti "Edit Project success" is displayed in noti "Edit Project success"
    #And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti
   # And Verify dynamic text "name_0_0" is displayed random in table


