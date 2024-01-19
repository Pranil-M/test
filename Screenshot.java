package Selenium2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;
import org.openqa.selenium.remote.http.ConnectionFailedException;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
	
	//workaround for newer version of Chrome
	
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(ops);

	
	driver.get("https://github.com/Pranil-M");
	
	driver.manage().window().maximize();
	
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	Files.copy(f, new File("C:\\Users\\Lenovo\\OneDrive\\Pictures\\Saved Pictures\\github1.jpeg"));
	
	
	}

}
