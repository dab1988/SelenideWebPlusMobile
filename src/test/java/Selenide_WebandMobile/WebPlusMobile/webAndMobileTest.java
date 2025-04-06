package Selenide_WebandMobile.WebPlusMobile;

import org.testng.annotations.Test;

public class webAndMobileTest 
{

	
	@Test
	void mobileAndWebDemoTest() throws Exception
	{
		browserClass b= new browserClass();
		String phone=b.launchBrowser();
		setUpdevice device= new setUpdevice();
		device.initialize("908765321");
		
	}
}
