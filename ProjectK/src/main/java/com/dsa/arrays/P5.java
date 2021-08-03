package com.dsa.arrays;

public class P5 {
	
	public static void main(String[] args) {
		
		int[] arr = {7, 10, 4, 3, 20, 15};
		
		int k=3;

		int temp;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length - i; j++) {

				if (arr[j - 1] > arr[j]) {

					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;

				}
			}

		}

		
		System.err.println("Kth smallest element :"+arr[k-1]);
	}

}
