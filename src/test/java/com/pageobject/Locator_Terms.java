package com.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locator_Terms  extends Locator_CreateLoan{
	public static WebElement principal_element() {
		return driver.findElement(By.xpath("//input[@id='principal']"));
	}
	public static WebElement loanTermFrequency_element() {
		return driver.findElement(By.xpath("//input[@id='loanTermFrequency']"));
	}
	
	public static WebElement loanTermFrequencyType_element() {
		return driver.findElement(By.xpath("//select[@id='loanTermFrequencyType']"));
	}
	public static WebElement numberOfRepayments_element() {
		return driver.findElement(By.xpath("//input[@id='numberOfRepayments']"));
	}
	public static WebElement repaymentEvery_element() {
		return driver.findElement(By.xpath("//input[@id='repaymentEvery']"));
	}
	public static WebElement loanTermFrequencyType2_element() {
		return driver.findElement(By.xpath("//select[@id='loanTermFrequencyType']"));
	}
	public static WebElement repaymentFrequencyType2_element() {
		return driver.findElement(By.xpath("//select[@id='repaymentFrequencyType'"));
	}
	public static WebElement repaymentFrequencyDayOfWeekType_element() {
		return driver.findElement(By.xpath("//select[@id='repaymentFrequencyDayOfWeekType']"));
	}
	public static WebElement interestRate_element() {
		return driver.findElement(By.xpath("//input[@id='interestRatePerPeriod']"));
	}
	public static WebElement amortization_element() {
		return driver.findElement(By.xpath("//select[@id='amortizationType']"));
	}
	public static WebElement interestCalculationPeriodType_element() {
		return driver.findElement(By.xpath("//select[@id='interestCalculationPeriodType']"));
	}
	public static WebElement termsNext_element() {
		return driver.findElement(By.xpath("(//button[@class='btn btn-default pull-right'])[2]"));
	}
	public static WebElement lendersNext_element() {
		return driver.findElement(By.xpath("(//button[@class='btn btn-default pull-right'])[3]"));
	}
	public static WebElement chargesNext_element1() {
		return driver.findElement(By.xpath("(//button[@class='btn btn-default pull-right'])[4]"));
	}
	public static WebElement reviewSubmit_element1() {
		return driver.findElement(By.xpath("(//button[@id='save'])"));
	}
	public static WebElement approve_button_element() {
		return driver.findElement(By.xpath("(//span[@class='btn btn-primary ng-binding ng-scope'])[2]"));
	}
	public static WebElement approve_submit_element() {
		return driver.findElement(By.xpath("//button[@id='save']"));
	}
}
