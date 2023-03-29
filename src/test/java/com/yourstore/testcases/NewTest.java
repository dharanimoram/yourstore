package com.yourstore.testcases;

import org.testng.annotations.Test;

import com.yourstore.base.BaseClass;

public class NewTest  extends BaseClass{
  @Test
  public void f() {
	  String s= driver.getCurrentUrl();
	  System.out.println(s);

  }
}
