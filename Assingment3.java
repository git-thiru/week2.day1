package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login"	);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click(); //login
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();  //lead
		driver.findElement(By.linkText("Create Lead")).click(); //create lead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestQA"); //company
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thiru"); //fn
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Murali"); //ln
		
		WebElement sourceid = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drp1=new Select(sourceid);
		drp1.selectByValue("LEAD_EMPLOYEE");
		
		WebElement campaing = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drp2= new Select(campaing);
		drp2.selectByIndex(2);
		
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Thiru");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Murali");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("sdsa");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("12/1/21");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("4l");
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		
		Select drp3= new Select(currency);
		drp3.selectByValue("INR");
		
		
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drp4=new Select(industry);
		drp4.selectByValue("IND_TELECOM");
		
		
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("25");
		
		
		
		
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drp5= new Select(owner);
		drp5.selectByValue("OWN_CCORP");
		
		
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("606626");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("New");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi good to here");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Everything is important");
		
		//contant field
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("45456446");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+2");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Thiru");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("thiruMurali@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("thiru.com");
		
		
		//personal information
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("suriya");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("naven");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("120,new street");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("4th cross");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drp7=new Select(country);
		drp7.selectByValue("IND");
		Thread.sleep(3000);
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drp6=new Select(state);
		drp6.selectByVisibleText("TAMILNADU");
		
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("505055");
		
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("87878");
		//driver.findElement(By.id("lastNameField")).sendKeys("Murali");
		
		//driver.findElement(By.name("submitButton")).click();
		
		//driver.close();
		

	}

}
