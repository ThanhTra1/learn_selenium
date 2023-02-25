@ApartmentService @stg
Feature: Apartment Service
  As a QA
  I want to check function Login to systeam and CRUD Process
  So that verify function work well

  Scenario: Landlord can see default "Apartment Service"
    When Click to dynamic "Projects" page link
    Then Verify active page is "Projects"
    When Click to dynamic "choose_item_project_0" a button
    And Click to dynamic "/house-services_1" action first button link
    Then Verify active page is "House Services"
    And Verify dynamic tr "2" and td "1" has text is "Apartment Service"
    And Verify dynamic tr "2" and td "4" has text is "7.000 đ"


  Scenario: Landlord can change "Apartment Service" Unit Price
    When Hover to dynamic "edit_house_invoice_0" button
    Then Verify dynamic text tooltip "Edit" is display in tooltip "Edit"
    When Click to dynamic "edit_house_invoice_0" a button
    Then Verify "Edit House Service" text is displayed
    And Input to dymanic textbox "unit_price" with value "8000"
    And Click to dynamic "create_house_service" button
    Then Verify text noti "Edit House Service success" is displayed in noti "Edit House Service success"
    And Verify dynamic tr "2" and td "1" has text is "Apartment Service"
    And Verify dynamic tr "2" and td "4" has text is "8.000 đ"


  Scenario: Landlord can change "Apartment Service" Service Name
    When Click to dynamic "edit_house_invoice_0" a button
    Then Verify "Edit House Service" text is displayed
    And Input to dymanic textbox "house_service_name" with value "Apartment Service 01"
    And Click to dynamic "create_house_service" button
    Then Verify text noti "Edit House Service success" is displayed in noti "Edit House Service success"
    And Verify dynamic tr "2" and td "1" has text is "Apartment Service 01"
    And Verify dynamic tr "2" and td "4" has text is "8.000 đ"


  Scenario: Landlord can create New Service
    When Click to dynamic "house_service_create" button
    Then Verify "Create House Service" text is displayed
    When Input to dymanic textbox "house_service_name" with value "Chinh ne ahihi"
    And Input to dymanic textbox "unit_price" with value "3000"
    And I click to dynamic "periodical" dropdown list
    And I click to dynamic "option-periodical-0" dropdown list
    And Click to dynamic "create_house_service" button
    Then Verify text noti "Create House Service success" is displayed in noti "Create House Service success"
    And Verify dynamic tr "2" and td "1" has text is "Chinh ne ahihi"
    And Verify dynamic tr "2" and td "4" has text is "3.000 đ"
    And Verify dynamic tr "2" and td "2" has text is "ONE_TIME"
    And Verify dynamic tr "2" and td "3" has text is "ONE_TIME"
    And Verify dynamic tr "2" and td "5" has text is "yes"










