package com.sprint1;

public class findLargest_Smallest {
	public static void main(String[] args) {
		int[] arr = {4, 7, 1, 8, 5};

		int min = arr[0];  
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) 
			{
				min = arr[i];   			
			}
		}

		System.out.println("Minimum element: " + min);


		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}

		System.out.println("Maximum element: " + max);


	}
}
