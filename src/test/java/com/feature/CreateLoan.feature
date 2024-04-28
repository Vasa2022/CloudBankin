
Feature: Create loan
  I want to use this template for my feature file

  @tag1
  Scenario: New loan
    Given Log in to CloudBankin
    When Enter the username "qatest@habile.in"
    And Enter the pasword "Qatest123$"
    And click signin button
    And search client "vasanth P"
    And create new loan
    And select the product
    And select loan type
    And enter expected Disbursement Date "02 April 2024"
    And Select Repayment Mode
    And click loan page next 
    And enter the principle amount "1500000"
    And enter the loan Term Frequency "36"
    And select loan Term Frequency Type
    And enter number Of Repayments "36"
    And enter repayment Every "1"
    And select loan Term Frequency Type
    And select repayment Frequency Type
    And select repayment Frequency Day Of WeekType
    And enter interest Rate Per Period "10"
    And select amortization Type
    And select interest Calculation Period Type
    And click term page next
    And click lenders page next
    And click charges page next
    And click submit
    Then validate the loan
  
