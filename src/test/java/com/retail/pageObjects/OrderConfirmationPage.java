package com.retail.pageObjects;

//import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import com.framework.wrapper.WebOperations;

public class OrderConfirmationPage extends WebOperations{

	//private static Logger log = Logger.getLogger(Account_LookUpPage.class);

	public static By 

	success = By.xpath("//h4[text()='Success!']"),
	receipttext = By.xpath("//div[text()='A receipt for order ']"),
	ordernum = By.xpath("//div[text()='A receipt for order ']//b"),
	merchtext = By.xpath("//h4[text()='MERCHANT ADDRESS']"),
	merchname = By.xpath("//my-merchant-address//p[text()='XFINITY Mobile']"),
	merchaddress = By.xpath("//my-merchant-address//p[text()='1701 John F. Kennedy Blvd.']"),
	merchcity = By.xpath("//my-merchant-address//p[text()='Philadelphia, PA 19103']"),
	web = By.xpath("//my-merchant-address//p[text()='www.xfinitymobile.com']"),
	paymenttext = By.xpath("//h4[text()='Payment Details']"),
	creditimage = By.xpath("//div[@class='credit-card']"),
	credittext = By.xpath("//p[starts-with(text(), 'VISA ending in')]"),
	chargetext = By.xpath("//p[text()='Charged at time of shipment']"); 
	
	
	
	
	
	
	
}
