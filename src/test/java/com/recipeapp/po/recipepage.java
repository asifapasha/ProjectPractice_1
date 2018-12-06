package com.recipeapp.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.recipeapp.launch.browserLaunch;


public void recipebuttontest(){
		launchDriver();	
	}
	//@FindBy(xpath = "someXpathExpression") private WebElement dropDown;


public void clickrecipe(){
	WebElement element = driver.findelement(By.xpath("//h4[contains(text(),'Chinese Chicken')]"));
	element.isDisplayed();
}

