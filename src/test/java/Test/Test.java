package Test;



import java.io.File;
import java.io.IOException;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;


import Genrics.baseTest;

public class Test extends baseTest {
	
	public static void capture(WebDriver driver, int n) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//using getscreenshotAs() to take screenshot

		File image = ts.getScreenshotAs(OutputType.FILE);
		
		File img = new File("D:\\Naaptol_POM_SS\\Naaptol"+n+".png");
		
		FileUtils.copyFile(image, img); 
	}
	
	@org.testng.annotations.Test(priority = 0)
	public void Homepage() throws IOException {
		
	hpHomePage.getShopingCategories().click();
	
	capture(driver, 1);
	
	}
	
	@org.testng.annotations.Test(priority = 1)
	public void KidToys() throws IOException {
		
		hpHomePage.getKidToys().click();
		capture(driver, 2);
		
	}

	@org.testng.annotations.Test(priority = 2)
	public void OutDoorPlay() throws InterruptedException, IOException {
		otOutdoorPlay.getOutdoorPlayElement().click();
		otOutdoorPlay.getUncheckBox().click();
		otOutdoorPlay.getCheckBox().click();
		otOutdoorPlay.getBrandedCheckBox().click();
		
		Thread.sleep(2000);
		otOutdoorPlay.getPriceCheckBox().click();
		
		Thread.sleep(2000);
		otOutdoorPlay.getDiscountCheckBox().click();
		
		String parent = driver.getWindowHandle();
		
		Thread.sleep(1000);
		otOutdoorPlay.getDolpinBubble().click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allwindows = driver.getWindowHandles(); 
		
		for (String window : allwindows) {
			
			if (!window.equals(parent)) {
				
				driver.switchTo().window(window);
				
				break;
			}
		}
		
		String Display = driver.findElement(By.xpath("//a[@title=\"Buy online\"]/span")).getText();
		sA.assertEquals(Display, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(parent);
		
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		capture(driver, 3);
	}
	
	@org.testng.annotations.Test(priority = 3)
	public void GamesPuzzles() throws InterruptedException, IOException {
		
		hpHomePage.getShopingCategories().click();
		hpHomePage.getKidToys().click();
		Thread.sleep(2000);
		gpGamesPuzzles.getGamesPuzzles().click();
		
		gpGamesPuzzles.getTableBoardGames().click();
		Thread.sleep(2000);
		gpGamesPuzzles.getGpCheckBox().click();
		Thread.sleep(2000);
		gpGamesPuzzles.getGpBranded().click();
		Thread.sleep(2000);
		gpGamesPuzzles.getGpPrice().click();
		Thread.sleep(2000);
		gpGamesPuzzles.getGpDiscount().click();
		
		String parent = driver.getWindowHandle();
		
		Thread.sleep(1000);
		gpGamesPuzzles.getGpLasergun().click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allwindows = driver.getWindowHandles(); 
		
		for (String window : allwindows) {
			
			if (!window.equals(parent)) {
				
				driver.switchTo().window(window);
				
				break;
			}
		}
		
		String Display = driver.findElement(By.xpath("//*[@class='button_head']")).getText();
		sA.assertEquals(Display, "No offer for sale on Naaptol.");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(parent);
		capture(driver, 4);
		
	}
	
	@org.testng.annotations.Test(priority = 4)
	public void BabyCare() throws InterruptedException, IOException {
		
		hpHomePage.getShopingCategories().click();
		hpHomePage.getKidToys().click();
		bcBabyCare.getBcBabyCar().click();
		bcBabyCare.getBcKidsfootware().click();
		
		Thread.sleep(500);
		bcBabyCare.getBcOutOfStock().click();
		Thread.sleep(500);
		bcBabyCare.getBcBrandCheck().click();
		Thread.sleep(500);
		bcBabyCare.getBcPrice().click();
		Thread.sleep(500);
		
		String parent = driver.getWindowHandle();
		bcBabyCare.getBcRainSandals().click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allwindows = driver.getWindowHandles(); 
		
		for (String window : allwindows) {
			
			if (!window.equals(parent)) {
				
				driver.switchTo().window(window);
				
				break;
			}
		}
		
		String Display = driver.findElement(By.xpath("//*[@class='button_head']")).getText();
		sA.assertEquals(Display, "No offer for sale on Naaptol.");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(parent);
		capture(driver, 5);
		
		hpHomePage.getShopingCategories().click();
		hpHomePage.getKidToys().click();
		bcBabyCare.getBcBabyCar().click();
		bcBabyCare.getBcKidsWear().click();
		bcBabyCare.getBcFreeShiping().click();
		bcBabyCare.getBcAmerican().click();
		Thread.sleep(500);
		bcBabyCare.getBc2201_3800().click();
		
		String parent1 = driver.getWindowHandle();
		Thread.sleep(1000);
		bcBabyCare.getBcCargoJeans().click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allwindows1 = driver.getWindowHandles(); 
		
		for (String window : allwindows1) {
			
			if (!window.equals(parent1)) {
				
				driver.switchTo().window(window);
				
				break;
			}
		}
		
		String Display1 = driver.findElement(By.xpath("(//*[@class='font-bold'])[2]")).getText();
		sA.assertEquals(Display1, "Currently Not Available");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(parent1);
		capture(driver, 6);
		
		hpHomePage.getShopingCategories().click();
		hpHomePage.getKidToys().click();
		bcBabyCare.getBcBabyCar().click();
		bcBabyCare.getBcBabyBedding().click();
		
		bcBabyCare.getBcBBCashonDelivery().click();
		Thread.sleep(500);
		bcBabyCare.getBcBBLuxuryQueen().click();
		Thread.sleep(500);
		bcBabyCare.getBcBB499_499().click();
		Thread.sleep(500);
		bcBabyCare.getBcBBDiscount().click();
		
		String parent2 = driver.getWindowHandle();
		Thread.sleep(1000);
		bcBabyCare.getBcBBBayMosquito().click();

		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allwindows2 = driver.getWindowHandles(); 
		
		for (String window : allwindows2) {
			
			if (!window.equals(parent2)) {
				
				driver.switchTo().window(window);
				
				break;
			}
		}

		String Display2 = driver.findElement(By.xpath("//*[@id='cart-panel-button-0']")).getText();
		sA.assertEquals(Display2, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(parent2);
		capture(driver, 7);

		hpHomePage.getShopingCategories().click();
		hpHomePage.getKidToys().click();
		bcBabyCare.getBcBabyCar().click();
		bcBabyCare.getBcBodyCare().click();
		
		bcBabyCare.getBcBodycareShipping().click();
		Thread.sleep(500);
		bcBabyCare.getBcBodyCareranded().click();
		Thread.sleep(500);
		bcBabyCare.getBcBodyCare299_299().click();
		Thread.sleep(500);
		bcBabyCare.getBcBodyCareDiscount().click();
		
		String parent3 = driver.getWindowHandle();
		Thread.sleep(500);
		bcBabyCare.getBcBabyCareQuickBrush().click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allwindows3 = driver.getWindowHandles(); 
		
		for (String window : allwindows3) {
			
			if (!window.equals(parent3)) {
				
				driver.switchTo().window(window);
				
				break;
			}
		}

		String Display3 = driver.findElement(By.xpath("//*[@id='cart-panel-button-0']")).getText();
		sA.assertEquals(Display3, "Click here to Buy");
		sA.assertAll();
		driver.close();
		driver.switchTo().window(parent3);
		capture(driver, 8);

	}
}
