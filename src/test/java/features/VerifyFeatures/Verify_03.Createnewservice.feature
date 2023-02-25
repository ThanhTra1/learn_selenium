@newservice @Verify
Feature: Create New Service with Period is Monthly
  As a QA
  I want to check function Create New Service with Period is Monthly
  So that verify function work well

  Scenario: Landlord can create New Service with Period is Monthly
    When Input to dymanic textbox "new_name" with value "Chinh test ahihi"
    And Input to dymanic textbox "new_unit_price" with value "7000"
    And I click to dynamic "house_service_periodical" dropdown list
    And I click to dynamic "react-select-2-option-1" dropdown list
    And I click to dynamic "house_service_unit_price_type" dropdown list
    And I click to dynamic "react-select-3-option-0" dropdown list
    And Click to dynamic "create_house_service" button
    Then Verify text noti "Create house service success" is displayed in noti "Create house service success"
    Then Verify dynamic text "Chinh ne ahihi" is displayed in table "name_0_0"
    Then Verify dynamic text "monthly" is displayed in table "period_0_1"
    Then Verify dynamic text "months" is displayed in table "unit_price_type_0_2"
    Then Verify dynamic text "7.000 ₫" is displayed in table "unit_price_0_3"
    Then Verify dynamic text "Yes" is displayed in table "register_by_default_0_4"

