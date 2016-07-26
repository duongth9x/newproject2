package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Kenh14Page;

public class demo {

	WebDriver driver;

	@BeforeTest
	public void setup() {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://kenh14.vn");

	}

	@Test(priority = 0)
	public void test_Home_Page_Appear_Correct() {
		Kenh14Page user = new Kenh14Page(driver);
		user.clickHocDuongMenu();
		user.enterSearchTextbox("hoang");
		user.pressSearchButton();
	}
}
