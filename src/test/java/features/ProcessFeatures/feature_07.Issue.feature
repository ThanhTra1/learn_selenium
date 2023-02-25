@Issue @stg
Feature: Issue
  As a QA
  I want to check function issue
  So that verify function work well

  Scenario: Check Project Issue Type default in new project 348
    When Click to dynamic "Projects" page link
    Then Verify active page is "Projects"
    When Click to dynamic "choose_item_project_0" a button
    And Click to dynamic "/issues_3" action first button link
    Then Verify active page is "issues"
    And Verify "Issue List" text is displayed
    When Click to dynamic "rc-tabs-0-tab-Issues_Type" page link
    And Verify "Issue Type List" text is displayed
    When Click to dynamic "rc-tabs-0-tab-Issues" page link
    When Click to dynamic "rc-tabs-0-tab-Issues_Type" page link
    Then Verify dynamic tr "2" and td "1" has text is "Other" in second page
    Then Verify dynamic tr "2" and td "2" has text is "HOUSE"
    Then Verify dynamic tr "2" and td "3" has text is "HOUSE"
    Then Verify dynamic tr "3" and td "1" has text is "Project Announcement"
    Then Verify dynamic tr "3" and td "2" has text is "PROJECT"
    Then Verify dynamic tr "3" and td "3" has text is "PROJECT"
    Then Verify dynamic tr "4" and td "1" has text is "Building Elevator"
    Then Verify dynamic tr "4" and td "2" has text is "BUILDING"
    Then Verify dynamic tr "4" and td "3" has text is "BUILDING"
    Then Verify dynamic tr "5" and td "1" has text is "House Water"
    Then Verify dynamic tr "5" and td "2" has text is "HOUSE"
    Then Verify dynamic tr "5" and td "3" has text is "HOUSE"
    Then Verify dynamic tr "6" and td "1" has text is "House Electric"
    Then Verify dynamic tr "6" and td "2" has text is "HOUSE"
    Then Verify dynamic tr "6" and td "3" has text is "HOUSE"

  Scenario: Create Issue Type with Notify Level is "Project"
 # Need verify this new issue type displays in list issue type on app or not

    When Click to dynamic "issues_type_create" button
    Then Verify "Create Issue Type" text is displayed
    When Input to dymanic textbox "name" with value "security"
    And I click to dynamic "issue_level" dropdown list
    And I click to dynamic "option-issue_level-2" dropdown list
    And I click to dynamic "notify_level" dropdown list
    And I click to dynamic "option-notify_level-2" dropdown list
    And Click to dynamic "create_issues_type" button
    Then Verify text noti "Create Issue Type success" is displayed in noti "Create Issue Type success"
    Then Verify dynamic tr "2" and td "1" has text is "security" in second page
    And Verify dynamic tr "2" and td "2" has text is "PROJECT"
    And Verify dynamic tr "2" and td "3" has text is "PROJECT"
    And Click to dynamic "rc-tabs-0-tab-Issues" page link
    Then Verify "Issue List" text is displayed
    When Click to dynamic "issues_create" button
    Then Verify "Create Issue" text is displayed
    Then Verify dynamic text "security" in list "option" with dropdown "issue_type_id"
    When Click to dynamic "cancel_issues" button


  Scenario: Create new issue Type
    When Click to dynamic "rc-tabs-0-tab-Issues_Type" page link
    And Click to dynamic "issues_type_create" button
    Then Verify "Create Issue Type" text is displayed
    When Input to dymanic textbox "name" with value "Hành Lang"
    And Click to dynamic "create_issues_type" button
    Then Verify text noti "Create Issue Type success" is displayed in noti "Create Issue Type success"
    And Verify dynamic tr "2" and td "1" has text is "Hành Lang" in second page
    And Verify dynamic tr "2" and td "2" has text is "HOUSE"
    And Verify dynamic tr "2" and td "3" has text is "HOUSE"
    When Click to dynamic "rc-tabs-0-tab-Issues" page link
    Then Verify "Issue List" text is displayed
    When Click to dynamic "issues_create" button
    Then Verify "Create Issue" text is displayed
    And Verify dynamic text "Hành Lang" disable list "option" with dropdown "issue_type_id"
    When Click to dynamic "cancel_issues" button


  Scenario: Landlord can disable Issue Type

    When Click to dynamic "rc-tabs-0-tab-Issues_Type" page link
    When Hover to dynamic "create_or_edit_issues_type_3" button
    Then Verify dynamic text tooltip "View" is display in tooltip "View"
    When Click to dynamic "create_or_edit_issues_type_3" a button
    Then Verify "Edit Issue Type" text is displayed
    When I select in dynamic custom dropdown "option-item-0" with list item "option" item "Disable"
    And Click to dynamic "create_issues_type" button
    Then Verify text noti "Edit Issue Type success" is displayed in noti "Edit Issue Type success"
    Then Verify dynamic tr "2" and td "1" has text is "Project Announcement" in second page
    Then Verify dynamic tr "2" and td "2" has text is "PROJECT"
    Then Verify dynamic tr "2" and td "3" has text is "PROJECT"
    Then Verify dynamic tr "2" and td "5" has text is "Disable"
    When Click to dynamic "rc-tabs-0-tab-Issues" page link
    And Click to dynamic "issues_create" button
   # Then Verify "Create Issue" text is not displayed
    Then Verify dynamic text "Project Announcement" disable list "option" with dropdown "issue_type_id"


  Scenario: create Annunciation for a Building
    When Click to dynamic "rc-tabs-0-tab-Issues" page link
    And Click to dynamic "issues_create" button
    Then Verify "Create Issue" text is displayed
    When I click to dynamic "issue_type_id" dropdown list
    And I click to dynamic "option-issue_type_id-0" dropdown list
    Then Verify "Location" text is displayed
    When I click to dynamic "location_id" dropdown list
    And I click to dynamic "option-location_id-0" dropdown list

   # When I select in dynamic custom dropdown "location_id" with list item "option" item random
    And Input to dynamic textarea "message" with value "Test create Annunciation for a Building"
    And Click to dynamic "create_issues" button
    Then Verify text noti "Create Issue success" is displayed in noti "Create Issue success"
    Then Verify dynamic tr "2" and td "1" has text is "84388933459"
    And Verify dynamic tr "2" and td "2" has text is "Building Elevator"
    And Verify dynamic tr "2" and td "5" has text is "CLOSED"
    And Verify dynamic tr "2" and td "3" is displayed random in table
   # And Verify dynamic text "location_0_2" is displayed random in table
    #When Hover to dynamic "button_view_modal_0" button
    #Then Verify dynamic text tooltip "View" is display in tooltip "View"


    When Click to dynamic "show_detail_0" a button
    Then Verify "Issue Detail" text is displayed
    And  Verify dynamic "creator-value" with text "84388933459"
    And  Verify dynamic "status-value" with text "CLOSED"
    And  Verify dynamic "conversations" with text "Conversations"
    And  Verify dynamic "name-item-0" with text "84388933459"
    And  Verify dynamic "message-0" with text "Test create Annunciation for a Building"
    And  Verify dynamic "time-value" is Next 1 Hour
    When Click to dynamic "ant-modal-close" button close noti
    Then Verify "Issue Detail" text is not displayed


  Scenario: create Annunciation for a project
    When Click to dynamic "issues_create" button
    And I click to dynamic "issue_type_id" dropdown list
    And I click to dynamic "option-issue_type_id-1" dropdown list
    And Input to dynamic textarea "message" with value "Test create Annunciation for a project"
    And Click to dynamic "create_issues" button
    Then Verify text noti "Create Issue success" is displayed in noti "Create Issue success"
    Then Verify dynamic tr "2" and td "1" has text is "84388933459"
    And Verify dynamic tr "2" and td "2" has text is "security"
    And Verify dynamic tr "2" and td "5" has text is "CLOSED"

    When Click to dynamic "show_detail_0" a button
    Then Verify "Issue Detail" text is displayed
    And  Verify dynamic "creator-value" with text "84388933459"
    And  Verify dynamic "status-value" with text "CLOSED"
    And  Verify dynamic "conversations" with text "Conversations"
    And  Verify dynamic "name-item-0" with text "84388933459"
    And  Verify dynamic "message-0" with text "Test create Annunciation for a project"
    And  Verify dynamic "time-value" is Next 1 Hour
    When Click to dynamic "ant-modal-close" button close noti
    Then Verify "Issue Detail" text is not displayed


  Scenario:  can not update status and note a close Issue

    When Click to dynamic "show_detail_0" a button
    Then Verify "Issue Detail" text is displayed
    And  Verify dynamic "creator-value" with text "84388933459"
    And  Verify dynamic "status-value" with text "CLOSED"
    And  Verify dynamic "conversations" with text "Conversations"
    And  Verify dynamic "name-item-0" with text "84388933459"
    And  Verify dynamic "name-item-0" with text "84388933459"
    And  Verify dynamic "message-0" with text "Test create Annunciation for a project"
    When Click to dynamic "ant-modal-close" button close noti
    Then Verify "Issue Detail" text is not displayed













