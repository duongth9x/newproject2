package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kenh14Page {

	WebDriver driver;

	@FindBy(css = ".kmm-list-categories.clearfix li:nth-child(16)")
	private WebElement hocDuongMenu;
	
	@FindBy(css = "#searchinput.ktts-text")
	private WebElement txtSearch;
	
	@FindBy(css = ".ktt-search-container.fr a")
	private WebElement btnSearch;

	public Kenh14Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void clickHocDuongMenu() {
		hocDuongMenu.click();
	}
	
	public void enterSearchTextbox(String text) {
		txtSearch.clear();
		txtSearch.sendKeys(text);
	}
	
	public void pressSearchButton() {
		btnSearch.click();
	}

}
