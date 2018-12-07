package com.recipeapp.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserLaunch {

	//Get the chrome browser, create instance and Access browsers to launch it
	//Create Method
	WebDriver driver;
	public void launchDriver (){
		 System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
			
			driver = new ChromeDriver();

			driver.get("https://receipe-app.herokuapp.com");
		
	}
	
	
	
		
/*	public static void main(String[] args) {   
		System.setProperty("webdriver.chrome.driver", "C://BDrivers//chromedriver.exe");     
		WebDriver driver = new ChromeDriver();            
	driver.get("http://www.google.com");   
	driver.navigate().to("https://receipe-app.herokuapp.com");
	boolean status;
	String str = driver.getTitle();
	if(str== "RecipeApp"){
		    status = true;
	     }
	 else{
	   status = false;
		 }
			
	driver.getTitle();
	System.out.println(str +"Title");
	}*/
	
	
 

}
