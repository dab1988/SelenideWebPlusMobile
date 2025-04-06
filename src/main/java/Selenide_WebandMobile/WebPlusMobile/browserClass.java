package Selenide_WebandMobile.WebPlusMobile;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;

public class browserClass 
{

	public browserClass ()
	{
		
	}
	
	public String launchBrowser()
	{
		Configuration.browser="edge";
		Configuration.timeout=60000;
		Configuration.clickViaJs=true;
		Configuration.screenshots=true;
		open("https://demo.opencart.com.gr/");
		return $(byCssSelector("li:nth-child(1) > span:nth-child(2)")).getText();
				
	}
	
}
