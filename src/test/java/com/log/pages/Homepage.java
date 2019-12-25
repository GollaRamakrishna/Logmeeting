package com.log.pages;

import org.openqa.selenium.By;

import com.log.utilities.BaseClass;

public class Homepage extends BaseClass {
	
	static By btn_cancel= By.xpath("//*[@text='CANCEL']");
	
	
	
	public static void homepage() {
		driver.findElement(btn_cancel).click();
		
		
	}

}
