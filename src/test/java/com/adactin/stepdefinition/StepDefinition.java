package com.adactin.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adactin.baseclass.Base_Class;
import com.adactin.runner.RunnerClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {
	public static WebDriver driver=RunnerClass.driver;
	
	@Given("launch Url")
	public static void launch_url() {
		getUrl("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   }
	@When("user Enter The Username In The {string} Field")
	public void user_enter_the_username_in_the_field(String u) throws InterruptedException {
		WebElement username=driver.findElement(By.id("username"));
		userInput(username, u);
		
	}
	@When("user Enter The Password In The {string} Field")
	public void user_enter_the_password_in_the_field(String p) throws InterruptedException {
		WebElement password=driver.findElement(By.id("password"));
		userInput(password, p);
	}
	
	@Then("user click The Login Page In Navigate To Next Web Page On Serarch Hotel")
	public void user_click_the_login_page_in_navigate_to_next_web_page_on_serarch_hotel() throws InterruptedException {
		WebElement login=driver.findElement(By.id("login"));
		clickOnElement(login);

	}

	@When("user Select The Location")
	public static void user_select_the_location() {
		
		WebElement location=driver.findElement(By.id("location"));
		userInput(location, "London");
	}
	
	@When("user Select Hotel")
	public static void user_select_hotel() {
		WebElement hotel=driver.findElement(By.id("hotels"));
		userInput(hotel, "Sunshine");
	}
	
	@When("user Select Room Type")
	public static void user_select_room_type() {
		WebElement roomtype=driver.findElement(By.id("room_type"));
		userInput(roomtype, "Double");
	}
	
	@When("user Select Number Of Room")
	public static void user_select_number_of_room() {
		WebElement roomno=driver.findElement(By.id("room_nos"));
		userInput(roomno, "1-One");
	}
	
	@When("user Enter The Check In Date")
	public static void user_enter_the_check_in_date() {
		WebElement check_in=driver.findElement(By.id("datepick_in"));
		clearElement(check_in);
		userInput(check_in, "19/7/22");
	}
	
	@When("user Enter The Check Out Date")
	public static void user_enter_the_check_out_date() {
		
		WebElement check_out=driver.findElement(By.id("datepick_out"));
		clearElement(check_out);
		userInput(check_out, "20/7/22");
	}
	@When("user Select Adults Per Room")
	public static void user_select_adults_per_room() {
		
		WebElement adult_room=driver.findElement(By.id("adult_room"));
	    userInput(adult_room, "One");
	}
	
	@When("user Select Children Per Room")
	public static void user_select_children_per_room() {
		WebElement child_room=driver.findElement(By.id("child_room"));
		userInput(child_room, "2-Two");
	}
	
	@Then("user Click The Search Button And Navigate to  Select Hotel")
	public static void user_click_the_search_button_and_navigate_to_select_hotel() {
		WebElement search=driver.findElement(By.id("Submit"));
		clickOnElement(search);
		
	}
	@When("user Click Radio Button")
	public static void user_click_radio_button() {
		WebElement select_hotel=driver.findElement(By.id("radiobutton_4"));
		clickOnElement(select_hotel);
		}
	
	@Then("user Click The Continue Button In Navigate To Book A Hotel")
	public static void user_click_the_continue_button_in_navigate_to_book_a_hotel() {
		WebElement cbtn=driver.findElement(By.name("continue"));
		clickOnElement(cbtn);

	}

	@When("user Enter The First Name In The Field")
	public static void user_enter_the_first_name_in_the_field() {
		WebElement fname=driver.findElement(By.id("first_name"));
		userInput(fname, "selvi");	
	}
	
	@When("user Enter The Last Name In The Field")
	public static void user_enter_the_last_name_in_the_field() {
		WebElement lname=driver.findElement(By.id("last_name"));
		userInput(lname, "k");
	}
	
	@When("user Enter The Billind Address In The Field")
	public static void user_enter_the_billind_address_in_the_field() {
		
		WebElement addr=driver.findElement(By.id("address"));
		userInput(addr, "Anna nagar");
	}
	
	@When("user Enter The Credit Card no In The {string} No Field")
	public void user_enter_the_credit_card_no_in_the_no_field(String c) {
		WebElement ccard_no=driver.findElement(By.id("cc_num"));
		userInput(ccard_no, c);
	}

	@When("user Select Credit Card Type")
	public  static void user_select_credit_card_type() {
		
		WebElement cc_type=driver.findElement(By.id("cc_type"));
	    userInput(cc_type, "VISA");

	}
	@When("user Select Expire Date For Select Month")
	public static void user_select_expire_date_for_select_month() {
		WebElement cc_exp=driver.findElement(By.id("cc_exp_month"));
		userInput(cc_exp, "October");
	}
	
	@When("user Select Expire Date For Select Year")
	public static void user_select_expire_date_for_select_year() {
		WebElement cc_exp_year=driver.findElement(By.id("cc_exp_year"));
	     userInput(cc_exp_year, "2022");
	}


   @When("user Enter The VCC  Number {string} Field")
    public void user_enter_the_vcc_number_field(String c) {
	   
	   WebElement cc_number=driver.findElement(By.id("cc_cvv"));
		userInput(cc_number, c);
     }




		@Then("User Click The Book Now Button And Navigate To Booking Confirmation")
	public void user_click_the_book_now_button_and_navigate_to_booking_confirmation() {
			
			WebElement book_now=driver.findElement(By.id("book_now"));
			clickOnElement(book_now);		
	}

		@When("user Click The Logout Button")
		public void user_click_the_logout_button() {
			WebElement logout=driver.findElement(By.id("logout"));
		    clickOnElement(logout);
			
		}

		
		
		
	  



}
