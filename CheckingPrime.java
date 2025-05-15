package com.sprint1;

public class CheckingPrime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 25;
		boolean isPrime = true;
		 if(num <= 1)
		 {
			 isPrime = false;
		 }
		 
		 for(int i=2;i<=Math.sqrt(num);i++)
		 {
			 if(num%i==0)
			 {
				 isPrime = false;
			 }
		 }
		 
		 if(isPrime)
		 {
			 System.out.println("This is not a prime");
		 }
		 else
		 {
			 System.out.println("This is a prime");
		 }
		
	}
}
