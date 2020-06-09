package com.hrms.testscripts;

import com.hrms.LIB.general;

public class TC_HRMS_101 {
	public static void main(String args[]) throws Exception{
		general g= new general();
		g.openapplication();
		g.login();
		g.addemp();
		g.delmp();
		g.logout();
		g.closebrowser();
	}
}
