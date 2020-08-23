package com.Day_2_part_A;

public class Pattern {

	public static void main(String[] args) {

		int n = 2;
		for (int i = 1, k = 0; i <= n; ++i, k = 0) {

			for (int space = 1; space <= n - i; ++space) 
			{
				System.out.print("_");
			}
			while (k != 2 * i - 1) 
			{
				System.out.print("*");
				++k;
			}
			for (int s = 1; s <= n - i; ++s) 
			{
				System.out.print("_");
			}
			System.out.println();
		}

	}
}
