import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base_Chrome {

	public static AndroidDriver<AndroidElement> Capabilities () throws MalformedURLException {
		
		// File f = new File("src");
		// File fs = new File(f, "ApiDemos-debug.apk");
				
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//	Just comment out the 2 lines below if you want to run in an emulator or in a real device.
		// cap.setCapability(MobileCapabilityType.DEVICE_NAME, "JanielleEmulator");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		
		cap.setCapability("chromedriverExecutable", "C:/Users/Janielle Gregorio/AppData/Roaming/npm/node_modules/appium/"
				+ "node_modules/appium-chromedriver/chromedriver/win/chromedriver.exe");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		// cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}

}


