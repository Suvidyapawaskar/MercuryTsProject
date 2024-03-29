package com.mt.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mt.config.Config;
import com.mt.utility.LaunchApp;

public class Loginpage 
{

 @FindBy(how=How.XPATH,using="//input[@name='userName']")
 WebElement objusername;
 
 @FindBy(how=How.XPATH,using="//input[@name='password']")
 WebElement objpassword;
 
 @FindBy(how=How.XPATH,using="//input[@name='login']")
 WebElement objlogin;
 

	public void loadLoginpage()
	{
		PageFactory.initElements(Config.driver, this);
	}
	
	public void enterUsername(String username)
	{
		System.out.println("In enterUsername method under Loginpage");
		objusername.sendKeys(username);
		System.out.println("Username is entered successfully");
	}
	
	public void enterPassword(String password)
	{
		objpassword.sendKeys(password);
		System.out.println("Password is entered successfully");
	}
	
	public void clickonLogin()
	{
		objlogin.click();
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

	}

}
