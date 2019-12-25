package com.log.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.log.utilities.BaseClass;

public class Logout extends BaseClass {
	
	
	static By Menu=By.className("android.widget.ImageButton");
	
	static By logout=By.xpath("//*[@text='Logout']");
	
	static By YES=By.xpath("//*[@text='YES']");
	
	@Test
	
	public static void logout() throws Exception {
		driver.findElement(Menu).click();
		
		System.out.println("clicked on menu");
		
		Thread.sleep(2000);
		
		driver.findElement(logout).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(YES).click();
		
		
		
	

	
	}

}
