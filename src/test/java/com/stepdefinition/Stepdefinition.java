package com.stepdefinition;

import com.pageexe.Page_Terms;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Page_Terms {
	@Given("Log in to CloudBankin")
	public void log_in_to_cloud_bankin() {
		browserLaunch("chrome", "https://qatest.uat.cloudbankin.com/");

	}
	@When("Enter the username {string}")
	public void enter_the_username(String data) {
		username_exe(data);
	}
	@When("Enter the pasword {string}")
	public void enter_the_pasword(String data) {
	password_exe(data);
	}
	@When("click signin button")
	public void click_signin_button() {
		signin_exe();

	}
	@When("search client {string}")
	public void search_client(String data) {
		search_client_exe(data);
	}

	@When("create new loan")
	public void create_new_loan() {
	   create_new_loan_exe();
	}
	@When("select the product")
	public void select_the_product() {
		product_exe();
	}
	@When("select loan type")
	public void select_loan_type() {
		loan_type_exe();
	}
	@When("enter expected Disbursement Date {string}")
	public void enter_expected_disbursement_date(String data) {
	   expected_disbursement_date_exe(data);
	}
	@When("Select Repayment Mode")
	public void select_repayment_mode() {
		repayment_mode_exe();
	}
	@When("click loan page next")
	public void click_loan_page_next() {
		loan_page_next_exe();
	}
	@When("enter the principle amount {string}")
	public void enter_the_principle_amount(String principal) {
		principle_amount_exe(principal);
	}
	@When("enter the loan Term Frequency {string}")
	public void enter_the_loan_term_frequency(String data) {
		loan_term_frequency_exe(data);
	}
	@When("select loan Term Frequency Type")
	public void select_loan_term_frequency_type() {
		loan_term_frequency_type_exe();
	}
	@When("enter number Of Repayments {string}")
	public void enter_number_of_repayments(String data) {
		number_of_repayments_exe(data);
	}
	@When("enter repayment Every {string}")
	public void enter_repayment_every(String data) {
		repayment_every_exe(data);
	}
	@When("select repayment Frequency Type")
	public void select_repayment_frequency_type() {
		repayment_frequency_type_exe();
	}
	@When("select repayment Frequency Day Of WeekType")
	public void select_repayment_frequency_day_of_week_type() {
		 repayment_frequency_day_of_week_type_exe();
	}
	@When("enter interest Rate Per Period {string}")
	public void enter_interest_rate_per_period(String data) {
		interest_rate_per_period_exe(data);
	}
	@When("select amortization Type")
	public void select_amortization_type() {
		amortization_type_exe();
	}
	@When("select interest Calculation Period Type")
	public void select_interest_calculation_period_type() {
		interest_calculation_period_type_exe();
	}
	@When("click term page next")
	public void click_term_page_next() {
		term_page_next_exe();
	}
	@When("click lenders page next")
	public void click_lenders_page_next() {
		lenders_page_next_exe();
	}
	@When("click charges page next")
	public void click_charges_page_next() {
		charges_page_next_exe();
	}
	@When("click submit")
	public void click_submit() {
		review_submit_exe();
	}
	@Then("validate the loan")
	public void validate_the_loan() {
		approve_loan_exe();
	    System.out.println("loan approved");
	}

}



	
