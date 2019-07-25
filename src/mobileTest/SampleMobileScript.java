package mobileTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SampleMobileScript {
	static AndroidDriver<MobileElement> driver;
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cop = new DesiredCapabilities();
		cop.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Nexus API 28");
		cop.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cop.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		//cop.setCapability(MobileCapabilityType.APP, "C:\\Users\\gayeon\\appium_project\\selendroid-test-app.apk");
		cop.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.settings");
		cop.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.settings.Settings");
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cop);
	
		//driver.findElement(By.id("test")).click();
		//driver.findElement(By.id("io.selendroid.testapp:id/my_text_field")).sendKeys("Appium training");
		driver.findElement(By.id("com.android.settings:id/search_action_bar_title")).sendKeys("Google");
		driver.quit();
		
	}
	
	
}
