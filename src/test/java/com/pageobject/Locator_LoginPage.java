package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utility.BaseClass;

public class Locator_LoginPage extends BaseClass {
	public static WebElement username_element() {
		return driver.findElement(By.xpath("//input[@id='uid']"));
	}
	public static WebElement password_element() {
		return driver.findElement(By.xpath("//input[@id='pwd']"));
	}
	public static WebElement login_button_element() {
		return driver.findElement(By.xpath("(//button[text()='Sign In'])[1]"));  //button[text()='Sign In'])[1]
	}

}
