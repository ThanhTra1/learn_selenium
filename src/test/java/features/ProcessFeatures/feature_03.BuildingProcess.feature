@BuildingProcess @stg
Feature:  Building process
  As a QA
  I want to check function CRUD building process
  So that verify function work well

  Scenario: Create Building
    When Click to dynamic "choose_item_project_0" a button
    When Click to dynamic "/buildings_0" action first button link
    Then Verify active page is "Buildings"
    When Click to dynamic "building_create" button
    Then Verify "Create Building" text is displayed
    And Input to dymanic textbox "name" with value "Chinh building"
    And Input to dymanic textbox "code" with value random
    And Click to dynamic "create_building" button
    Then Verify text noti "Create Building success" is displayed in noti "Create Building success"
   # And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti
    And Verify dynamic tr "2" and td "1" has text is "Chinh building"
    #And Verify dynamic text "Chinh building" is displayed in table "name_0_0"
    #And Verify dynamic text "code_0_1" is displayed random in table

  Scenario: Edit Building
    When Click to dynamic "edit_building_0" a button
    Then Verify "Edit Building" text is displayed
    When Input to dymanic textbox "name" with value random
    And Click to dynamic "create_building" button
    Then Verify text noti "Edit Building success" is displayed in noti "Edit Building success"
    And Verify dynamic tr "2" and td "1" is displayed random in table
    #And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti
   # And Verify dynamic text "code_0_1" is displayed random in table

