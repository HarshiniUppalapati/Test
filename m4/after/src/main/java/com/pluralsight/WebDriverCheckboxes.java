package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCheckboxes {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Users/ADM-IG-HWDLAB1F/Downloads/demos/m4/after/src/main/webapp/CheckboxTest.html");
		
		WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
		
		checkbox.click();
		checkbox.click();

	}

}
