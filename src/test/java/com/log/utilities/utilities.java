package com.log.utilities;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class utilities {
	public static AndroidDriver<MobileElement> driver;

	 public static void allow() {
	       driver.findElement(By.xpath("//*[@text='ALLOW']")).click();
}
	 public static void static_wait(long seconds) {
		 try {
			Thread.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}