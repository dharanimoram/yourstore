package com.yourstore.Utilites;

import java.util.Date;

public class Utilites {
	public static  int IMPLICIT_WAIT_TIME = 10;
	public static  int PAGE_Load_TIME = 0;

	public static String random_EmailID() {
		Date date = new Date();
		String num = date.toString().replace(" ", "_").replace(":", "_");
		String email = "pavan" + num + "@gmail.com";
		return email;


}
}