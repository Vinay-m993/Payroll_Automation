package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CompanyPage;
import pages.DashBoardPage;
import pages.LoginPage;
import utilities.ExcelDataUtil;

public class CompanyTest extends ExcelDataUtil {

	// @Test(dataProvider = "readExcel")
	public void verifyCompanyRegistration(String name, String password) {
		LoginPage login = new LoginPage(driver);
		login.userCredentials(name, password);
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		company.enterCompanyName("Obsqura");
		company.enterComnpanyEmailId("obsqura@test.com");
		company.enterCompanyAddress("TVMAddress");
		company.enterStartedDate("22-01-2021");
		company.clickOnStatusBtn();
		company.clickSaveBtn();
	}

	// @Test(dataProvider = "readExcel")
	public void verifyHeaderTitleTxt(String name, String password) {
		LoginPage login = new LoginPage(driver);
		login.userCredentials(name, password);
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		String ActualTitle = company.getHeaderTitleTxt();
		String ExpectedTitle = "Company";
		Assert.assertEquals(ActualTitle, ExpectedTitle, "Invalid Header Title");
	}

	// @Test(dataProvider = "readExcel")
	public void verifyFooterTitleTxt(String name, String password) {
		LoginPage login = new LoginPage(driver);
		login.userCredentials(name, password);
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		String ActualTxt = company.getFooterTitleTxt();
		String ExpectedTxt = "© My Application 2021";
		Assert.assertEquals(ActualTxt, ExpectedTxt, "Invalid Footer Title");
	}

	// @Test(dataProvider = "readExcel")
	public void verifyCompanyFieldTxt(String name, String password) {
		LoginPage login = new LoginPage(driver);
		login.userCredentials(name, password);
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		String ActualFieldTxt = company.getCompanyFieldTxt();
		String ExpectedFieldTxt = "Company Name";
		Assert.assertEquals(ActualFieldTxt, ExpectedFieldTxt, "invalid Company Field Text");
	}

	// @Test(dataProvider = "readExcel")
	public void verifyCompanyEmailFieldTxt(String name, String password) {
		LoginPage login = new LoginPage(driver);
		login.userCredentials(name, password);
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		String ActualEmailFieldTxt = company.getCompanyEmailFieldTxt();
		String ExpectedEmailFieldTxt = "Company Email";
		Assert.assertEquals(ActualEmailFieldTxt, ExpectedEmailFieldTxt, "Invalid Email Field Text");
	}

	// @Test(dataProvider = "readExcel")
	public void verifyCompanyAddressFieldTxt(String name, String password) {
		LoginPage login = new LoginPage(driver);
		login.userCredentials(name, password);
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		String ActualCompanyFieldTxt = company.getCompanyAddressFieldTxt();
		String ExpCompanyFieldTxt = "Company Address";
		Assert.assertEquals(ActualCompanyFieldTxt, ExpCompanyFieldTxt, "Invalid Company Field Text");
	}

	// @Test(dataProvider = "readExcel")
	public void verifyStartedAtFieldTxt(String name, String password) {
		LoginPage login = new LoginPage(driver);
		login.userCredentials(name, password);
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		String ActualStartedatFieldTxt = company.getStartedAtFieldTxt();
		String ExpectedStartedFieldTxt = "Started At";
		Assert.assertEquals(ActualStartedatFieldTxt, ExpectedStartedFieldTxt, "Invalid Started At Field Text");
	}

	// @Test(dataProvider = "readExcel")
	public void verifyStatusBoxClick(String name, String password) {
		LoginPage login = new LoginPage(driver);
		login.userCredentials(name, password);
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		Boolean result = company.isStatusBoxClicked();
		Assert.assertFalse(result, "Button is not clicked");
	}

}
