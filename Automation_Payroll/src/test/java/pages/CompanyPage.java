package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {

	WebDriver driver;

	@FindBy(xpath = "//input[@id='company-company_name']")
	WebElement name;

	@FindBy(name = "Company[company_email]")
	WebElement email;

	@FindBy(name = "Company[company_address]")
	WebElement address;

	@FindBy(xpath = "//input[@name='Company[started_at]']")
	WebElement starteDate;

	@FindBy(xpath = "//i[@class='glyphicon glyphicon-ok']")
	WebElement clickStatusBtn;

	@FindBy(xpath = "//button[@class='btn btn-success']")
	WebElement buttonSave;
	
	@FindBy(xpath = "//div[@class='col-sm-6 page-title']")
	WebElement headerTitle;

	@FindBy(xpath = "//footer[@class='footer-bg']")
	WebElement footerTitle;

	@FindBy(xpath = "//label[text()='Company Name']")
	WebElement companyName;

	@FindBy(xpath = "//label[text()='Company Email']")
	WebElement companyEmail;
	
	@FindBy(xpath = "//label[text()='Company Address']")
	WebElement companyAddress;
	
	@FindBy(xpath = "//label[text()='Started At']")
	WebElement startedAt;
	
	@FindBy(xpath = "//span[@class='cbx-icon']")
	WebElement status;

	@FindBy(xpath = "//a[text()='Branch']")
	WebElement branch;

	public CompanyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void enterCompanyName(String companyname) {
		name.clear();
		name.sendKeys(companyname);
	}

	public void enterComnpanyEmailId(String emailId) {
		email.clear();
		email.sendKeys(emailId);
	}

	public void enterCompanyAddress(String Address) {
		address.clear();
		address.sendKeys(Address);
	}

	public void enterStartedDate(String date) {
		starteDate.clear();
		starteDate.sendKeys(date);
	}

	public void clickOnStatusBtn() {
		clickStatusBtn.click();
	}

	public void clickSaveBtn() {
		buttonSave.click();
	}
	
	public String getHeaderTitleTxt() {
		return headerTitle.getText();
	}

	public String getFooterTitleTxt() {
		return footerTitle.getText();
	}

	public String getCompanyFieldTxt() {
		return companyName.getText();
	}

	public String getCompanyEmailFieldTxt() {
		return companyEmail.getText();
	}
	
	public String getCompanyAddressFieldTxt() {
		return companyAddress.getText();
	}
	
	public String getStartedAtFieldTxt() {
		return startedAt.getText();
	}
	
	public boolean isStatusBoxClicked() {
		return status.isDisplayed();
	}

	public BranchPage clickonBranchsubMenu() {
		branch.click();
		return new BranchPage(driver);

	}

}
