@HouseProcess @stg
Feature: House process
  As a QA
  I want to check function CRUD building process
  So that verify function work well

  Scenario: Create House
    When Click to dynamic "house_building_0" a button
    Then Verify active page is "Houses"
    When Click to dynamic "house_create" button
    Then Verify "Create House" text is displayed
    And Input to dymanic textbox "name" with value "Chinh House"
    And Input to dymanic textbox "code" with value random
    And Input to dymanic textbox "phone_owner" with value "84379934271"
    And Input to dymanic textbox "square_area" with value "92"
    And Click to dynamic "create_house" button
    Then Verify text noti "Create House success" is displayed in noti "Create House success"
    And Verify dynamic tr "2" and td "1" has text is "Chinh House"
    And Verify dynamic tr "2" and td "2" is displayed random in table
   # And Click to dynamic "Toastify__close-button Toastify__close-button--success" button close noti
    #And Verify dynamic text "Chinh House" is displayed in table "name_0_0"
    #And Verify dynamic text "code_0_1" is displayed random in table
    #And Verify dynamic text "84379934271" is displayed in table "phone_owner_0_2"
    #And Verify dynamic text "Available" is displayed in table "house_status_0_3"
    #And Verify dynamic text "92" is displayed in table "square_area_0_4"

  Scenario: Edit House
    When Click to dynamic "edit_house_0" a button
    And Input to dymanic textbox "name" with value random
    And Input to dymanic textbox "square_area" with value "95"
    And Click to dynamic "create_house" button
    Then Verify text noti "Edit House success" is displayed in noti "Edit House success"
    And Verify dynamic tr "2" and td "1" is displayed random in table
    #And Verify dynamic text "name_0_0" is displayed random in table
    #And Verify dynamic text "code_0_1" is displayed random in table
    #And Verify dynamic text "84379934271" is displayed in table "phone_owner_0_2"
    #And Verify dynamic text "Available" is displayed in table "house_status_0_3"
    #And Verify dynamic text "95" is displayed in table "square_area_0_4"
