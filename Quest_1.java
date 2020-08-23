package com.Day_2_part_A;

import java.util.Scanner;

public class Quest_1 {
	/*
	 * If the seventh day of a month is three days earlier than Friday, 
	 * what day will it be on the twentieth day of the month ?
	 */

	public static void main(String[] args) {
		int weekday=7;
		int day;
		Scanner sc=new Scanner(System.in);
		System.out.println("what day will it be on the twentieth day of the month ?");
		day=sc.nextInt();
		int ans=day-weekday;
		
		int cnt=0;
		
		for(int i=0;i<ans;i++)
		{
			if(i%2!=0)
			{
				//odd=odd+cnt;
				cnt++;
			}
		}
		int result;
		if(day%2==0)
		{
			result=cnt;
		}
		else
		{
			result=cnt-1;
		}
		
		switch(result)
		{
		case 1:System.out.println("Wensday");
		break;
		case 2:System.out.println("thursday");
		break;
		case 3:System.out.println("Friday");
		break;
		case 4:System.out.println("Saturday");
		break;
		case 5:System.out.println("Sunday");
		break;
		case 6:System.out.println("Monday");
		break;
		case 7:System.out.println("Tuesday");
		break;
			
		}

	}

}
