package com.dingmingguang.practice1.textjunit;


import static org.junit.Assert.*;

import org.junit.Test;

public class MessageUtilTest2 {

	   String message = "Robert";   
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testSalutationMessage() {
	      System.out.println("Inside testSalutationMessage()");
	      message = "Hi!" + "Robert";
	      assertEquals(message,messageUtil.salutationMessage());
	   }	
}
