package ObjectRepositeries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ticketdetailspage {  
	
	
	
	public WebDriver driver;
	
	public Ticketdetailspage(WebDriver driver) {
		this.driver =driver;
		
	}
	
	
	
	By title = By.xpath("//select[@data-fieldname='Title']");
	
	public WebElement title() {
		return driver.findElement(title);
	}
	
	By firstname = By.xpath("//input[@data-field='firstName']");
	public WebElement firstnames() {
		return driver.findElement(firstname);
	}
	
	By middlename = By.xpath("//input[@data-field='middleName']");
	public WebElement middlenames() {
		return driver.findElement(middlename);
	}
	By lastname = By.xpath("//input[@data-field='lastName']");
	public WebElement lastname() {
		return driver.findElement(lastname);
	}
	
	By mobilenumber = By.xpath("//input[@data-field='mobile' and @maxlength='10']");
	public WebElement mobilenumbers() {
		return driver.findElement(mobilenumber);
	}
	
	By email = By.xpath("//input[@data-fieldname='Email']");
	public WebElement emails() {
		return driver.findElement(email);
	}
	
	By procedbutton = By.xpath("//*[@id='travellerForm']/div[2]/button");
	public WebElement travelprocedbuttons() {
		return driver.findElement(procedbutton);
	}
	
	
}
