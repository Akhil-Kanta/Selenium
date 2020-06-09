package com.hrms.testscripts;

import org.testng.annotations.Test;

public class TC_5130 {
	@Test(groups="Regression",priority=1)
	public void meth1() {
	System.out.println("This is meth1() in TC_5130");
	}
	@Test(groups="Sanity",priority=1)
	public void meth2() {
	System.out.println("This is meth2() in TC_5130");
	}
	@Test(groups="Regression",priority=2)
	public void meth3() {
	System.out.println("This is meth3() in TC_5130");
	}
	@Test(groups="Sanity",priority=2)
	public void meth4() {
	System.out.println("This is meth4() in TC_5130"); 
	}

}
