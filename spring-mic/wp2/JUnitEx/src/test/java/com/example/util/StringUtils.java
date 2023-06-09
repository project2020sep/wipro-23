package com.example.util;

public class StringUtils {
	
	public static boolean isPalindrome(String s){
		
		String str = s, reverseStr = "";
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) {
	      reverseStr = reverseStr + str.charAt(i);
	    }

	    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
	      System.out.println(str + " is a Palindrome String.");
	      return true;
	    }
	    else {
	      System.out.println(str + " is not a Palindrome String.");
	      return false;
	    }
	  }
	

}
