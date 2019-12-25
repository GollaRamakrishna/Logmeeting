package com.log.utilities;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass extends utilities {
	
	    
	//public static AndroidDriver<MobileElement> driver;
		
		
@Test
		public static void openapp() throws Exception {
		   //File f= new File("C:\\Users\\Pc-Ramakrishna\\AppData\\Local\\Android\\sdk\\platform-tools\\adb9379b-5625-4171-a39e-73badf38e53f-app-debug.apk");

			DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability("platformName", "Android");
			
			capabilities.setCapability("deviceName","realme");

			capabilities.setCapability("platformVersion","9");
			  
            capabilities.setCapability("deviceName","emulator-5554");
            
           // capabilities.setCapability("udid","IRSKIJSO95V4GIFM");
            
		    capabilities.setCapability("appPackage", "com.elorce.logmeeting");
			
		    capabilities.setCapability("appActivity", "com.elorce.logmeeting.views.login.SplashScreen");
		    
		  URL url = new URL("http://0.0.0.0:4723/wd/hub");
			  
			
		  driver = new AndroidDriver<MobileElement>(url, capabilities);
		
		  Thread.sleep(3000);
		  
		  allow();
		  allow();
		 }
	
	
	
	/*
	 * @AfterTest
	 * 
	 * public static void treadown() {
	 * 
	 * driver.quit();
	 * 
	 * }
	 */
}

