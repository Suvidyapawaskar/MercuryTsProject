package com.mt.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mt.config.Config;
import com.mt.utility.LaunchApp;

public class FlightFinderpage 
{

	@FindBy(how=How.XPATH,using="//img[@src='/images/masts/mast_flightfinder.gif']")
	WebElement objflightfinder;
	
	@FindBy(how=How.LINK_TEXT,using="SIGN-OFF")
	WebElement objsignoff;		
	
	public void loadFlightFinderpage()
	{
		PageFactory.initElements(Config.driver, this);
		
	}
	
	public void verifyFlightFinderimg()
	{
		System.out.println("In verifyFlightFinderimg method under FlightFinderpage");
		boolean flag=objflightfinder.isDisplayed();
		System.out.println("Flight finder image is displayed");
	}
	
	public void clickonSignoff()
	{
		objsignoff.click();
		
	}	
	
	
	
	public static void main(String[] args) throws IOException 
	{
		LaunchApp lc= new LaunchApp();
		lc.openBrowser("chrome");
		lc.EnterApplicationURL("http://www.newtours.demoaut.com/mercurywelcome.php");
		lc.maximizeBrowser();
		lc.waittillLoginpageLoaded(15);
		
		Loginpage lg= new Loginpage();
		lg.loadLoginpage();
		lg.enterUsername("Suvidyap1");
		lg.enterPassword("P@ssword1");
		lg.clickonLogin();
		
		FlightFinderpage ff= new FlightFinderpage();
		ff.loadFlightFinderpage();
		ff.verifyFlightFinderimg();
		ff.clickonSignoff();
		


	}

}
