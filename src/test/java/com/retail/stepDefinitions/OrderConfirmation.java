package com.retail.stepDefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.utils.ExtentReporter;
import com.framework.utils.LogUtils;
import com.retail.pageObjects.CustomerPreSignaturePage;
import com.retail.pageObjects.OrderConfirmationPage;

import cucumber.api.java.en.*;


public class OrderConfirmation extends OrderConfirmationPage{

	private static Logger log = Logger.getLogger(OrderConfirmation.class);
	
	@Then("^agent sees the order confirmation$")
	public void orderConfirm() throws Exception {
		successmessage();
		receiptdetails();
		merchantaddress();
		paymentdetails();		
		
	}
	
	
	
	@Then("^I see Successfull message of order placement$")
	public  void successmessage() throws Exception {
		try {
			ExtentReporter.reportStep("BDD Step: I see Successfull message of order placement", "INFO");
			
//			WebDriverWait wait = new WebDriverWait(getDriver(),300);
//			wait.until(ExpectedConditions.presenceOfElementLocated(success));
			String successmsg=getValue(OrderConfirmationPage.success);
	        verifyText(successmsg);
	              
		}catch (Exception e) {
			log.error("GOT EXCEPTION in successmessage(): " + LogUtils.logStackTrace(e));
			e.printStackTrace();
			throw(e);
		}
	}
	
	@Then("^I see receipt number and mailed to email Id in Success message$")
	public  void receiptdetails() throws Exception {
		try {
			ExtentReporter.reportStep("BDD Step: I see receipt number and mailed to email Id in Success message", "INFO");
			String receipttextmsg =getValue(OrderConfirmationPage.receipttext);
	        verifyText(receipttextmsg);
	        String ordernum =getValue(OrderConfirmationPage.ordernum);
	        //verifyText(ordernum);
	        
	        if(!ordernum.isEmpty())
			{
				ExtentReporter.reportStep(getDriver(), "Order ID is displayed", "PASS",  1);
				log.info("Order ID is displayed");
			}
			else
			{
				ExtentReporter.reportStep(getDriver(), "Order ID is not displayed", "FAIL",  0);
				log.info("Order ID is not displayed");
			}	
	    }catch (Exception e) {
			log.error("GOT EXCEPTION in receiptdetails(): " + LogUtils.logStackTrace(e));
			e.printStackTrace();
			throw(e);
		}
	}
	
	@Then("^I see merchant address$")
	public  void merchantaddress() throws Exception {
		try {
			ExtentReporter.reportStep("BDD Step: I see merchant address", "INFO");
			String merchtext =getValue(OrderConfirmationPage.merchtext);
	        verifyText(merchtext);
	        String merchname =getValue(OrderConfirmationPage.merchname);
	        verifyText(merchname);
	        String merchaddress =getValue(OrderConfirmationPage.merchaddress);
	        verifyText(merchaddress);
	        String merchcity =getValue(OrderConfirmationPage.merchcity);
	        verifyText(merchcity);
	        String web =getValue(OrderConfirmationPage.web);
	        verifyText(web);
	        
	    }catch (Exception e) {
			log.error("GOT EXCEPTION in merchantaddress(): " + LogUtils.logStackTrace(e));
			e.printStackTrace();
			throw(e);
		}
	}
	
	
	@Then("^I see payment details$")
	public  void paymentdetails() throws Exception {
		try {
			ExtentReporter.reportStep("BDD Step: I see payment details", "INFO");
			String paymenttext =getValue(OrderConfirmationPage.paymenttext);
	        verifyText(paymenttext);
	        String creditimage =getValue(OrderConfirmationPage.creditimage);
	        verifyText(creditimage);
	        String credittext =getValue(OrderConfirmationPage.credittext);
	        verifyText(credittext);
	        String chargetext =getValue(OrderConfirmationPage.chargetext);
	        verifyText(chargetext);
	 }catch (Exception e) {
			log.error("GOT EXCEPTION in paymentdetails(): " + LogUtils.logStackTrace(e));
			e.printStackTrace();
			throw(e);
		}
	}
	
	
	}
