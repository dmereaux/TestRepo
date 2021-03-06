package com.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
//commentaire

  @Before
  public void setUp() throws Exception {
//	  System.setProperty("webdriver.chrome.driver", "/Users/dominiquemereaux/code/driver/chromedriver");

//    driver = new ChromeDriver();
//    baseUrl = "https://www.katalon.com/";
//    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
//    driver.get("https://jobs.preprod.meinestadt.de/");
//    driver.findElement(By.id("jobautocompletion")).click();
//    driver.findElement(By.id("jobautocompletion")).clear();
//    driver.findElement(By.id("jobautocompletion")).sendKeys("##source:xml");
//    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Wo?'])[1]/following::span[1]")).click();
 //   assertEquals("\"##source:xml\" in Deutschland", driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Schliessen'])[1]/following::h1[1]")).getText());
  //  driver.findElement(By.xpath("//div[@id='ms-jobs-result-list-items']/ul/li[3]/div/div/div/a")).click();
 ////div[contains(@class, 'ms-resultlist-items')]//div[contains(@class, 'ms-result-item-wrapper')])[%s]  
 //   driver.findElement(By.xpath("//div[contains(@class, 'ms-resultlist-items')]//div[contains(@class, 'ms-result-item-wrapper')][2]")).click();
   assertEquals(2,2);

  }

  @After
  public void tearDown() throws Exception {
 //   driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
