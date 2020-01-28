import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics_BrowserFB_Login extends base_Chrome {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://m.facebook.com/");
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//*[@id=\'m_login_email\']").sendKeys("JanielleJoyGregorio");
		driver.findElementByXPath("//*[@id=\'m_login_password\']").sendKeys("987654321");
		driver.findElementByXPath("//button[@value='Log In']").click();
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
