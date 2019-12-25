package com.log.pages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.log.utilities.Baseclass1;

public class Acceptmeeting extends Baseclass1 {

	static By date=By.xpath("//*[@text='30']");
	
	static By Upcoming=By.xpath("//*[@text='UPCOMING']");
	
	static By meetingNmae=By.id("com.elorce.logmeeting:id/tv_meetingName");
	
	@Test
	
    public static void acceptmeeting() throws Exception {
		
		driver.findElement(date).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@text='UPCOMING']")).click();
		Thread.sleep(3000);
	    driver.findElement(meetingNmae).click();
		
		
}
}