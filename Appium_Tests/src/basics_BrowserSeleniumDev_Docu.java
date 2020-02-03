import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics_BrowserSeleniumDev_Docu extends base_Chrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://selenium.dev/");
		System.out.println(driver.getTitle());
		//	Click the Menu button.
		driver.findElementByXPath("//*[@id=\"dropdownButton\"]").click();
		//	Click the Documentation option.
		driver.findElementByLinkText("Documentation").click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
		
	}

}
