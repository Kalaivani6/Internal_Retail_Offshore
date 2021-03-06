package com.retail.stepDefinitions;

import org.apache.log4j.Logger;

import com.framework.utils.ExtentReporter;
import com.framework.utils.LogUtils;
import com.retail.pageObjects.*;

import cucumber.api.java.en.*;

public class BrowseDevice extends BrowseDevicePage{

	private static Logger log = Logger.getLogger(BrowseDevice.class);	
	DeviceBrand devicebrand = new DeviceBrand();
	
@When("^Click on any Device in catalog$")	
	public void selectDevice_Verify()  throws Exception{
		try 
		{
			String flag=getXMLData("flag");
				if(flag.equals("H"))
				{
				ExtentReporter.reportStep("BDD Step: When Click on any Device in catalog", "INFO");
				String deviceName=getXMLData("Device_Name"+DeviceSearch.device_count);
			     BrowseDevicePage.selectDevice(deviceName);
			     log.info("Click on any Device");
				}
				if(flag.equals("S")){
					String deviceName=getXMLData("Device_Name");
				     BrowseDevicePage.selectDevice(deviceName);
				     log.info("Click on any Device");
				}
		}catch (Exception e) {
			log.error("GOT EXCEPTION in Device_Brand(): " + LogUtils.logStackTrace(e));
			e.printStackTrace();
			throw(e);
		}
	}
@And("^Select Color$")	
public void selectColor_Verify()  throws Exception{
	try {
		ExtentReporter.reportStep("BDD Step: And Select Color", "INFO");
		String flag=getXMLData("flag");		
		if(flag.equals("H"))
		{
		String deviceColor=getXMLData("Color"+DeviceSearch.device_count);
	    BrowseDevicePage.selectColor(deviceColor);
		}
		if(flag.equals("S"))
		{
		String deviceColor=getXMLData("Color");
	    BrowseDevicePage.selectColor(deviceColor);
		}
		//clickElement(BrowseDevicePage.deviceColor);
	}catch (Exception e) {
		log.error("GOT EXCEPTION in Device_Brand(): " + LogUtils.logStackTrace(e));
		e.printStackTrace();
		throw(e);
	}
}
@And("^Select Storage$")	
public void selectStorage_Verify() throws Exception {
	try {
		String flag=getXMLData("flag");		
		if(flag.equals("H"))
		{
		ExtentReporter.reportStep("BDD Step: And Select Storage", "INFO");
		String deviceCapacity=getXMLData("Capacity"+DeviceSearch.device_count);
	     BrowseDevicePage.selectCapacity(deviceCapacity);
		}
		if(flag.equals("S")){
			ExtentReporter.reportStep("BDD Step: And Select Storage", "INFO");
			String deviceCapacity=getXMLData("Capacity");
		     BrowseDevicePage.selectCapacity(deviceCapacity);
		}
	}catch (Exception e) {
		log.error("GOT EXCEPTION in Device_Brand(): " + LogUtils.logStackTrace(e));
		e.printStackTrace();
		throw(e);
	}
}
@Then("^Verify total amount$")	
public void verifyTotalAmount() throws Exception {
	try {
		 ExtentReporter.reportStep("BDD Step: Then Verify total amount", "INFO");
	     //checkElement(BrowseDevicePage.Total);
	     
	}catch (Exception e) {
		log.error("GOT EXCEPTION in Device_Brand(): " + LogUtils.logStackTrace(e));
		e.printStackTrace();
		throw(e);
	}
}
@Then("^Click on Select$")	
public void clickSelect() throws Exception {
	try {
		ExtentReporter.reportStep("BDD Step: Then Click on Select", "INFO");
		System.out.println("Click on Select");
		if(getXMLData("NumberOfLines").contains("Accessories"))
		{	
			System.out.println("If part");
			clickElement(BrowseAccessoryPage.accessorySelectBtn);
		}else
		{
			System.out.println("Else part");
			clickElement(BrowseDevicePage.deviceSelect);
		}
	}catch (Exception e) {
		log.error("GOT EXCEPTION in Device_Brand(): " + LogUtils.logStackTrace(e));
		e.printStackTrace();
		throw(e);
	}
}
@And("^it redirects to Device_Config page$")	
public void redirectToDeviceConfig() throws Exception {
	try {
		ExtentReporter.reportStep("BDD Step: And it redirects to Device_Config page", "INFO");
	     clickElement(BrowseDevicePage.deviceSelect);
	     
	}catch (Exception e) {
		log.error("GOT EXCEPTION in Device_Brand(): " + LogUtils.logStackTrace(e));
		e.printStackTrace();
		throw(e);
	}
}
@Then("^agent selects the device color and capacity$")
public void agentSelect() throws Exception{
	try{
	ExtentReporter.reportStep("BDD Step: Then agent selects the device color and capacity", "INFO");
	selectDevice_Verify();
	selectStorage_Verify();
	selectColor_Verify();
	verifyTotalAmount();
	clickSelect();
	}catch(Exception e){
		e.printStackTrace();
		throw(e);
	}
}
@When("^I select a device with its customization$")
public void select_device_customize() throws Exception
{
	try{
		ExtentReporter.reportStep("BDD Step: When I select a device with its customization", "INFO");
		devicebrand.selectDeviceBrand();
		devicebrand.redirectedToBrowseDevice();
		agentSelect();
	}catch(Exception e){
		e.printStackTrace();
		throw(e);
}

}
}
