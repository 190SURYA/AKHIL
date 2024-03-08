package com.hrms.lib;
import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	//Test data
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String user = "nareshit";
	public String pass = "nareshit";
	public String empfi = "surya";
	public String emplst = "selenium";
	public String empid = "3432";
	//objects&element
	public String txt_loginname = "txtUserName";
	public String txt_password  ="txtPassword";
	public String btn_login = "Submit";
	public String link_logout = "Logout";
	public String frm_empinfo    = "rightMenu";
	public String btn_add = "//input[@value='Add']";
	public String txt_empfi = "txtEmpFirstName";
	public String txt_emplst = "txtEmpLastName";
	public String btn_save = "btnEdit";
	public String btn_edit = "EditMain";//name
	public String btn_back = "//input[@type='button'][@value='Back']";//xpath
	public String checkbox = "//input[@name='chkLocID[]']";//xpath
	public String search ="//input[@id='loc_name']";
	public String searchbtn ="//input[@type='button'][@value='Search']";//xpath
	public String btn_delete = "//input[@type='button'][@value='Delete']";
	
	
			

}
