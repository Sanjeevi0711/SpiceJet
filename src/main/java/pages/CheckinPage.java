package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class CheckinPage extends ProjectSpecification {
	
	//Find by annotation to locate the elements
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[1]")
	WebElement ticket_number;
	
	@FindBy(xpath="(//input[@class='css-1cwyjr8 r-homxoj r-ubezar r-1eimq0t r-1e081e0 r-xfkzu9 r-lnhwgy'])[2]")
	WebElement email;
	
	@FindBy(xpath="//div[text()='Search Booking']")
	WebElement search_booking;
	
	
	
	
	//Constructor Initialization 
public CheckinPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//Method to check whether ticket number field is displayed 
public CheckinPage checkTicketNumberFeild() {
	isElementDisplayed(ticket_number);
	return this;
			
}

//Method to check whether email id field is displayed 

public CheckinPage checkEmailFeild() {
	isElementDisplayed(email);
	return this;
}

////Method to check whether search booking button is displayed 
public CheckinPage checkSearchFeild() {
	isElementDisplayed(search_booking);
	return this;
}



}