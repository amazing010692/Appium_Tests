import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics_emulator extends hybrid_base {

	public static void main(String[] args) throws MalformedURLException {
		
		// This code will run in a real device with remote USB debugging.
		AndroidDriver<AndroidElement> driver = Capabilities("emulator");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//xpath id, className, androidUIautomator
		/*		xpath Syntax
		 * 		//tagName[@attribute='value']
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("hello Jan");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		
	}

}
