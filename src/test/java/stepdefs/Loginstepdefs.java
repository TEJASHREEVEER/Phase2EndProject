package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class Loginstepdefs {

	WebDriver Driver = Hooks.driver;

	@Given("I have launched the application")
	public void i_have_launched_the_application() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions

		Driver.get(" https://www.saucedemo.com/");

		Thread.sleep(3000);

	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String UserName) {
		// Write code here that turns the phrase above into concrete actions
		WebElement userName = Driver.findElement(By.xpath("//input[@name='user-name']"));
		userName.sendKeys(UserName);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String Password) {
		// Write code here that turns the phrase above into concrete actions
		WebElement password = Driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(Password);
	}

	@When("I click on Login button")
	public void i_click_on_Login_button() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		WebElement loginBtn = Driver.findElement(By.xpath("//input[@name='login-button']"));
		loginBtn.click();
		Thread.sleep(2000);
	}

	@Then("I should land on home page")
	public void i_should_land_on_home_page() {
		// Write code here that turns the phrase above into concrete actions
		String expected_url = "https://www.saucedemo.com/inventory.html";
		String actual_url = Driver.getCurrentUrl();

		Assert.assertEquals(expected_url, actual_url);
		System.out.println("Login Succesfull");
	}

	@Then("I should get the error message as {string}")
	public void i_should_get_the_error_message_as(String ExpError) throws InterruptedException {

		WebElement error = Driver.findElement(By.xpath("//h3[@data-test='error']"));

		Thread.sleep(3000);
		String actError = error.getText();
		Thread.sleep(3000);

		Assert.assertEquals(actError, ExpError);
	}

}
