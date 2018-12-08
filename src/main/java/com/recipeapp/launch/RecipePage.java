package com.recipeapp.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecipePage extends BrowserLaunch
{
	public RecipePage(WebDriver driver) {
		super(driver);
	}

	public void recipebuttontest() {
		launchDriver();
	}
	//@FindBy(xpath = "someXpathExpression") private WebElement dropDown;


	public void clickrecipe() {
		WebElement element = driver.findElement(By.xpath("//h4[contains(text(),'Chinese Chicken')]"));
		element.isDisplayed();
	}
}
