package com.pageexe;

import com.pageobject.Locator_Terms;
import com.utility.BaseClass;

public class Page_Terms extends Page_CreateLoan{
	
	public void principle_amount_exe(String principal) {
	    BaseClass.clear_Value(Locator_Terms.principal_element());
	    BaseClass.input_data(Locator_Terms.principal_element(), principal);
	}
	
	public void loan_term_frequency_exe(String data) {
		BaseClass.clear_Value(Locator_Terms.loanTermFrequency_element());
	    BaseClass.input_data(Locator_Terms.loanTermFrequency_element(),data);
	}
	
	public void loan_term_frequency_type_exe() {
	    BaseClass.selectByVisibleText(Locator_Terms.loanTermFrequencyType_element(), "Months");
	}
	
	public void number_of_repayments_exe(String data) {
		BaseClass.clear_Value(Locator_Terms.numberOfRepayments_element());
	    BaseClass.input_data(Locator_Terms.numberOfRepayments_element(),data);
	}
	
	public void repayment_every_exe(String data) {
		BaseClass.clear_Value(Locator_Terms.repaymentEvery_element());
	    BaseClass.input_data(Locator_Terms.repaymentEvery_element(),data);
	}
	
	public void repayment_frequency_type_exe() {
		BaseClass.selectByVisibleText(Locator_Terms.loanTermFrequencyType2_element(), "Months");
	}
	
	public void repayment_frequency_day_of_week_type_exe() {
		BaseClass.selectByVisibleText(Locator_Terms.repaymentFrequencyDayOfWeekType_element(), "MONDAY");
	}
	
	public void interest_rate_per_period_exe(String data) {
		BaseClass.clear_Value(Locator_Terms.interestRate_element());
	    BaseClass.input_data(Locator_Terms.interestRate_element(),data);
	}
	
	public void amortization_type_exe() {
		BaseClass.selectByVisibleText(Locator_Terms.amortization_element(), "Equal principal payments");
	}
	
	public void interest_calculation_period_type_exe() {
		BaseClass.selectByVisibleText(Locator_Terms.interestCalculationPeriodType_element(), "Same as repayment period");
	}
	
	public void term_page_next_exe() {
		BaseClass.click_Value(Locator_Terms.termsNext_element());
	}
	   
	public void lenders_page_next_exe() {
		BaseClass.click_Value(Locator_Terms.lendersNext_element());
	}
	
	
	public void charges_page_next_exe() {
		BaseClass.click_Value(Locator_Terms.chargesNext_element1());
	}
	
	public void review_submit_exe() {
		BaseClass.click_Value(Locator_Terms.reviewSubmit_element1());
	    
	}
	public void approve_loan_exe() {
		BaseClass.click_Value(Locator_Terms.approve_button_element());
		BaseClass.click_Value(Locator_Terms.approve_submit_element());
	}
}
