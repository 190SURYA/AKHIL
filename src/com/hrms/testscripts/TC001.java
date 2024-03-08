package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC001 {
	public static void main(String args[]) {
	    //Test Steps
		General g = new General();
		g.openApplication();
		g.login();
		g.logout();
		g.closeApplication();

}
}