package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	static ExtentTest test;
	
	public static void custom_sendkeys(WebElement element,String value,String fieldname) {
		try {
		element.sendKeys(value);
		test.log(Status.PASS, fieldname +"==value succesfully send =="+value);
		} catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		
		}
		
	}
	
	public static void custom_click(WebElement element,String feildname) {
		
		try {
			element.click();
			test.log(Status.PASS, feildname+"==clicked succefully");
		} catch (Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}

}
	
	public static void custom_HandleDropDown(WebElement element , String text) {
	try {	
	Select Select = new Select(element);
	
    Select.deselectByVisibleText(text);
	} catch (Exception e) {
	System.out.println(e.getMessage());
	}
				
	}
		public static void custom_HandleMouseHover(WebDriver driver,WebElement element) {
			
			try {
			Actions act = new Actions (driver);
			act.moveToElement(element).click().build().perform();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
	
}
		
	

