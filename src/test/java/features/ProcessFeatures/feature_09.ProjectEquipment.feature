@Equipment @stg
Feature: Project Equipment
  As a QA
  I want to check function project equipment
  So that verify function work well

  Scenario: Check Equipment Type default 382
    When Click to dynamic "Projects" page link
    And Click to dynamic "choose_item_project_0" a button
    And Click to dynamic "/items_5" action first button link
    Then Verify active page is "Items"
   Then Verify "Chung Cu Testing" text is displayed
    And Verify "List Items" text is displayed
    When Click to dynamic "Item Profile" tap
    Then Verify dynamic tr "2" and td "1" has text is "Fire House" in second page
    Then Verify dynamic tr "2" and td "2" has text is "0"
    Then Verify dynamic tr "2" and td "3" has text is "Enable"
    Then Verify dynamic tr "3" and td "1" has text is "Fire Extinguisher"
    Then Verify dynamic tr "3" and td "2" has text is "0"
    Then Verify dynamic tr "3" and td "3" has text is "Enable"
    Then Verify dynamic tr "4" and td "1" has text is "Elevator"
    Then Verify dynamic tr "4" and td "2" has text is "0"
    Then Verify dynamic tr "4" and td "3" has text is "Enable"
    Then Verify dynamic tr "5" and td "1" has text is "Camera"
    Then Verify dynamic tr "5" and td "2" has text is "0"
    Then Verify dynamic tr "5" and td "3" has text is "Enable"


  Scenario: Edit Equipment Type 384
    When Click to dynamic "Projects" page link
    When Click to dynamic "Items" page link
    Then Verify active page is "Items"
    Then Verify "Chung Cu Testing" text is displayed
    When Click to dynamic "Item Profile" tap
    And Hover to dynamic "create_or_edit_item_profile_3" button
    Then Verify dynamic text tooltip "Edit" is display in tooltip "Edit"
    And Click to dynamic "create_or_edit_item_profile_3" a button
    Then Verify "Edit Item Profile" text is displayed
    When Input to dymanic textbox "name" with value "máy phát điện"
    And  I click to dynamic "status" dropdown list
    And  I click to dynamic "option-status-1" dropdown list
    And Click to dynamic "create_item_profile" button
    Then Verify text noti "Edit Item Profile success" is displayed in noti "Edit Item Profile success"
    And Verify dynamic tr "5" and td "1" has text is "máy phát điện"
    And Verify dynamic tr "5" and td "2" has text is "0"
    And Verify dynamic tr "5" and td "3" has text is "Disable"
    When Click to dynamic "Item" tap
    And Click to dynamic "item_create" button
    Then Verify "Create Item" text is displayed
    And Verify dynamic text "máy phát điện" disable list "option-profile" with dropdown "profile_name"
    When Click to dynamic "cancel_item" button

  Scenario: Create new Equipment Type

    When Click to dynamic "Item Profile" tap
    Then Verify dynamic tr "2" and td "1" has text is "Fire House" in second page
    Then Verify dynamic tr "2" and td "2" has text is "0"
    Then Verify dynamic tr "2" and td "3" has text is "Enable"
    Then Verify dynamic tr "3" and td "1" has text is "Fire Extinguisher"
    Then Verify dynamic tr "3" and td "2" has text is "0"
    Then Verify dynamic tr "3" and td "3" has text is "Enable"
    Then Verify dynamic tr "4" and td "1" has text is "Elevator"
    Then Verify dynamic tr "4" and td "2" has text is "0"
    Then Verify dynamic tr "4" and td "3" has text is "Enable"
    Then Verify dynamic tr "5" and td "1" has text is "máy phát điện"
    Then Verify dynamic tr "5" and td "2" has text is "0"
    Then Verify dynamic tr "5" and td "3" has text is "Disable"

    #select second project
    When I click to dynamic "option-item-0" dropdown list
    And I click to dynamic "option-list-project-1" dropdown list
    Then Verify dynamic tr "2" and td "1" has text is "Fire House" in second page
    Then Verify dynamic tr "2" and td "2" has text is "0"
    Then Verify dynamic tr "2" and td "3" has text is "Enable"
    Then Verify dynamic tr "3" and td "1" has text is "Fire Extinguisher"
    Then Verify dynamic tr "3" and td "2" has text is "0"
    Then Verify dynamic tr "3" and td "3" has text is "Enable"
    Then Verify dynamic tr "4" and td "1" has text is "Elevator"
    Then Verify dynamic tr "4" and td "2" has text is "0"
    Then Verify dynamic tr "4" and td "3" has text is "Enable"
    Then Verify dynamic tr "5" and td "1" has text is "Camera"
    Then Verify dynamic tr "5" and td "2" has text is "0"
    Then Verify dynamic tr "5" and td "3" has text is "Enable"

    #select first project
    When I click to dynamic "option-item-1" dropdown list
    And I click to dynamic "option-list-project-0" dropdown list
    When Click to dynamic "item_profile_create" button
    When Verify "Create Item Profile" text is displayed
    When Input to dymanic textbox "name" with value "Computer"
    And Click to dynamic "create_item_profile" button
    Then Verify text noti "Create Item Profile success" is displayed in noti "Create Item Profile success"
    Then Verify dynamic tr "2" and td "1" has text is "Computer" in second page
    Then Verify dynamic tr "2" and td "2" has text is "0"
    Then Verify dynamic tr "2" and td "3" has text is "Enable"
    Then Verify dynamic tr "3" and td "1" has text is "Fire House"
    Then Verify dynamic tr "3" and td "2" has text is "0"
    Then Verify dynamic tr "3" and td "3" has text is "Enable"
    Then Verify dynamic tr "4" and td "1" has text is "Fire Extinguisher"
    Then Verify dynamic tr "4" and td "2" has text is "0"
    Then Verify dynamic tr "4" and td "3" has text is "Enable"
    Then Verify dynamic tr "5" and td "1" has text is "Elevator"
    Then Verify dynamic tr "5" and td "2" has text is "0"
    Then Verify dynamic tr "5" and td "3" has text is "Enable"
    Then Verify dynamic tr "6" and td "1" has text is "máy phát điện"
    Then Verify dynamic tr "6" and td "2" has text is "0"
    Then Verify dynamic tr "6" and td "3" has text is "Disable"


  Scenario: create Equipment for a Building

    When Click to dynamic "Item" tap
    When I click to dynamic "option-item-0" dropdown list
    And I click to dynamic "option-list-project-1" dropdown list
    When Click to dynamic "item_create" button
    Then Verify "Create Item" text is displayed
    When I check to dynamic "checkbox_item_profile" checkbox
    Then Verify "Location" text is displayed
    #When I select in dynamic custom dropdown "building_id" with list item "option-building" item random
    When I click to dynamic "building_id" dropdown list
    And I click to dynamic "option-building_id-0" dropdown list
    And I click to dynamic "profile_name" dropdown list
    And I click to dynamic "option-profile_name-3" dropdown list
    And Input to dymanic textbox "item_name" with value "Camera #1"
    And Click to dynamic "create_item" button
    Then Verify text noti "Create Item success" is displayed in noti "Create Item success"
    And Verify dynamic tr "2" and td "1" has text is "Camera #1"
    Then Verify dynamic tr "2" and td "2" has text is value random name
    Then Verify dynamic tr "2" and td "3" has text is "Enable"

  Scenario:  create Equipment for Project

    When Click to dynamic "item_create" button
    Then Verify "Create Item" text is displayed
    And I click to dynamic "profile_name" dropdown list
    And I click to dynamic "option-profile_name-3" dropdown list
    And Input to dymanic textbox "item_name" with value "Camera #201"
    And Click to dynamic "create_item" button
    Then Verify text noti "Create Item success" is displayed in noti "Create Item success"
    And Verify dynamic tr "2" and td "1" has text is "Camera #201"
    Then Verify dynamic tr "2" and td "2" has text is value random name
    Then Verify dynamic tr "2" and td "3" has text is "Enable"

  Scenario: upload image to a available item
    When Click to dynamic "Items" page link
    When I click to dynamic "option-item-0" dropdown list
    And I click to dynamic "option-list-project-1" dropdown list
    When Hover to dynamic "create_or_edit_item_0" button
    Then Verify dynamic text tooltip "Edit" is display in tooltip "Edit"
    When Click to dynamic "create_or_edit_item_0" a button
    Then Verify "Edit Item" text is displayed
    And I enter dynamic "img" hidden element with value "\src\test\resources\image\camera-wifi-hong-ngoai.jpg"
    Then Check dynamic "img_url" image display
    And Click to dynamic "create_item" button
    Then Verify text noti "Edit Item success" is displayed in noti "Edit Item success"

  Scenario: Create Equipment with Image Upload
    When Click to dynamic "item_create" button
    Then Verify "Create Item" text is displayed
    And I click to dynamic "profile_name" dropdown list
    And I click to dynamic "option-profile_name-3" dropdown list
    And Input to dymanic textbox "item_name" with value "Camera #10"
    And I enter dynamic "img" hidden element with value "\src\test\resources\image\camera-wifi-hong-ngoai.jpg"
    Then Check dynamic "img_url" image display
    And Click to dynamic "create_item" button
    Then Verify text noti "Create Item success" is displayed in noti "Create Item success"
    And Verify dynamic tr "2" and td "1" has text is "Camera #10"
    Then Verify dynamic tr "2" and td "2" has text is value random name
    Then Verify dynamic tr "2" and td "3" has text is "Enable"

  Scenario: Create new log
    When Hover to dynamic "create_log_0" button
    Then Verify dynamic text tooltip "Logs" is display in tooltip "Logs"
    When Click to dynamic "create_log_0" a button
    Then Verify active page is "Logs"
    And Verify "Camera #10" text is displayed
    When Click to dynamic "log_create" button
    Then Verify "Create Log" text is displayed
    When Input to dynamic textarea "description" with value "Camera Maintain"
    And Click to dynamic "save_log" button
    Then Verify dynamic tr "2" and td "1" has text is "Camera Maintain"
    And  Verify dynamic tr "2" and td "2" has text is "84388933459"
    And Verify dynamic tr "2" and td "3" has text is today date

  Scenario: create log without description
    When Click to dynamic "log_create" button
    Then Verify "Create Log" text is displayed
    And Click to dynamic "save_log" button
    Then Verify text noti "The description field is required." is displayed in noti "The description field is required."
    When Click to dynamic "cancel_log" button

  Scenario: Create second log
    When Click to dynamic "log_create" button
    Then Verify "Create Log" text is displayed
    When Input to dynamic textarea "description" with value "Camera fixed"
    And Click to dynamic "save_log" button
    Then Verify dynamic tr "2" and td "1" has text is "Camera fixed"
    And  Verify dynamic tr "2" and td "2" has text is "84388933459"
    And Verify dynamic tr "2" and td "3" has text is today date


