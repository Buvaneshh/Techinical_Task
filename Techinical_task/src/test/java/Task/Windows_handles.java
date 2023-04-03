package Task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_handles {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\BUVAN\\eclipse-workspace\\Techinical_task\\src\\test\\resources\\Driver\\chromedriver.exe");

				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.Amazon.in");
				driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("iphone 14 pro");
				driver.findElement(By.id("nav-search-submit-text")).click();
				driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div"
						                       + "/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
				Set<String> windowHandles = driver.getWindowHandles();
				ArrayList<String> list = new ArrayList<String>(windowHandles);
				
				System.out.println(driver.getCurrentUrl());
				driver.switchTo().window(list.get(1));
				System.out.println(driver.getCurrentUrl());
				driver.switchTo().window(list.get(0));
				
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
				
				driver.close();
				}
	}


