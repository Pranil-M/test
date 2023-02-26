package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // object or reference
		driver.get("https://www.netflix.com/in/"); //URL
		
		Thread.sleep(3000); // delay addition = 3 secs
		
		driver.findElement(By.xpath("//a[@class='authLinks redButton']")).click(); 
		
		driver.findElement(By.name("userLoginId")).sendKeys("dnikhilesh1993@gmail.com");  
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Sehwag219!");
		
		Thread.sleep(3000);
		
		//login button
		driver.findElement(By.xpath("//button[@class='btn login-button btn-submit btn-small']")).click(); // automatic x-path
		
		
		Thread.sleep(3000);
		/*
		// selecting Pranil profile on netflix
		
		WebElement profile_name = driver.findElement(By.xpath("(//div[@class='profile-icon'])[5]")); // manual x-path
		profile_name.click();
		
		//maximizing the window
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Movies")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("searchTab")).click();
		
		//explicit wait addition ===>>
		
		WebElement search_tab = driver.findElement(By.xpath("//div[@class='searchInput']"));
		
		//search_tab.sendKeys("Conjuring");
		
		/*WebElement input = driver.findElement(By.xpath("//div/div[@class='searchInput']"));
		input.sendKeys("Conjuring");
		*/
	}

	
	
}
