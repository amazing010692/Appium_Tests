import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class miscellaneous extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//	Shows name of app being invoked.
		System.out.println(driver.currentActivity());
		//	Shows the type of Views: Native, Hybrid, Webview.
		System.out.println(driver.getContext());
		//	Shows if app is in Portrait or Landscape.
		System.out.println(driver.getOrientation());
		//	driver.hideKeyboard();
		
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

	}

}
