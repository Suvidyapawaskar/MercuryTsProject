package com.mt.modules;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mt.pages.FlightFinderpage;
import com.mt.pages.Loginpage;

public class Login 
{
	@Parameters ({"usernm","passwd"})
	@Test
	public void executeLogin(String username,String password)
	{
		Loginpage lgpg= new Loginpage();
		lgpg.loadLoginpage();
		lgpg.enterUsername(username);
		lgpg.enterPassword(password);
		lgpg.clickonLogin();
		
		FlightFinderpage fg= new FlightFinderpage();
		fg.loadFlightFinderpage();
		fg.verifyFlightFinderimg();
		fg.clickonSignoff();
		
	}

}
