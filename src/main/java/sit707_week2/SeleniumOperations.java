package sit707_week2;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
 
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lavish Computers\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element);
		// Send first name
		element.sendKeys("Ameet");
		
		
		WebElement lastname = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + lastname);
		// Send first name
		lastname.sendKeys("Lohana");
		
		
		WebElement phonenumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + phonenumber);
		// Send first name
		phonenumber.sendKeys("0458758918");
		
		
		
		WebElement emailaddress = driver.findElement(By.id("email"));
		System.out.println("Found element: " + emailaddress);
		// Send first name
		emailaddress.sendKeys("ameethemnani9@gmail.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + Password);
		// Send first name
		Password.sendKeys("Latter");
		
		WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + confirmPassword);
		// Send first name
		confirmPassword.sendKeys("second");
		
		WebElement Personal = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[10]/div/button[1]/span[1]/div"));
		System.out.println("Found element: " + Personal);
		// Send first name
		//Personal.click();
		
		WebElement Createaccount = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
		System.out.println("Found element: " + Createaccount);
		// Send first name
		Createaccount.click();
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
        // Define destination for screenshot
File destFile = new File("registration_page_screenshot.png");
try {
            // Copy screenshot to destination
            FileHandler.copy(screenshotFile, destFile);
            System.out.println("Screenshot saved successfully: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
		

public static void amazon_registration_page(String url) {
	// Step 1: Locate chrome driver folder in the local drive.
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lavish Computers\\\\Downloads\\\\chromedriver-win64 (1)\\\\chromedriver-win64\\\\chromedriver.exe");
	
	// Step 2: Use above chrome driver to open up a chromium browser.
	System.out.println("Fire up chrome browser.");
	WebDriver driver = new ChromeDriver();
	
	System.out.println("Driver info: " + driver);
		
	sleep(2);
	
		
	
	// Load a webpage in chromium browser.
	driver.get(url);
	
	
	WebElement element = driver.findElement(By.id("ap_customer_name"));
	System.out.println("Found element: " + element);
	// Send first name
	element.sendKeys("Ameet");
	
	WebElement email = driver.findElement(By.id("ap_email"));
	System.out.println("Found element: " + email);
	// Send first name
	email.sendKeys("ameethemnani9@gmail.com");
	
	WebElement Password = driver.findElement(By.id("ap_password"));
	System.out.println("Found element: " + Password);
	// Send first name
	Password.sendKeys("Latters");
	
	WebElement reenterPassword = driver.findElement(By.id("ap_password_check"));
	System.out.println("Found element: " + reenterPassword);
	// Send first name
	reenterPassword.sendKeys("second-");
	
	WebElement Personal = driver.findElement(By.id("continue"));
	System.out.println("Found element: " + Personal);
	// Send first name
	//Personal.click();
	
	

	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 
    // Define destination for screenshot
File destFile = new File("registration_page_screenshot2.png");
try {
        // Copy screenshot to destination
        FileHandler.copy(screenshotFile, destFile);
        System.out.println("Screenshot saved successfully: " + destFile.getAbsolutePath());
    } catch (IOException e) {
        e.printStackTrace();
    }

	

		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	
}


