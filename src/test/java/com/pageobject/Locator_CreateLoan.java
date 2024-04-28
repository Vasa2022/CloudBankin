package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator_CreateLoan extends Locator_CreateClient{
	public static WebElement searchClient_element() {
		return driver.findElement(By.xpath("//input[@data-ng-model='searchText']"));
	}
	public static WebElement selectClient_element() {
		return driver.findElement(By.xpath("//tr[@class='pointer-main ng-scope']//td[contains(text(),'vasanth')]"));
	}
	public static WebElement createLoan_element() {
		return driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-offset ng-binding'])[2]"));
	}
	public static WebElement productId_element() {
		return driver.findElement(By.xpath("(//select[@id='productId'])"));
	}
	public static WebElement loanDropbox_element() {
		return driver.findElement(By.xpath("(//a[@class='chosen-single'])[2]"));
	}
	public static WebElement businessLoan_element() {
		return driver.findElement(By.xpath("//li[text()='Business Loan – General']"));
	}
	public static WebElement disbursement_element() {
		return driver.findElement(By.xpath("//input[@id='expectedDisbursementDate']"));
	}
	public static WebElement disbursementDate_element() {
		return driver.findElement(By.xpath("(//span[text()='02'])[3]"));
	}
	public static WebElement repayment_element() {
		return driver.findElement(By.xpath("//span[text()='Select Repayment Mode']"));	
	}
	public static WebElement cash_element() {
		return driver.findElement(By.xpath("//li[text()='Cash/Cheque']"));	
	}
	public static WebElement pageNext_element() {
		return driver.findElement(By.xpath("(//button[@class='btn btn-default pull-right'] )[1]"));	
	}
	
}
