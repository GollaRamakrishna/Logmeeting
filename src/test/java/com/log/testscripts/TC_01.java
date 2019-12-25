package com.log.testscripts;

import org.testng.annotations.Test;

import com.log.pages.Acceptmeeting;
import com.log.pages.Changepwd;
import com.log.pages.Homepage;
import com.log.pages.Login;
import com.log.pages.Logout;
import com.log.pages.Menu;
import com.log.pages.Schedulemeeting;
import com.log.utilities.BaseClass;

public class TC_01 {
	@Test
	public static void tc01() throws Exception {
	BaseClass.openapp();
	Thread.sleep(3000);
	Login.login("raamu522@gmail.com", "ramu4279");
	Thread.sleep(10000);
	Schedulemeeting.scedulemeeting();
	Acceptmeeting.acceptmeeting();
	Logout.logout();
	}							
	

}
