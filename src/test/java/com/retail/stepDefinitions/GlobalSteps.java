package com.retail.stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.security.UserAndPassword;

import com.framework.wrapper.WebOperations;

import cucumber.api.java.en.Given;

public class GlobalSteps extends WebOperations{
	
	@Given("^I launch the Retail application as an agent$")
	public void i_launch_the_retail_url() throws Exception{	
		try{
		WebOperations.launchApp(getUrl(getEnvironment()));
//		Alert alert = getDriver().switchTo().alert() ;
//		String user_name="ckalya200";
//		String password="PageObject@0005";
//		alert.authenticateUsing(new UserAndPassword(user_name,password));;
//		 getDriver().switchTo().defaultContent() ; 
		WebOperations.verifyText("Look Up Customer");
		
		}catch(Exception e){
			e.printStackTrace();
			throw(e);
		}
	}
}
