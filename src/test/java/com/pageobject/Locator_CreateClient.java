package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator_CreateClient extends Locator_LoginPage  {
	
	public static WebElement click_client_element() {
		return driver.findElement(By.xpath("(//a[@class ='nav-link text-decoration-none ng-binding dropdown-toggle'])[1]"));
	}
	public static WebElement hover_client_element() {
		return driver.findElement(By.xpath("(//a[text()='Clients'] )[1]"));
	}
	
	public static WebElement client_createbutton_element() {
		return driver.findElement(By.xpath("//a[@id='client_createbutton']"));
	}
	
	public static WebElement office_element() {
		return driver.findElement(By.xpath("//select[@id='officeId']"));
	}
	public static WebElement legal_form_element() {
		return driver.findElement(By.xpath("//select[@id='legalFormId']"));
	}
	public static WebElement first_name_element() {
		return driver.findElement(By.xpath("//input[@id='firstname']"));
	}
	public static WebElement last_name_element() {
		return driver.findElement(By.xpath("//input[@id='lastname']"));
	}
	public static WebElement mobile_number_element() {
		return driver.findElement(By.xpath("//input[@id='mobileNo']"));
	}
	public static WebElement date_of_birth_element() {
		return driver.findElement(By.xpath("//input[@id='dateofbirth']"));
	}
	public static WebElement date_of_birth_20_element() {
		return driver.findElement(By.xpath("(//span[text()='20'])[1]"));
	}
	
//	public static WebElement client_type_Id() {
//		return driver.findElement(By.xpath("//select[@id='clienttypeId']"));
//	}
	public static WebElement client_income_dropdown_element() {
		return driver.findElement(By.xpath("(//a[@class='chosen-single'])[5]"));
	}
	public static WebElement client_income_salaried_element() {

      return driver.findElement(By.xpath("//li[text()='Salaried']"));
	}
	public static WebElement externalId_element() {
      return driver.findElement(By.xpath("//input[@id='externalId']"));
	}
	public static WebElement activeCheckBox_element() {
	      return driver.findElement(By.xpath("//input[@id='activeCheckbox']"));
		}
	public static WebElement clientEmail_element() {
	      return driver.findElement(By.xpath("//input[@id='emailAddress']"));
		}
	
	public static WebElement genderDropdown_element() {
		return driver.findElement(By.xpath("//span[text()='--Select Gender--']"));
		}
	public static WebElement genderDropdownValue_element() {
		return driver.findElement(By.xpath("//li[text()='Male']"));
		}
	public static WebElement click_address_element() {
	      return driver.findElement(By.xpath("(//button[@class='fa fa-plus btn btn-default'])[2]"));
		}
	public static WebElement address_textbox_element() {
	      return driver.findElement(By.xpath("(//a[@class='chosen-single'])[9]"));
		}
	public static WebElement permanent_textbox_element() {
	      return driver.findElement(By.xpath("//li[text()='Permanent']"));
		}
	
	public static WebElement street_element() {
	      return driver.findElement(By.xpath("//input[@name='street0']"));
		}
	public static WebElement addressline1_element() {
	      return driver.findElement(By.xpath("//input[@name='addressline1']"));
		}
	public static WebElement postalCode_element() {
	      return driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty'])[4]"));
		}
	public static WebElement CountryDropbox_element() {
	      return driver.findElement(By.xpath("(//a[@class='chosen-single'])[10]")) ;
		}
	public static WebElement Country_element() {
	      return driver.findElement(By.xpath("//li[text()='India']"));
		}
	public static WebElement stateDropbox_element() {
	      return driver.findElement(By.xpath("(//a[@class='chosen-single'])[11]"));
		}
	public static WebElement state_element() {
	      return driver.findElement(By.xpath("//li[contains(text(),'Tamil Nadu')]"));
		}
	public static WebElement city_element() {
	      return driver.findElement(By.xpath("//input[@name='city']"));
		}
	public static WebElement client_save1_element() {
	      return driver.findElement(By.xpath("//button[@id='save']"));
		}
	
}
