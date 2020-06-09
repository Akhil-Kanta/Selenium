package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import com.hrms.LIB.*;
public class TC504 {
	@Test
	public void login() throws Exception{
		
		DOMConfigurator.configure("log4j.xml");
		general g = new general();
		g.openapplication();
		g.login();
		g.logout();
		g.closeapplication(); 
		}
		}
