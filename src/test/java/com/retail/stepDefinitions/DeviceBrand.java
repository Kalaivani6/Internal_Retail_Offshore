package com.retail.stepDefinitions;

import org.apache.log4j.Logger;
import com.framework.utils.LogUtils;
import com.retail.pageObjects.*;


import cucumber.api.java.en.*;


public class DeviceBrand extends DeviceBrandPage{

	private static Logger log = Logger.getLogger(DeviceBrand.class);
	
	
@When("^I select a device brand$")	
	public void selectDeviceBrand() throws Exception {
		try {
			String flag=getXMLData("flag");
			System.out.println(flag);
			if(flag.equals("H"))
			{
			String deviceName=getXMLData("DeviceBrandName"+DeviceSearch.device_count);
		     DeviceBrandPage.selectDeviceBrand(deviceName);
			}
			if(flag.equals("S")){
			String deviceName=getXMLData("DeviceBrandName");
		     DeviceBrandPage.selectDeviceBrand(deviceName);
			}
		}catch (Exception e) {
			log.error("GOT EXCEPTION in Device_Brand(): " + LogUtils.logStackTrace(e));
			e.printStackTrace();
			throw(e);
		}
	}
@Then("^I am redirected to Browse_Devices page$")
public void redirectedToBrowseDevice() throws Exception{
	try {
		isElementDisplayed(BrowseDevicePage.deviceButton,10);
		log.info("Redirected to Browse_Device Page");
	}catch (Exception e) {
		log.error("GOT EXCEPTION in Device_Brand(): " + LogUtils.logStackTrace(e));
		e.printStackTrace();
		throw(e);
	}
}
@When("^agent chooses a specific device$")
public void chooseDevice() throws Exception{
	try{
		selectDeviceBrand();
	redirectedToBrowseDevice();
	//BrowseDevice.selectDevice();
	}catch(Exception e){
		e.printStackTrace();
		throw(e);
	}
}

@When("^agent chooses a specific accessory category$")
public void chooseAccessory() throws Exception{
	try{
		selectAccessoryCategory();
		redirectedToBrowseAccessories();
	//BrowseDevice.selectDevice();
	}catch(Exception e){
		e.printStackTrace();
		throw(e);
	}
}
@When("^I select an accessory$")	
public void selectAccessoryCategory() throws Exception {
	try {
		String accessoryName=getXMLData("AccessoryCategory");
	     DeviceBrandPage.selectAccessoryCategory(accessoryName);
	}catch (Exception e) {
		log.error("GOT EXCEPTION in selectAccessoryCategory(): " + LogUtils.logStackTrace(e));
		e.printStackTrace();
		throw(e);
	}
}

@Then("^I am redirected to Browse_Accessories page$")
public void redirectedToBrowseAccessories() throws Exception{
	try {
		isElementDisplayed(BrowseAccessoryPage.accessoryButton,10);
		log.info("Redirected to Browse_Accessories Page");
	}catch (Exception e) {
		log.error("GOT EXCEPTION in redirectedToBrowseAccessories(): " + LogUtils.logStackTrace(e));
		e.printStackTrace();
		throw(e);
	}
}
@When("^I click on View catalog link for Accessories by Category$")
public void viewCatalog() {
	try {
	clickElement(DeviceBrandPage.ViewCatalog);
	log.info("Clicked View Catalog");
	}

	catch (Exception e) {
	log.error("GOT EXCEPTION in viewCatalog(): " + LogUtils.logStackTrace(e));
	e.printStackTrace();
	throw(e);
}
}
@Then("^I am in Device_Brands page$")
public void Device_Brand() throws Exception 
{
	try{
		isElementDisplayed(DeviceBrandPage.PhoneByBrand,5);
	log.info("In Device_Brands page");
		
}
	catch(Exception e){
		log.error("Error in DeviceBrand page");
		e.printStackTrace();
		throw(e);
	}
}

}
