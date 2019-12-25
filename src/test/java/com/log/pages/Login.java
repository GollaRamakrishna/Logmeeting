package com.log.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.log.utilities.BaseClass;

public class Login extends BaseClass {
	
	
	static By txt_loginname= By.id("com.elorce.logmeeting:id/login_et_username");
	
	static By txt_password= By.id("com.elorce.logmeeting:id/login_et_password");
	
	static By btn_login= By.id("com.elorce.logmeeting:id/login_BTN_Login");
	
	static By verifytext=By.xpath("//android.widget.Toast[@text='Successfull']");
	
	
	@Test
	public static void login(String un,String pwd) {
		
		driver.findElement(txt_loginname).sendKeys(un);
		
		driver.findElement(txt_password).sendKeys(pwd);
		
		driver.findElement(btn_login).click();
		
		System.out.println("login completed");
		
		Reporter.log("login completed");
		
		//String successfull=driver.findElement(verifytext).getText();
		
		//Assert.assertEquals(successfull, "Successfull");
		
		//System.out.println("login successfull message:"+ successfull);
		
	}
	

}
