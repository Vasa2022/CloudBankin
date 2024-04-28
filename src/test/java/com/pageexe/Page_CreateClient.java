package com.pageexe;

import com.pageobject.Locator_CreateClient;
import com.utility.BaseClass;

public class Page_CreateClient extends Page_LoginPage {
    	
    	public void create_client() {
    	   BaseClass.click_Value(Locator_CreateClient.click_client_element());
    	   BaseClass.click_Value(Locator_CreateClient.click_client_element());
    	   BaseClass.click_Value(Locator_CreateClient.hover_client_element());
    	   BaseClass.click_Value(Locator_CreateClient.client_createbutton_element());
    	}
    	
    	public void select_office() {
    		BaseClass.dropDownSelectAValue("number:1", Locator_CreateClient.office_element());   
    	}
    	
    	public void select_legal_form() {
    		BaseClass.dropDownSelectAValue("number:1", Locator_CreateClient.legal_form_element());
    	}
    	
    	public void first_name(String data) {
    	    BaseClass.input_data(Locator_CreateClient.first_name_element(), data);
    	}
    	
    	public void last_name(String data) {
    		 BaseClass.input_data(Locator_CreateClient.last_name_element(), data);
    	}
    	
    	public void mobile_number(String data) {
    		BaseClass.input_data(Locator_CreateClient.mobile_number_element(), data);
    	}
    	
    	public void client_dob(String dob) {
    		BaseClass.input_data(Locator_CreateClient.date_of_birth_element(), dob);
    		BaseClass.click_Value(Locator_CreateClient.date_of_birth_20_element());
    	}
    	
    	public void client_type() {
    	
    		BaseClass.click_Value(Locator_CreateClient.client_income_dropdown_element());
    		BaseClass.click_Value(Locator_CreateClient.client_income_salaried_element());
    	}
    	public void external_id(String data) {
    		BaseClass.input_data(Locator_CreateClient.externalId_element(), data);
    	}
    	
    	public void active_button() {
    		BaseClass.click_Value(Locator_CreateClient.activeCheckBox_element());  
    	}
    	
    	public void email(String email) {
    		BaseClass.input_data(Locator_CreateClient.externalId_element(), email);
    	}
    	
    	public void gender() {
    		BaseClass.click_Value(Locator_CreateClient.genderDropdown_element());
    		BaseClass.click_Value(Locator_CreateClient.genderDropdownValue_element());
    	   
    	}
    	
    	public void address_type() {
    		
    		BaseClass.click_Value(Locator_CreateClient.click_address_element());
    		BaseClass.click_Value(Locator_CreateClient.address_textbox_element());
    	}
    	
    	public void street(String data) {
    	   BaseClass.input_data(Locator_CreateClient.street_element(), data);
    	}
    	
    	public void addres_line1(String data) {
    		BaseClass.input_data(Locator_CreateClient.addressline1_element(), data);
    	}
    	
    	public void postal_code(String data) {
    		BaseClass.input_data(Locator_CreateClient.postalCode_element(), data);
    	   
    	}
    	
    	public void country() {
    	    BaseClass.click_Value(Locator_CreateClient.CountryDropbox_element());
    	    BaseClass.click_Value(Locator_CreateClient.Country_element());
    	}
    	
    	public void state() {
    		BaseClass.click_Value(Locator_CreateClient.stateDropbox_element());
    	    BaseClass.click_Value(Locator_CreateClient.state_element());
    	}
    	
    	public void city(String data) {
    		BaseClass.input_data(Locator_CreateClient.city_element(), data);
    	}
    	
    	public void client_submit() {
    		BaseClass.click_Value(Locator_CreateClient.client_save1_element());
    	   
    	}
    	
    	public void validate_client_is_created() {
    		
    		System.out.println("client created");
    	
    	}
}
