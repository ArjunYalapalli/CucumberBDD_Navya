package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverInitilization.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Login {

	WebDriver driver = DriverFactory.getDriver();
	HomePage hm = new HomePage(driver);
	LoginPage lp = new LoginPage(driver);

	@Given("I visit the Magento website")
	public void i_visit_the_magento_website() {

		System.out.println(driver.getTitle());
	}

	@When("I click on the {string} linktext")
	public void i_click_on_the_linktext(String string) {
		hm.click_On_SignIN();
	}

	@When("I enter the username {string}")
	public void i_enter_the_username(String string) {

		lp.enter_Email(string);
	}

	@When("I enter the password {string}")
	public void i_enter_the_password(String string) {

		lp.enter_Password(string);

	}

	@When("I click on the {string} button")
	public void i_click_on_the_button(String string) {

		lp.click_SignIn_btn();

	}

	@Then("I should see the {string} message")
	public void i_should_see_the_message(String string) {

		driver.findElement(By.xpath("//*[contains(text(),'" + string + "')]")).isDisplayed();

	}

	@When("I dont enter the username")
	public void i_dont_enter_the_username() {

		System.out.println("username is blank");
	}

	@When("I dont enter the password")
	public void i_dont_enter_the_password() {

		System.out.println("password is blank");

	}

}
