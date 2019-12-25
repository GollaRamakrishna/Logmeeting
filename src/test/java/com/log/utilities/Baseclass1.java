package com.log.utilities;

import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Baseclass1 {
	public static AndroidDriver<MobileElement> driver;
	
	
	@Test
			public static void openapp() throws Exception {
		Scanner sc=new Scanner(System.in);
		String moy= sc.nextLine();
		String day=sc.nextLine();
				DesiredCapabilities capabilities = new DesiredCapabilities();

				capabilities.setCapability("platformName", "Android");
				
				capabilities.setCapability("deviceName","realme");

				capabilities.setCapability("platformVersion","9");
				  
	            capabilities.setCapability("deviceName","emulator-5554");
	            
			    capabilities.setCapability("appPackage", "com.elorce.logmeeting");
				
			    capabilities.setCapability("appActivity", "com.elorce.logmeeting.views.login.SplashScreen");
			    
			  URL url = new URL("http://0.0.0.0:4723/wd/hub");
				  
				
			  driver = new AndroidDriver<MobileElement>(url, capabilities);
			
			  Thread.sleep(3000);
			  try {
			  driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
			  driver.findElement(By.xpath("//*[@text='ALLOW']")).click(); 
			  } 
			  finally {
			  System.out.println("application launched"); 
			  Reporter.log("application launched");
			  }
			  Thread.sleep(8000);
			  driver.findElement(By.id("com.elorce.logmeeting:id/login_et_username")).sendKeys("raamu522@gmail.com");
				
				driver.findElement(By.id("com.elorce.logmeeting:id/login_et_password")).sendKeys("ramu4279");
				
				driver.findElement(By.id("com.elorce.logmeeting:id/login_BTN_Login")).click();
			  
			  
			  Thread.sleep(8000);
		        String str=driver.findElement(By.id("com.elorce.logmeeting:id/display_current_date")).getText();
		        System.out.println(str);
		        int n1=str.length();
		        String str2=str.substring(n1-4);
		        Integer result1 = Integer.valueOf(str2);		
		    	System.out.println(result1);
		        int n2=moy.length();
		        String str3=moy.substring(n2-4);
		        Integer result2 = Integer.valueOf(str3);		
		    	System.out.println(result2);
		        
		        
		        do
		        {
		        	if(str.equalsIgnoreCase(moy))
		        	{
		        		driver.findElement(By.xpath("//*[@text='29']")).click();
		        		break;
		        	}
		        	else
		        	{
		        		if(result1 < result2)
		        		{
		        		
		        			driver.findElement(By.id("com.elorce.logmeeting:id/next_month")).click();
		        			str=driver.findElement(By.id("com.elorce.logmeeting:id/display_current_date")).getText();
		        		}
		        		else
		        		{
		        			driver.findElement(By.id("com.elorce.logmeeting:id/previous_month")).click();
		        			str=driver.findElement(By.id("com.elorce.logmeeting:id/display_current_date")).getText();
		        		}
		        	}
		        }while(true);
		        
		}

}
