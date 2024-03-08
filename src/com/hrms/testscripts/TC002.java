package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC002 {
	public static void main(String args[]) {
		//Test Steps
		General g = new General();
		g.openApplication();
		g.login();
		g.enterFrame();
		g.addNewEmp();
		g.exitFrame();
		g.logout();
		g.closeApplication();

}
}