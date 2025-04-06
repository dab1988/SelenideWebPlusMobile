/**
 * 
 */
package Selenide_WebandMobile.WebPlusMobile;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.appium.AppiumDriverRunner;
import com.codeborne.selenide.appium.SelenideAppium;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.Location;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;

public class demoAppium implements WebDriverProvider {
 
        public  WebDriver createDriver(Capabilities capabilities) 
        {
        	            
            UiAutomator2Options options = new UiAutomator2Options();
            //options.merge(capabilities);
            options.setPlatformName("Android");
            
            options.setFullReset(false);
           options.setCapability("deviceName", "<provide your device id here>"); //physical Device
			
          options.setApp(System.getProperty("user.dir")+"/mobileFiles/demoApp.apk");  // not required for browserstack

            try {
            	AndroidDriver driver=  new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
            	
            	return driver;
            } catch (MalformedURLException e) 
            {
                throw new RuntimeException(e);
            }
 		
       }
    }
