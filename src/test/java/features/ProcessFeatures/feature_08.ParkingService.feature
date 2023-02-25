@Parking @stg
Feature: Parking service
  As a QA
  I want to check function parking service
  So that verify function work well

  Scenario: Check parking service type default 236 235
    When Click to dynamic "Projects" page link
    And Click to dynamic "choose_item_project_0" a button
    And Click to dynamic "/parkings_4" action first button link
   #Then Verify active page is "Parkings"
    Then Verify project displayed with value random
    And Verify "Parking Service List" text is displayed
    When Click to dynamic "Parking Services Types" tap
    Then Verify dynamic tr "2" and td "1" has text is "Motorbike Parking" in second page
    Then Verify dynamic tr "2" and td "2" has text is "monthly"
    Then Verify dynamic tr "2" and td "3" has text is "3.000 ₫/days"
    Then Verify dynamic tr "2" and td "4" has text is "90.000 ₫/monthly"
    Then Verify dynamic tr "2" and td "5" has text is "Enable"
    Then Verify dynamic tr "3" and td "1" has text is "Car Parking"
    Then Verify dynamic tr "3" and td "2" has text is "monthly"
    Then Verify dynamic tr "3" and td "3" has text is "40.000 ₫/days"
    Then Verify dynamic tr "3" and td "4" has text is "1.200.000 ₫/monthly"
    Then Verify dynamic tr "3" and td "5" has text is "Enable"


  Scenario: Edit parking service type 237
    When Click to dynamic "Projects" page link
    When Click to dynamic "Parkings" page link
    Then Verify active page is "Parkings"
    Then Verify project displayed with value random
    When Click to dynamic "Parking Services Types" tap
    #When Click to dynamic "rc-tabs-1-tab-Parkings Services Types" page link
    When Hover to dynamic "create_or_edit_parking_service_type_0" button
    Then Verify dynamic text tooltip "Edit" is display in tooltip "Edit"
    And Click to dynamic "create_or_edit_parking_service_type_0" a button
    Then Verify "Edit Parking Service Type" text is displayed
    When Input to dymanic textbox "name" with value "Motorbike Parking Monthly"
    And Input to dymanic textbox "unit_price" with value "2500"
    And Click to dynamic "create_parkingservice_type" button
    Then Verify text noti "Edit Parking Service Type success" is displayed in noti "Edit Parking Service Type success"
    Then Verify dynamic tr "2" and td "1" has text is "Motorbike Parking Monthly" in second page
    Then Verify dynamic tr "2" and td "2" has text is "monthly"
    Then Verify dynamic tr "2" and td "3" has text is "2.500 ₫/days"
    Then Verify dynamic tr "2" and td "4" has text is "75.000 ₫/monthly"
    Then Verify dynamic tr "2" and td "5" has text is "Enable"


   Scenario: Create new project
     When Click to dynamic "Projects" page link
     Then Verify active page is "Projects"
     And Click to dynamic "create_edit_project" button
     Then Verify "Create Project" text is displayed
     And Input to dymanic textbox "name" with value "Chung Cu Testing"
     And Input to dymanic textbox "code" with new value random
     And Click to dynamic "create_project" button
     Then Verify text noti "Create Project success" is displayed in noti "Create Project success"
     And Verify dynamic tr "2" and td "1" has text is "Chung Cu Testing"
    # And Verify dynamic text "code_0_1" is displayed random in table

  Scenario: Create new parking service type 244
    When Click to dynamic "Parkings" page link
    Then Verify "Chung Cu Testing" text is displayed
    When Click to dynamic "Parking Services Types" tap
    Then Verify dynamic tr "2" and td "2" has text is "monthly"
    Then Verify dynamic tr "2" and td "3" has text is "3.000 ₫/days"
    Then Verify dynamic tr "2" and td "4" has text is "90.000 ₫/monthly"
    Then Verify dynamic tr "2" and td "5" has text is "Enable"

    #select second project
    When I click to dynamic "option-item-0" dropdown list
    And I click to dynamic "option-list-project-1" dropdown list
    Then Verify dynamic tr "2" and td "1" has text is "Motorbike Parking Monthly" in second page
    Then Verify dynamic tr "2" and td "2" has text is "monthly"
    Then Verify dynamic tr "2" and td "3" has text is "2.500 ₫/days"
    Then Verify dynamic tr "2" and td "4" has text is "75.000 ₫/monthly"
    Then Verify dynamic tr "2" and td "5" has text is "Enable"
    Then Verify dynamic tr "3" and td "1" has text is "Car Parking"
    Then Verify dynamic tr "3" and td "2" has text is "monthly"
    Then Verify dynamic tr "3" and td "3" has text is "40.000 ₫/days"
    Then Verify dynamic tr "3" and td "4" has text is "1.200.000 ₫/monthly"
    Then Verify dynamic tr "3" and td "5" has text is "Enable"

    #select first project
    When I click to dynamic "option-item-1" dropdown list
    And I click to dynamic "option-list-project-0" dropdown list
    When Click to dynamic "parking_service_type_create" button
    When Verify "Create Parking Service Type" text is displayed
    When Input to dymanic textbox "name" with value "Motorbike Parking Annual"
    And I select in dynamic custom dropdown "periodical_level" with list item "option-periodical" item "Annual"
    And Input to dymanic textbox "unit_price" with value "2000"
    When I click to dynamic "price_type" dropdown list
    And I click to dynamic "option-price_type-0" dropdown list
    And Click to dynamic "create_parkingservice_type" button
    Then Verify text noti "Create Parking Service Type success" is displayed in noti "Create Parking Service Type success"
    Then Verify dynamic tr "2" and td "1" has text is "Motorbike Parking Annual" in second page
    Then Verify dynamic tr "2" and td "2" has text is "annual"
    Then Verify dynamic tr "2" and td "3" has text is "2.000 ₫/days"
    Then Verify dynamic tr "2" and td "4" has text is "730.000 ₫/annual"
    Then Verify dynamic tr "2" and td "5" has text is "Enable"



  Scenario: Register Motorbike parking service 430

    When Click to dynamic "Parking Services" tap
    When I select in dynamic custom dropdown "option-item-0" with list item "option" item random
    Then Verify "All Houses" text is displayed
    When Click to dynamic "parking_service_create" button
    Then Verify "Create Parking Service" text is displayed
    When I click to dynamic "house_id" dropdown list
    And I click to dynamic "option-house_id-0" dropdown list
    When I select in dynamic custom dropdown "parking_service_id" with list item "option-item" item "Motorbike Parking Monthly"
    And Input to dymanic textbox "vehicle_number" with value "29B-567-32"
    And Click to dynamic "create_parkingservice" button
    Then Verify text noti "Create Parking Service success" is displayed in noti "Create Parking Service success"
    And Verify dynamic tr "2" and td "1" has text is "29B-567-32"
    And Verify dynamic tr "2" and td "2" has text is "Motorbike Parking Monthly"
    Then Verify dynamic tr "2" and td "3" has text is value random name
    And Verify dynamic tr "2" and td "4" has text is "monthly"
    And Verify dynamic tr "2" and td "5" has text is "2.500 ₫/days"
    And Verify dynamic tr "2" and td "6" has text is "75.000 ₫/monthly"
    And Verify dynamic tr "2" and td "7" has text is today date
    And Verify dynamic tr "2" and td "8" has text is "Enable"


  Scenario: Register Car parking service 431

   # When Click to dynamic "rc-tabs-3-tab-Parkings Services" page link
    When Click to dynamic "Parking Services" tap
    When I select in dynamic custom dropdown "option-item-0" with list item "option" item random
    #And I click to dynamic "project_id" dropdown list
    #And I click to dynamic "option-0" dropdown list
    Then Verify "All Houses" text is displayed
    When Click to dynamic "parking_service_create" button
    Then Verify "Create Parking Service" text is displayed
    And Verify "Choose house" text is displayed
   # When I select in dynamic custom dropdown "house_id" with list item "option-house" item random
    When I click to dynamic "house_id" dropdown list
    And I click to dynamic "option-house_id-0" dropdown list
    When I select in dynamic custom dropdown "parking_service_id" with list item "option-item" item "Car Parking"
    And Input to dymanic textbox "vehicle_number" with value "29B-567-33"
    And Click to dynamic "create_parkingservice" button
    Then Verify text noti "Create Parking Service success" is displayed in noti "Create Parking Service success"
    And Verify dynamic tr "2" and td "1" has text is "29B-567-33"
    And Verify dynamic tr "2" and td "2" has text is "Car Parking"
    Then Verify dynamic tr "2" and td "3" has text is value random name
    And Verify dynamic tr "2" and td "4" has text is "monthly"
    And Verify dynamic tr "2" and td "5" has text is "40.000 ₫/days"
    And Verify dynamic tr "2" and td "6" has text is "1.200.000 ₫/monthly"
    And Verify dynamic tr "2" and td "7" has text is today date
    And Verify dynamic tr "2" and td "8" has text is "Enable"

  Scenario: Change status parking service

    When Hover to dynamic "create_or_edit_parking_service_0" button
    Then Verify dynamic text tooltip "Edit" is display in tooltip "Edit"
    When Click to dynamic "create_or_edit_parking_service_1" a button
    Then Verify "Edit Parking Service" text is displayed
    When I click to dynamic "status" dropdown list
    And I click to dynamic "option-status-1" dropdown list
    And Click to dynamic "create_parkingservice" button
    Then Verify text noti "Edit Parking Service success" is displayed in noti "Edit Parking Service success"
    And Verify dynamic tr "3" and td "1" has text is "29B-567-32"
    And Verify dynamic tr "3" and td "2" has text is "Motorbike Parking Monthly"
    Then Verify dynamic tr "3" and td "3" has text is value random name
    And Verify dynamic tr "3" and td "4" has text is "monthly"
    And Verify dynamic tr "3" and td "5" has text is "2.500 ₫/days"
    And Verify dynamic tr "3" and td "6" has text is "75.000 ₫/monthly"
    And Verify dynamic tr "3" and td "7" has text is today date
    And Verify dynamic tr "3" and td "8" has text is "Disable"