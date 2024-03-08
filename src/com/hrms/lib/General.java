package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;

public class General extends Global {
	public void openApplication() {
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("application opened");
	}
	public void closeApplication() {
		driver.quit();
		System.out.println("application closed");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(user);
		driver.findElement(By.name(txt_password)).sendKeys(pass);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("logout completed");
	}
	public void enterFrame() {
		driver.switchTo().frame(frm_empinfo);
		System.out.println("Entered into frame");
		}
		public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		}
		public void addNewEmp() {
		driver.findElement(By.xpath(btn_add)).click();    
		driver.findElement(By.name(txt_empfi)).sendKeys(empfi);
		driver.findElement(By.name(txt_emplst)).sendKeys(emplst);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("New emp added");
		driver.findElement(By.name(btn_edit)).click();
		driver.findElement(By.xpath(btn_back)).click();
		Select sc = new Select(driver.findElement(By.name("loc_code")));
		sc.selectByVisibleText("Emp. ID");
		System.out.println("emp id selected");
		}
		public void checkbox() throws InterruptedException {
			driver.findElement(By.xpath(search)).sendKeys("3433");
			System.out.println("search is ente");
			driver.findElement(By.xpath(searchbtn)).click();
			driver.findElement(By.xpath(checkbox)).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(btn_delete)).click();
			System.out.println("delete is done");
//			driver.findElement(By.xpath(checkbox)).click();
//			System.out.println("checkbox is clicked");
//			driver.findElement(By.xpath(search)).sendKeys("3457");
//			Thread.sleep(3000);
//			System.out.println("id is entered");
//			driver.findElement(By.xpath(searchbtn)).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath(btn_delete)).click();
//			System.out.println("delete completed");
		}
		
	
	}

	
	


