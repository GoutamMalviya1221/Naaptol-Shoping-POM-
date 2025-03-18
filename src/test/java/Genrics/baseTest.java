package Genrics;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

import PageClasses.BabyCare;
import PageClasses.GamesPuzzles;
import PageClasses.HomePageNT;
import PageClasses.OutdoorPlay;


public class baseTest{
	
	protected WebDriver driver;
	String url;
	protected HomePageNT hpHomePage;
	protected OutdoorPlay otOutdoorPlay;
	protected GamesPuzzles gpGamesPuzzles;
	protected BabyCare bcBabyCare;
	protected WebDriverWait wait;
	protected String Display;
	protected SoftAssert sA;
	
	
	
	@BeforeClass
	public void setup() throws IOException {
		
		driver = new ChromeDriver();
		driver.get("https://www.naaptol.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		sA = new SoftAssert();
		
		
		
		
		hpHomePage = new HomePageNT(driver);
		otOutdoorPlay = new OutdoorPlay(driver);
		gpGamesPuzzles = new GamesPuzzles(driver);
		bcBabyCare = new BabyCare(driver);

		
}
	
	@AfterClass
	public void teardown() {
		driver.close();
	}
	}
