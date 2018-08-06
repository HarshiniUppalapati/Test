package com.cg.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	 WebDriver driver = null; 
	   @Given("^that I am on login page$") 
		
	   public void goToFacebook() { 
	      driver = new ChromeDriver(); 
	      driver.navigate().to("file:///D:/Users/ADM-IG-HWDLAB1F/Downloads/demos/m4/after/src/main/webapp/loginPage.html"); 
	   }
		
	   @When("^I enter username as (.*)$") 
	   public void enterUsername(String arg1) {   
	      driver.findElement(By.id("username")).sendKeys(arg1); 
	   }
		
	   @And ("^I enter password as (.*)$") 
	   public void enterPassword(String arg1) {
	      driver.findElement(By.id("password")).sendKeys(arg1);
	      
	   } 
		
	   @Then("^I should be logged into my github account$") 
	   public void checkPass() {  
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input")).click();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
	   }
	   
	   @Then("^I should relogin for password$") 
	   public void checkFail() {  
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input")).click();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
	       
	   }

	   @Then("^I should relogin for username$") 
	   public void checkFailcondition() {  
		   driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td/input")).click();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
	       
	   }
}
