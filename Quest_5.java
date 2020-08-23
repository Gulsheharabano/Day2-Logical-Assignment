package com.Day_2_part_A;

import java.util.Scanner;

public class Quest_5 {
	/*
	 * Necklace is related to Gold in the same way as a shirt is related to ?
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the related = ");
		String str=sc.next();
		switch (str) 
		{
		case "Necklace": System.out.println("Necklace is related to Gold");
			break;
		case "shirt": System.out.println("shirt is related to Cotton");
			break;
		default: System.out.println("Not a Match");
			break;
		}

	}

}
