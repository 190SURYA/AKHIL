package com.hrms.testscripts;
import com.hrms.lib.General;

public class TC004 {
	public static void main(String[] args) throws InterruptedException {
		General g = new General();
		g.openApplication();
		g.login();
		g.enterFrame();
		g.addNewEmp();
		g.checkbox();
		g.exitFrame();
		g.logout();
		g.closeApplication();

}
}