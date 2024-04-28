package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class BaseClass {
	public static WebDriver driver;

	public static void browserLaunch(String browser, String url) {
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("This Browser NOT Available");
		}
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static void input_data(WebElement element, String data) {

		element.sendKeys(data);

	}


	public static void click_Value(WebElement element) {

		element.click();

	}
	public static void submit_Value(WebElement element) {

		element.submit();

	}
	public static void clear_Value(WebElement element) {

		element.clear();

	}

	public static void dropDownSelectAValue(String value, WebElement element) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element,String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void sleepTime(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void impWait(int sec) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}

	public static void getWindowIds() {
		Set<String> allIds = driver.getWindowHandles();

		List<String> windowIds = new LinkedList<>();
		windowIds.addAll(allIds);
		driver.switchTo().window(windowIds.get(1));
	}
}
