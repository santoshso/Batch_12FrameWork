package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobject.Loginpom;
import com.utility.Baseclass;
import com.utility.Library;

public class Test_tc_001 extends Baseclass {
	
	@Test
	public void verify_validCedential() throws Exception {
		//Webelement
		
		Loginpom Login =PageFactory.initElements(driver, Loginpom.class);
		Library.custom_sendkeys(Login.getTxt_emaid(), excel.getStringData("Sheet1", 0, 0),"EmailId");
		
		Thread.sleep(4000);;
		Library.custom_sendkeys(Login.getTxt_password(),excel.getStringData("Sheet1", 0, 1),"password");
		Library.custom_click(Login.getTxt_login(),"Login");
		//Library.custom_click(Login.getTxt_login(),"Login");
		
		
		
		//Library.custom_HandleDropDown(null, null);
		//Library.custom_HandleMouseHover(driver, null);
		//Login.getTxt_emaid().sendKeys("test@gmail.com");
		//Login.getTxt_password().sendKeys("12345678");
		//Login.getTxt_login().click();
	
	
	
	
	}
	
	
	}


