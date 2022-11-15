package org.example.base;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static org.example.base.Constants.IS_ANDROID_ENV;

public class BaseTest {
    protected static AppiumDriver<MobileElement> appiumDriver;

    @BeforeScenario
    public void beforeScenario() throws MalformedURLException {

        System.out.println("Android Test Kosuyor!");

        if (IS_ANDROID_ENV) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Constants.DEVICE_NAME);
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, Constants.PACKAGE);
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, Constants.PACKAGE_ACTIVITY);

            desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3000);
            desiredCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);

            URL url = new URL(Constants.URL);

            appiumDriver = new AndroidDriver<>(url, desiredCapabilities);

        } else {
            System.out.println("Ios Test!");
        }
    }

    @AfterScenario
    public void afterScenario() {
        if (appiumDriver != null)
            appiumDriver.quit();
    }
}
