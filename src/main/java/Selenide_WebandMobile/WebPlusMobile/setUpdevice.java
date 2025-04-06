package Selenide_WebandMobile.WebPlusMobile;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*; 
import static com.codeborne.selenide.Condition.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.appium.AppiumClickOptions;
import com.codeborne.selenide.appium.AppiumDriverRunner;
import com.codeborne.selenide.appium.AppiumSelectors;
import com.codeborne.selenide.appium.SelenideAppium;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.*;

public class setUpdevice  
{
	
	
	public  void initialize(String phone) throws Exception
	{
			
		Configuration.browser = demoAppium.class.getName();  // return appium settings defined in demoAppium Class
		Configuration.fastSetValue=true;
	    SelenideAppium.launchApp();  // launch mobile app specified in demoAppium Class
		Configuration.timeout=60000;
		$(AppiumSelectors.byContentDescription("open menu")).should(visible).click(AppiumClickOptions.tap());
		$(AppiumSelectors.byContentDescription("menu item log in")).should(visible).click(AppiumClickOptions.tap());
	    $(AppiumSelectors.byContentDescription("Username input field")).should(visible)
																					.setValue(phone);
	}
	
}
