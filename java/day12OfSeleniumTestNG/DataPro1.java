package day12OfSeleniumTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro1 {

	// 1.admin1 password1
	// 2.admin2 password2
	// 3.admin3 password3
	@Test(dataProvider = "LoginData",dataProviderClass=MyDataProviders.class)
	public void test1(String user, String pass) {
		System.out.println("open chrome");
		System.out.println("go to login page");
		System.out.println("enter username as " + user);
		System.out.println("enter password as " + pass);
		System.out.println("click on login");
		System.out.println("-------------------------------------------");

	}

//	@DataProvider
//	public String[][] LoginData() {
//		String data[][] = { { "Admin1","password1" },
//							{ "Admin2","password2" }, 
//							{ "Admin3","password3" }
//							};
//		return data;
//	}
//	
//	@DataProvider
//	public String[][] LoginData2() {
//		String data[][] = { { "hello","world" }, 
//							{ "hi","java" }, 
//							{ "selenium","TestNG" } 
//							};
//		return data;
//	}

}
