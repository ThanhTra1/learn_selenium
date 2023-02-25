Feature: Dynamic Element Component

  @teamplate @feature_convension
  Scenario: Page Component Template
    #-----------------------------ACTION---------------------
    Given I open application


    When Hover to dynamic "" button

    #Button
    Given Click to dynamic "" button
    And I click to dynamic "" api google button

    #Link
    And Click to dynamic "" page link
    And Click to dynamic "" subpage link
    And Click to dynamic "" action first button link
    And Click to dynamic "" post button link
    And Click to dynamic "" button close noti




    #Dropdown
    When I select in dynamic dropdown "" with item ""
    When I select in dynamic custom dropdown "" with item ""
    When I click to dynamic "" dropdown list

    # Check box
    And I check to dynamic "" checkbox
    
    #textbox
    And Input to dymanic textbox "" with value ""
    
    
    And Input to dymanic textbox api google "" with value ""
    And Input to dymanic textbox "" with value random
    And Input to dymanic textbox "" with number random
    
    #Textarea
    And Input to dynamic textarea "" with value ""

    #Checkbox/ Radio
    And Click to dynamic "" radio or checkbox


    #Alert
    And Get text dynamic in alert ""
    And Accept dynamic in alert

    # --------------------------VERIFY----------------------
    Then Verify dynamic text tooltip "" is display in tooltip ""
    Then Verify text noti "" is displayed in noti ""
    Then Verify dynamic text "" is display "" of page
    And Verify dynamic text "" is displayed in table ""
    And Verify dynamic text "" is displayed in table
    And Get text in dynamic "" noti
    And Verify "" text is displayed


    #Parking page
    When Click to dynamic "" tap

    Then Verify dynamic tr "<string>" and td "<string>" has text is today date
    Then Verify dynamic tr "<string>" and td "<string>" has text is value random name

    #upload image
    When Upload image with impage path is ""