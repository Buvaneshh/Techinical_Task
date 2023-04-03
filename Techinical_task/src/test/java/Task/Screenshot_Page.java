package Task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot_Page {
	WebDriver driver;
	
	@Test
	public void takeScreenShot() throws IOException {
			driver.get("https://www.google.com");
		    driver.manage().window().maximize();
		    TakesScreenshot ts=(TakesScreenshot)driver;
			  File src= ts.getScreenshotAs(OutputType.FILE);
			  File des=new File("/Techinical_task/src/test/resources/Screenshot//HomePage.png");
			  FileUtils.copyFile(src, des);
	}
	@BeforeSuite
	public void browser()
	{

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
		  
	 
  @AfterSuite
  public void close() {
  driver.close();
  }
		  
}

