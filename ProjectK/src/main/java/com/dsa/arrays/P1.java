package com.dsa.arrays;

public class P1 {

	public static void main(String[] args) {

		int[] arr = { 5, 8, 7, 12, 14, 3, 9 };
		int x = 8;
		int k = 2;
		int arrLen = arr.length;
		// int segLen = arrLen / k;

		boolean xFoundInSeg = false;
		int segCounter = 0;
		boolean xFoundInAllSeg = true;

		for (int i = 0; i < arrLen; i++) {

			if (arr[i] == x) {
				xFoundInSeg = true;
			}

			if (segCounter == k || i == arrLen - 1) {

				segCounter = 0;

				if (!xFoundInSeg) {
					System.err.println("NO");
					xFoundInAllSeg = false;
					break;
				}

				xFoundInSeg = false;

			}

			segCounter++;

		}

		if (xFoundInAllSeg) {
			System.err.println("YES");
		}

	}

}
