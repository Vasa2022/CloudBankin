package com.hardcode.cloudbankin;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class CloudBankin {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qatest.uat.cloudbankin.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("qatest@habile.in");
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Qatest123$");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("(//button[text()='Sign In'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//a[@class ='nav-link text-decoration-none ng-binding dropdown-toggle'])[1]"))
				.click();
		driver.findElement(By.xpath("(//a[@class ='nav-link text-decoration-none ng-binding dropdown-toggle'])[1]"))
				.click();

		driver.findElement(By.xpath("(//a[text()='Clients'] )[1]")).click();
		WebElement FindNameElement = driver.findElement(By.xpath("//input[@data-ng-model='searchText']"));
		FindNameElement.sendKeys("vasanth P");
		FindNameElement.submit();
		
//		driver.findElement(By.xpath("//a[@id='client_createbutton']")).click();
//
//		WebElement officeElement = driver.findElement(By.xpath("//select[@id='officeId']"));
//		Select sc = new Select(officeElement);
//		sc.selectByValue("number:1");
//		WebElement legalElement = driver.findElement(By.xpath("//select[@id='legalFormId']"));
//		Select sc1 = new Select(legalElement);
//		sc1.selectByValue("number:1");
//
//		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("vasanth");
//		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("P");
//		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9600000000");
//		driver.findElement(By.xpath("//input[@id='dateofbirth']")).sendKeys("20 February 1994");
//
//		driver.findElement(By.xpath("(//span[text()='20'])[1]")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("(//a[@class='chosen-single'])[5]")).click();
//		driver.findElement(By.xpath("//li[text()='Salaried']")).click();
//
//		driver.findElement(By.xpath("//input[@id='externalId']")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@id='activeCheckbox']")).click();
//		// driver.findElement(By.xpath("//input[@id='submittedon']")).clear().sendKeys("31
//		// March 2024");
//		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("vasanth@gmail.com");
//
//		driver.findElement(By.xpath("//span[text()='--Select Gender--']")).click();
//		driver.findElement(By.xpath("//li[text()='Male']")).click();
//
//		// address
//		driver.findElement(By.xpath("(//button[@class='fa fa-plus btn btn-default'])[2]")).click();
//
//		driver.findElement(By.xpath("(//a[@class='chosen-single'])[9]")).click();
//		driver.findElement(By.xpath("(//a[@class='chosen-single'])[9]")).click();
//		driver.findElement(By.xpath("//li[text()='Permanent']")).click();
//
//		driver.findElement(By.xpath("//input[@name='street0']")).sendKeys("5 street");
//		driver.findElement(By.xpath("//input[@name='addressline1']")).sendKeys("vadapalani");
//		driver.findElement(By.xpath("(//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty'])[4]"))
//				.sendKeys("600024");
//
//		driver.findElement(By.xpath("(//a[@class='chosen-single'])[10]")).click();
//		driver.findElement(By.xpath("//li[text()='India']")).click();
//		driver.findElement(By.xpath("(//a[@class='chosen-single'])[11]")).click();
//		driver.findElement(By.xpath("//li[contains(text(),'Tamil Nadu')]")).click();
//		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("chennai");
//		driver.findElement(By.xpath("//button[@id='save']")).submit();

		
		  //loan detail
		  
//		  


		 driver.findElement(By.xpath("//tr[@class='pointer-main ng-scope']//td[contains(text(),'vasanth')]")).click(); 
		  driver.findElement(By.xpath("(//a[@class='btn btn-primary btn-offset ng-binding'])[2]")).click();
		  WebElement productElement =driver.findElement(By.xpath("(//select[@id='productId'])")); Select sp =new
		  Select(productElement); sp.selectByVisibleText("Personal loan");
		  
		  driver.findElement(By.xpath("(//a[@class='chosen-single'])[2]")).click();
		  driver.findElement(By.xpath("//li[text()='Business Loan – General']")).click(
		  );
		  
		  driver.findElement(By.xpath("//input[@id='expectedDisbursementDate']")).sendKeys("01 April 2024");
		  driver.findElement(By.xpath("(//span[text()='01'])[3]")).click();
		  
		  driver.findElement(By.xpath("//span[text()='Select Repayment Mode']")).click(); 
		  driver.findElement(By.xpath("//li[text()='Cash/Cheque']")).click();
		  
		  driver.findElement(By.xpath("(//button[@class='btn btn-default pull-right'] )[1]")).click();
		  
		  // terms
		  WebElement principalElement = driver.findElement(By.xpath("//input[@id='principal']"));
		  principalElement.clear();
		  principalElement.sendKeys("1500000");
		  
		  WebElement loanTermElement =
		  driver.findElement(By.xpath("//input[@id='loanTermFrequency']")); //select[@id='loanTermFrequencyType']
		  loanTermElement.clear();
		  loanTermElement.sendKeys("36");
		  
		  WebElement repaymentMonthElement =
		  driver.findElement(By.xpath("//select[@id='loanTermFrequencyType']")); Select
		  repaymentMonth = new Select(repaymentMonthElement);
		  repaymentMonth.selectByVisibleText("Months");
		  
		  
		  WebElement repaymentElement =
		  driver.findElement(By.xpath("//input[@id='numberOfRepayments']"));
		  repaymentElement.clear(); repaymentElement.sendKeys("36");
		  
		  
		  
		  WebElement repaidEveryElement = driver.findElement(By.xpath("//input[@id='repaymentEvery']"));
		  repaidEveryElement.clear(); repaidEveryElement.sendKeys("1");
		  
		  WebElement repaymentMonthElement1 = driver.findElement(By.xpath("//select[@id='loanTermFrequencyType']")); 
		  Select repaymentMonth1 = new Select(repaymentMonthElement1);
		  repaymentMonth1.selectByVisibleText("Months");
		  
		  WebElement repaidEveryElement1 = driver.findElement(By.xpath("//select[@id='repaymentFrequencyType']"));
		   Select repaidElement = new Select(repaymentMonthElement1);
		  repaidElement.selectByVisibleText("Months");
		  
		  
		  WebElement repaidEveryElement2 = driver.findElement(By.xpath("//select[@id='repaymentFrequencyDayOfWeekType']"
		  )); Select repaidElement2 = new Select(repaidEveryElement2);
		  repaidElement2.selectByVisibleText("MONDAY");
		  
		  WebElement interestElement = driver.findElement(By.xpath("//input[@id='interestRatePerPeriod']"));//input[id='interestRatePerPeriod']
		  interestElement.clear();
		  interestElement.sendKeys("10");
		  
		  WebElement amortizationElement =driver.findElement(By.xpath("//select[@id='amortizationType']")); Select
		  amortizationElement1= new Select(amortizationElement);
		  amortizationElement1.selectByVisibleText("Equal principal payments");
		  
		  WebElement interestCalculationElement =driver.findElement(By.xpath("//select[@id='interestCalculationPeriodType']")); 
		  Select interestCalculationElement1= new Select(interestCalculationElement);
		  interestCalculationElement1.selectByVisibleText("Same as repayment period");
		  
		driver.findElement(By.xpath("(//button[@class='btn btn-default pull-right'])[2]")).click();
		  
		  driver.findElement(By.xpath("(//button[@class='btn btn-default pull-right'])[3]")).click();
		  
		  driver.findElement(By.xpath("(//button[@class='btn btn-default pull-right'])[4]")).click();
		  
		  // scroll 
		  JavascriptExecutor js = (JavascriptExecutor) driver; WebElement
		  saveElement = driver.findElement(By.xpath("//button[@id='save']"));
		  js.executeScript("arguments[0].scrollIntoView(false)", saveElement);
		  saveElement.click();
		 

	}

}
