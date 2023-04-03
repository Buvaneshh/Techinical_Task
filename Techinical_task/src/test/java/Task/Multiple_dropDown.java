package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Multiple_dropDown {
	WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	
	@Test
	public void loginPage() {
		
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061935%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwrJ-hBhB7EiwAuyBVXbZ2MaJg4IDdMtuvWBZ-yIQbrS2jFn2pFwnL9_E_aMSyBB5g8t_PCRoCPGoQAvD_BwE");
		
		Select drpDate=new Select(driver.findElement(By.xpath("//Select[@name='birthday_day']")));
		drpDate.selectByVisibleText("5");
		
		Select drpMonth=new Select(driver.findElement(By.xpath("//*[@id='month']")));
		drpMonth.selectByIndex(3);
		
		Select drpYear=new Select(driver.findElement(By.xpath("//*[@title='Year']")));
		drpYear.selectByValue("2023");
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
	}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
	
	}
		
	


}
