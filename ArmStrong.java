package com.sprint1;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 153;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = String.valueOf(n).length();
		double sum=0;
		int temp = n;
		
		while(temp!=0)
		{
			int digit = temp%10;
			sum  = sum + Math.pow(digit, count);
			temp = temp / 10;
		}
		
		if(sum==n)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not ArmStrong");
		}
		

	}

}
