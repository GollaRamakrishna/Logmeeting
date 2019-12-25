package com.log.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.log.utilities.BaseClass;

public class Schedulemeeting extends BaseClass {
	
	static By date=By.xpath("//*[@text='29']");
	
	static By plus_symbol=By.id("com.elorce.logmeeting:id/new_meeting");
	
	static By start_time=By.xpath("//*[@text='Start Time']");
	
	static By end_time=By.xpath("//*[@text='End Time']");
	
	static By ok=By.xpath("//*[@text='OK']");
	
	static By add_member=By.xpath("//*[@text='Add members']");
	
	static By subject=By.xpath("//*[@text='Subject']");
	
	static By Description=By.xpath("//*[@text='Description']");
	
	static By schedulemeeting=By.xpath("//*[@text='SCHEDULE MEETING']");
	
	static By timeselection=By.id("android:id/numberpicker_input");
	
	
	@Test
	
	public static void scedulemeeting() throws AWTException  {
		  System.out.println("date");
		  driver.findElement(date).click();
		  static_wait(2000);
		  driver.findElement(plus_symbol).click();
		  static_wait(3000);
		 
	      //select start time 
		 
		  driver.findElement(start_time).click();
		  static_wait(3000);
	    
	      Robot r=new Robot();
	      for(int i=1; i<3; i++) { 
	      r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  static_wait(1000);
		  }
	    
	      for(int i=1; i<3; i++) {  
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  static_wait(1000);
	      }
	    
		  for(int i=1; i<3; i++) {
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  static_wait(1000);
		  }
		  
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  static_wait(3000);
		 
		  driver.findElement(ok).click();
		  static_wait(3000);
		
		  //select end time
		 
		  driver.findElement(end_time).click();
		  static_wait(1000);
		
		  for(int i=1; i<3; i++) {
	      r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  static_wait(1000);
		  }
		  
		  for(int i=1; i<3; i++) { 
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  static_wait(1000);
		  }
		  
		  for(int i=1; i<3; i++) {
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  static_wait(3000);
		  }
		  
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  static_wait(3000);
		  
		  driver.findElement(ok).click();
		  static_wait(3000);
		  
		  //add members
		
		
		  for(int i=1; i<6; i++) {
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  static_wait(2000); }
		 
		
		  driver.findElement(add_member).sendKeys("ram");
		  static_wait(2000);
		  r.keyPress(KeyEvent.VK_DOWN); 
		  r.keyRelease(KeyEvent.VK_DOWN);
		  
		  static_wait(2000);
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  
		  driver.findElement(add_member).sendKeys("ram"); 
		  static_wait(2000);
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  
		  //Subject
		  
		  driver.findElement(subject).sendKeys("logmeeting");
		  static_wait(2000);
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  
		  for(int i=1; i<3; i++) {  
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  static_wait(2000);
		  }
		  
		  driver.findElement(Description).sendKeys("hai friends");
		  
		  static_wait(2000);
		  
		  driver.findElement(schedulemeeting).click();
		  
		  static_wait(10000);
		  
		  driver.findElement(By.xpath("//*[@text='OK']")).click();
		  
		  System.out.println("meeting scheduled successfully");
		  
		  Reporter.log("meeting scheduled successfully");
		  
		  static_wait(10000);
		 
		  
		
		 
		
	}

}
