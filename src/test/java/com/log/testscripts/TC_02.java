package com.log.testscripts;

import org.testng.annotations.Test;

import com.log.pages.Acceptmeeting;
import com.log.pages.Login;
import com.log.pages.Schedulemeeting;
import com.log.utilities.BaseClass;
import com.log.utilities.Baseclass1;

public class TC_02 {
	@Test
	public static void tc01() throws Exception {
	BaseClass.openapp();
	Thread.sleep(1000);
	Login.login("raamu522@gmail.com", "ramu4279");
	Thread.sleep(1000);
	Schedulemeeting.scedulemeeting();
	Thread.sleep(2000);
	Acceptmeeting.acceptmeeting();
	Thread.sleep(1000);
	
}
}