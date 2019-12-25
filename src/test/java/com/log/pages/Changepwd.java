package com.log.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.log.utilities.BaseClass;

public class Changepwd extends BaseClass{
	
	static By txt_currentpwd= By.xpath("//*[@text='current password']");
	
	static By txt_newpwd=By.xpath("//*[@text='New password']");
	
	static By txt_conformpwd= By.xpath("//*[@text='Confirm New password']");
	
	static By Ok= By.xpath("//*[@text='OK']");
	
	static By btn_submit= By.id("com.elorce.logmeeting:id/changepwd_Rel_Next");
	
	static By btn_cancel=By.id("com.elorce.logmeeting:id/changepwd_BTN_Skip");
	
	@Test
	public static void changepwd(String currentpwd, String newpwd, String conformpwd) throws Exception {
		
		Thread.sleep(1000);
		driver.findElement(txt_currentpwd).sendKeys(currentpwd);
		
		driver.findElement(txt_newpwd).sendKeys(newpwd);
		
		driver.findElement(txt_conformpwd).sendKeys(conformpwd);
		
		driver.findElement(btn_submit).click();
		
		Thread.sleep(3000);
		
		driver.findElement(Ok).click();
		
		//driver.findElement(btn_cancel).click();
	}

}
