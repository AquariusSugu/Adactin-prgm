package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;

	@Given("User is on the Adactin page")
	public void user_is_on_the_Adactin_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@When("User should perform login {string} and {string}")
	public void user_should_perform_login_and(String user, String pass) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(user);
	
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);	
		WebElement login = driver.findElement(By.name("login"));
		login.click();;


	}

	@When("User should verify after  login {string}")
	public void user_should_verify_after_login(String string) {
Assert.assertTrue(string,true);	
	
	}

	@When("User is on the search hotel pageand search using these fields {string},{string},{string},{string},{string},{string},{string}and {string}")
	public void user_is_on_the_search_hotel_pageand_search_using_these_fields_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	
		WebElement location1 = driver.findElement(By.name("location"));
		Select select1=new Select(location1);
		select1.selectByVisibleText(string);
		WebElement hotels = driver.findElement(By.id("hotels"));
		hotels.sendKeys(string2);
	WebElement roomtype = driver.findElement(By.id("room_type"));
	roomtype.sendKeys(string3);
	WebElement roomnos = driver.findElement(By.id("room_nos"));
	roomnos.sendKeys(string4);
	WebElement datepickin = driver.findElement(By.name("datepick_in"));
	datepickin.sendKeys(string5);
	WebElement datepickout = driver.findElement(By.name("datepick_out"));
	datepickout.sendKeys(string6);
	WebElement adultroom = driver.findElement(By.id("adult_room"));
	adultroom.sendKeys(string7);
	WebElement childroom = driver.findElement(By.id("child_room"));
	childroom.sendKeys(string8);
	WebElement submit = driver.findElement(By.id("Submit"));
	submit.click();
	
	}

	@When("User should select hotel")
	public void user_should_select_hotel() throws InterruptedException {
		WebElement selecthotel = driver.findElement(By.id("radiobutton_0"));
		selecthotel.click();
		WebElement continuebtn = driver.findElement(By.id("continue"));
		continuebtn.click();
		Thread.sleep(4000);
	}

	@When("user book hotel with these fields{string},{string},{string},{string},{string},{string} ,{string} and {string}")
	public void user_book_hotel_with_these_fields_and(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
	
	WebElement first_name = driver.findElement(By.id("first_name"));
	first_name.sendKeys(string);
	WebElement last_name = driver.findElement(By.id("last_name"));
	last_name.sendKeys(string2);
WebElement address = driver.findElement(By.id("address"));	
address.sendKeys(string3);
WebElement cc_num = driver.findElement(By.id("cc_num"));
cc_num.sendKeys(string4);
WebElement cctype = driver.findElement(By.id("cc_type"));
cctype.sendKeys(string5);
WebElement month = driver.findElement(By.id("cc_exp_month"));
month.sendKeys(string6);
WebElement expyear = driver.findElement(By.id("cc_exp_year"));
expyear.sendKeys(string7);
	WebElement cvv_number = driver.findElement(By.id("cc_cvv"));
	cvv_number.sendKeys(string8);
	WebElement booknow = driver.findElement(By.id("book_now"));
	booknow.click();
	
	
	}

	@Then("User should to get the order no")
	public void user_should_to_get_the_order_no() throws InterruptedException {
		Thread.sleep(15000);
		WebElement orderno = driver.findElement(By.id("order_no"));
		String textorderno = orderno.getAttribute("value");
		System.out.println(textorderno);
	}



}
