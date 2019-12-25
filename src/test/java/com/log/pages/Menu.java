package com.log.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.log.utilities.BaseClass;

public class Menu extends BaseClass {
	
	static By Menu=By.className("android.widget.ImageButton");
	
	static By Home=By.xpath("//*[@text='Home']");
	
	static By Schedule=By.xpath("//*[@text='Schedule']");
	
	static By Upcoming=By.xpath("//*[@text='Upcoming']");
	
	static By Completed=By.xpath("//*[@text='Completed']");
	
	static By Canceled=By.xpath("//*[@text='Cancelled']");
	
	static By Changepwd=By.xpath("//*[@text='Change Password']");
	
	static By Logout=By.xpath("//*[@text='Logout']");
	
	static By YES=By.xpath("//*[@text='YES']");
	
	
	
	@Test
	
	public static void menu() throws Exception {
		driver.findElement(Menu).click();
		Thread.sleep(1000);
		System.out.println("1");
		driver.findElement(Home).click();
		Thread.sleep(1000);
		System.out.println("1");
		driver.findElement(Menu).click();
		driver.findElement(Schedule).click();
		System.out.println("1");
		Thread.sleep(1000);
		driver.findElement(Menu).click();
		driver.findElement(Upcoming).click();
		System.out.println("1");
		Thread.sleep(1000);
		driver.findElement(Menu).click();
		driver.findElement(Completed).click();
		System.out.println("1");
		Thread.sleep(1000);
		driver.findElement(Menu).click();
		driver.findElement(Canceled).click();
		System.out.println("1");
		Thread.sleep(1000);
		driver.findElement(Menu).click();
		driver.findElement(Changepwd).click();
		System.out.println("1");
		Thread.sleep(1000);
		driver.findElement(Menu).click();
		driver.findElement(Logout).click();
		
		System.out.println("1");
		Thread.sleep(1000);
		driver.findElement(YES).click();
		
	}
	
	
	

}
