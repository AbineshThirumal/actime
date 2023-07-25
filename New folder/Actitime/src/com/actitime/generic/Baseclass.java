package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Baseclass 
{
	
	
	@BeforeClass
	public void Openbrowser()
	{
		Reporter.log("openbrowser",true);
	}
	
	
	@BeforeMethod
	public void closebrowser()
	{
		Reporter.log("closebrowser",true);
	}
	
	@AfterMethod
	public void login()
	{
		Reporter.log("login",true);
	}
	
	@AfterClass
	public void logout()
	{
		Reporter.log("logout",true);
	}
		
	

}

