package org.project2.SpiceJetProject;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetWepsiteOpen {
	
	public static void main(String[] args) {
        // Set the path to the ChromeDriver executable (you may need to change this path)
    	WebDriverManager.chromedriver().setup();


        // Initialize the WebDriver
    	ChromeDriver driver = new ChromeDriver();

        // Navigate to the SpiceJet website
        driver.get("https://www.spicejet.com/");

        // Optional: Maximize the browser window
        driver.manage().window().maximize();

        // Optional: Add some delay to see the page
        try {
            Thread.sleep(5000); // Sleep for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Close the browser
        driver.quit();
    }

}
