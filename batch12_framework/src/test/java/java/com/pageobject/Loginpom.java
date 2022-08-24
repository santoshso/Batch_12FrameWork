package java.com.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom {
	
	public class loginpom {
		
		//Webelement ------->loginpage webpage
		
		@FindBy(how=How.XPATH,using="//input[@id='email']")
		private WebElement txt_emailid;
		
		
		@FindBy(how=How.XPATH,using="//input[@id='pass']")
		private WebElement txt_password;
		
		@FindBy(how=How.XPATH,using="//button[@name='login']")
		private WebElement txt_btn;

		public WebElement getTxt_emailid() {
			return txt_emailid;
		}

		public WebElement getTxt_password() {
			return txt_password;
		}


		public WebElement getTxt_btn() {
			return txt_btn;
		}
	}

}
