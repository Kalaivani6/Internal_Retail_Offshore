$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PageWiseFeatures/Shopping_cart.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping_Cart",
  "description": "\nAs an agent,I need to support customer for shopping XFINITY Mobile products and plans.",
  "id": "shopping-cart",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6771254791,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I launch the Retail application as an agent",
  "keyword": "Given "
});
formatter.match({
  "location": "GlobalSteps.i_launch_the_retail_url()"
});
formatter.result({
  "duration": 66387824187,
  "error_message": "org.openqa.selenium.TimeoutException: timeout\n  (Session info: chrome\u003d59.0.3071.115)\n  (Driver info: chromedriver\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233),platform\u003dWindows NT 6.3.9600 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 60.08 seconds\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027RDSMOAU-WC-A2P\u0027, ip: \u002710.124.7.56\u0027, os.name: \u0027Windows Server 2012 R2\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.3\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.29.461591 (62ebf098771772160f391d75e589dc567915b233), userDataDir\u003dC:\\Users\\CKALYA~1\\AppData\\Local\\Temp\\2\\scoped_dir5892_10102}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d59.0.3071.115, platform\u003dWIN8_1, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: 7f8444ed24765516a8b5f2515d9f32a9\n*** Element info: {Using\u003dxpath, value\u003d(.//*[text()[contains(.,\"Look Up Customer\")]])[last()]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:671)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:437)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:356)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:398)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:882)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:44)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:183)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$6.apply(ExpectedConditions.java:180)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:209)\r\n\tat com.framework.wrapper.WebOperations.verifyText(WebOperations.java:488)\r\n\tat com.retail.stepDefinitions.GlobalSteps.i_launch_the_retail_url(GlobalSteps.java:21)\r\n\tat ✽.Given I launch the Retail application as an agent(PageWiseFeatures/Shopping_cart.feature:6)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 75,
  "name": "Validation of Line Details button by clicking Edit Cart(Top) button in Cart Page through Scan flow",
  "description": "",
  "id": "shopping-cart;validation-of-line-details-button-by-clicking-edit-cart(top)-button-in-cart-page-through-scan-flow",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 74,
      "name": "@runnewaug04"
    }
  ]
});
formatter.step({
  "line": 76,
  "name": "I am in Shopping cart Page through Scan flow",
  "keyword": "Given "
});
formatter.step({
  "line": 77,
  "name": "I click Edit cart at top of the cart summary",
  "keyword": "When "
});
formatter.step({
  "line": 78,
  "name": "I see Edit order Page",
  "keyword": "Then "
});
formatter.step({
  "line": 79,
  "name": "I click Line Details button",
  "keyword": "When "
});
formatter.step({
  "line": 80,
  "name": "I see the line details in Device Customize Page",
  "keyword": "Then "
});
formatter.match({
  "location": "DeviceSearch.shopCart_scan()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCart.editCartTop()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCart.editOrderPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCart.line_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ShoppingCart.lineDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2517638929,
  "status": "passed"
});
});