package com.hrms.testscripts;

import org.testng.annotations.Test;

public class TC_5131 {
	@Test(groups="Regression")
	public void meth1() {
	System.out.println("This is meth1() in TC_5131");
	}
	@Test(groups="Regression")
	public void meth2() {
	System.out.println("This is meth2() in TC_5131");
	}
	@Test(groups="Sanity")
	public void meth3() {
	System.out.println("This is meth3() in TC_5131");
	}
	@Test(groups="Functional")
	public void meth4() {
	System.out.println("This is meth4() in TC_5131"); 
	}
}
