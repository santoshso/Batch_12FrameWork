package com.Test;

import java.com.pageobject.Loginpom.loginpom;
import java.com.utility.BaseClass;
import java.com.utility.Library;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_tc001 extends BaseClass {
	
	
		
		
		@Test
		public void verify_Testlogin_validCredential() {
			//WebElement
			
			loginpom Login=PageFactory.initElements(driver, loginpom.class);
			
			Library.custom_sendkeys(Login.getTxt_emailid(), "test@gamil.com");
			Library.custom_sendkeys(Login.getTxt_password(), "123456788");
			Library.custom_click(Login.getTxt_btn());
			
	
		}
	
	
	

}
