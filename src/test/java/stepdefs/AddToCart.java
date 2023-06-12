package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {

	WebDriver Driver = Hooks.driver;
	
	@Given("I have launch the application")
	public void i_have_launch_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Driver.get(" https://www.saucedemo.com/");

		Thread.sleep(3000);
	}

	
	@When("I click on product name as {string}")
	public void i_click_on_product_name_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		WebElement productName = Driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
		productName.click();
		//Thread.sleep(2000);
		
		//WebElement Inventory_item_name = Driver.findElement(By.xpath("//input[@id=\"item_4_title_link\"]"));
		//Inventory_item_name.click();
		
	}

	@When("I click on Add to cart button")
	public void i_click_on_Add_to_cart_button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement addToCartButton = Driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addToCartButton.click();
		//Thread.sleep(2000);
		
		//WebElement AddtoCart = Driver.findElement(By.xpath("//input[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		//AddtoCart.click();

	}

	@When("I click on Shopping cart link")
	public void i_click_on_Shopping_cart_link() {
		// Write code here that turns the phrase above into concrete actions
		WebElement shoppingCartLink = Driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		shoppingCartLink.click();
		//Thread.sleep(2000);
		//WebElement shopping_cart_link = Driver.findElement(By.xpath("//input[@id=\"shopping_cart_container\"]"));
		//shopping_cart_link.click();
	}

	@Then("I Validate whether product is displayed in cart on cart page.")
	public void i_Validate_whether_product_is_displayed_in_cart_on_cart_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		//*WebElement cart_list = Driver.findElement(By.xpath("//input[@id=\"cart_contents_container\"]"));

		WebElement productTitleOnCartPage = Driver.findElement(By.xpath("//div[@class='inventory_item_name']"));
		String actualProductName = productTitleOnCartPage.getText();
		Thread.sleep(2000);
		String expectedProductName = "Sauce Labs Backpack";
		Assert.assertEquals(actualProductName, expectedProductName);
	}

}