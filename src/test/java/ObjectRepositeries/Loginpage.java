package ObjectRepositeries;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Loginpage {
	
	
	public WebDriver driver ;

	public Loginpage(WebDriver driver){
		this.driver =driver;
	}

	
	By fromplace = By.id("gosuggest_inputSrc");
    By toplace = By.id("gosuggest_inputDest");
	By calenarpath = By.id("departureCalendar");
	By calmonthyeartext = By.xpath("//div[@class='DayPicker DayPicker--en']//div[@class='DayPicker-Caption']");
	By calsearch = By.xpath("//*[contains(@class,'DayPicker-NavButton DayPicker-NavButton--next')]");
	By datessearching = By.xpath("//*[@class='calDate']");
	
	//return calendar
	By returncal = By.id("returnCalendar");

	By button = By.id("gi_search_btn");
	public WebElement sourceplace() {
		return driver.findElement(fromplace);
		
	}
	
	public WebElement destinationplace() {
		return  driver.findElement(toplace);
		
	}
	public WebElement calendarpath() {
		return driver.findElement(calenarpath);
		
	}
	public WebElement monthsyearstext() {
		return driver.findElement(calmonthyeartext);
		
	}
	public WebElement serachbutton() {
		return driver.findElement(calsearch);
	}
	public List<WebElement> datessearchings() {
		return  driver.findElements(datessearching);
		
	}
	
	public WebElement returncalpath() {
		return driver.findElement(returncal);
	}
	
	public WebElement submit() {
		return driver.findElement(button);
	}
	
}

	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	

