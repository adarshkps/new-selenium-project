package day12OfSeleniumTestNG;

import org.testng.annotations.DataProvider;

public class MyDataProviders {

	@DataProvider
	public String[][] LoginData() {
		String data[][] = { { "Admin1","password1" },
							{ "Admin2","password2" }, 
							{ "Admin3","password3" }
							};
		return data;
	}
	 
	@DataProvider
	public String[][] LoginData2() {
		String data[][] = { { "hello","world" }, 
							{ "hi","java" }, 
							{ "selenium","TestNG" } 
							};
		return data;
	}
}
