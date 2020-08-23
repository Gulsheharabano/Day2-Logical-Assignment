package com.Day_2_part_A;

public class Longest_Palindromic_Substring {
	
	public static void main(String[] args) {
		String str1 = "bananas";
		String p = "";
		for (int i = 0; i < str1.length(); i++) 
		{
			String str = "";
			for (int j = i; j < str1.length(); j++) 
			{
				str += str1.charAt(j);
				String revStr = new StringBuilder(str).reverse().toString();
				
				if (str1.contains(revStr) && p.length() < revStr.length()) 
				{
					p = revStr;
				}
				if (p.length() == str1.length()) 
				{
					break;
				}
			}
		}
		System.out.println(p);
	}
	
}