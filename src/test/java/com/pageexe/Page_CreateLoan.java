package com.pageexe;

import com.pageobject.Locator_CreateClient;
import com.pageobject.Locator_CreateLoan;
import com.utility.BaseClass;

public class Page_CreateLoan extends Page_CreateClient {
	
	
	public void search_client_exe(String data) {
		BaseClass.impWait(15);
		BaseClass.click_Value(Locator_CreateClient.click_client_element());
 	   BaseClass.click_Value(Locator_CreateClient.click_client_element());
 	   BaseClass.click_Value(Locator_CreateClient.hover_client_element());
 	  
 	   BaseClass.input_data(Locator_CreateLoan.searchClient_element(), data);
 	   BaseClass.submit_Value(Locator_CreateLoan.searchClient_element());
	    BaseClass.click_Value(Locator_CreateLoan.selectClient_element());
	}
	
	public void create_new_loan_exe() {
		BaseClass.click_Value(Locator_CreateLoan.createLoan_element());
	}
	public void product_exe() {
		BaseClass.dropDownSelectAValue("number:7",Locator_CreateLoan.productId_element());
	}
	
	public void loan_type_exe() {
		BaseClass.click_Value(Locator_CreateLoan.loanDropbox_element());
		BaseClass.click_Value(Locator_CreateLoan.businessLoan_element());
	}
	
	public void expected_disbursement_date_exe(String data) {
		BaseClass.input_data(Locator_CreateLoan.disbursement_element(), data);
		BaseClass.click_Value(Locator_CreateLoan.disbursementDate_element());
	}
	
	public void repayment_mode_exe() {
		BaseClass.click_Value(Locator_CreateLoan.repayment_element());
		BaseClass.click_Value(Locator_CreateLoan.cash_element());
	}
	
	public void loan_page_next_exe() {
		BaseClass.click_Value(Locator_CreateLoan.pageNext_element());
	}
}
