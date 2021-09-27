package Authentication;

import java.io.File;
import org.apache.commons.io.FileUtils;
import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class BasicAuthDemo {
	public static void main(String args[]) throws IOException, InterruptedException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WINDOWS);
		//WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.30:4444/wd/hub"),dc);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ganes\\OneDrive\\Documents\\Selenium\\Browser_Driver\\NewChromeDriver\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
/*		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("https://www.freepdfconvert.com/");
		driver.findElement(By.className("btn-label")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\ganes\\eclipse-workspace\\Fileupload\\Test.exe");  */
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> hand = handles.iterator();
		String mainWIndow=hand.next();
		String childWindow = hand.next();
		driver.switchTo().window(childWindow).get("https://google.com");
		Thread.sleep(10);
		driver.switchTo().window(mainWIndow);
		File f =driver.findElement(By.id("dropdown-class-example")).getScreenshotAs(OutputType.FILE);
		System.out.println(driver.findElement(By.id("dropdown-class-example")).getRect().getHeight());
		System.out.println(driver.findElement(By.id("dropdown-class-example")).getRect().getWidth());
		FileUtils.copyFile(f, new File("Logo.jpg"));
	//	WebElement radio2 = driver.findElement(By.xpath("//input[@value='radio2']"));
	//	driver.findElement(withTagName("input").above(radio2)).click();
	}
	
}
