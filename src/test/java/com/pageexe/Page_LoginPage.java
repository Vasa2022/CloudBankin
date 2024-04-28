package com.pageexe;

import com.pageobject.Locator_LoginPage;
import com.pageobject.Locator_Terms;
import com.utility.BaseClass;

public class Page_LoginPage extends Locator_Terms {
	
	public void username_exe(String data) {
	 BaseClass.impWait(15);
	 BaseClass.input_data(Locator_LoginPage.username_element(), data);
	}
	
	public void password_exe(String data) {
	BaseClass.input_data(Locator_LoginPage.password_element(),data);
	}
	
	public void signin_exe() {
	
	BaseClass.click_Value(Locator_LoginPage.login_button_element());
	    
	}

}
