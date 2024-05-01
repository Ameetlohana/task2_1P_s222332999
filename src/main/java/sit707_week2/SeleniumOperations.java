package sit707_week2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;

public class SeleniumOperations {

    public static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void officeworks_registration_page(String url) {
    	  // Step 1: Specify the correct path to GeckoDriver (Firefox driver).
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lavish Computers\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
     
        // Step 2: Use GeckoDriver to open up a Firefox browser.
        System.out.println("Fire up Firefox browser.");
        WebDriver driver = new FirefoxDriver();
     
        System.out.println("Driver info: " + driver);

        sleep(2);

        // Load a webpage in Firefox browser.
        driver.get(url);

        // Find first input field which is firstname
        WebElement element = driver.findElement(By.id("firstname"));
        System.out.println("Found element: " + element);
        // Send first name
        element.sendKeys("Ameet");

        // Repeat for other input fields...

        // Find the button 'Create account' and click to submit
        WebElement createAccountButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/form/div[12]/button"));
        createAccountButton.click();

        // Take screenshot using Selenium API
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Define destination for screenshot
        File destFile = new File("officeworks_registration_page_screenshot.png");
        try {
            // Copy screenshot to destination
            FileHandler.copy(screenshotFile, destFile);
            System.out.println("Screenshot saved successfully: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sleep a while
        sleep(2);

        // Close Firefox driver
        driver.quit();
    }

    public static void amazon_registration_page(String url) {
    	 // Step 1: Specify the correct path to GeckoDriver (Firefox driver).
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lavish Computers\\Downloads\\geckodriver-v0.34.0-win64\\geckodriver.exe");
     
        // Step 2: Use GeckoDriver to open up a Firefox browser.
        System.out.println("Fire up Firefox browser.");
        WebDriver driver = new FirefoxDriver();
     
        System.out.println("Driver info: " + driver);


        sleep(2);

        // Load a webpage in Firefox browser.
        driver.get(url);

        // Find and interact with elements for Amazon registration page
        WebElement element = driver.findElement(By.id("ap_customer_name"));
        element.sendKeys("Ameet");

        // Repeat for other input fields...

        // Find the button 'Create account' and click to submit
        WebElement createAccountButton = driver.findElement(By.id("continue"));
        createAccountButton.click();

        // Take screenshot using Selenium API
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        // Define destination for screenshot
        File destFile = new File("amazon_registration_page_screenshot.png");
        try {
            // Copy screenshot to destination
            FileHandler.copy(screenshotFile, destFile);
            System.out.println("Screenshot saved successfully: " + destFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sleep a while
        sleep(2);

        // Close Firefox driver
        driver.quit();
    }
}
