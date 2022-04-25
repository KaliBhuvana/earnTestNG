package LearnParamaterization;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
@Test(dataProvider="sendData")
	public  void runCreateLead(String cName, String fName, String lName, String phNo) throws InterruptedException {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider
public String[][] sendData() throws IOException {
	
//	String[][] readData = ReadExcel.readData();
	return ReadExcel.readData("CreateLead (2)");
	
	/*String[][] d=new String[2][4];
	d[0][0]="CTS";
	d[0][1]="Kali Bhuvana";
	d[0][2]="M";
	d[0][3]="740";
	
	d[1][0]="IPP";
	d[1][1]="Ashoknath";
	d[1][2]="S";
	d[1][3]="890";

	return d;*/
}

}




