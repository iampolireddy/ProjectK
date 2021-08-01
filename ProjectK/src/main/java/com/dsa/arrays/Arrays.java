package com.dsa.arrays;

public class Arrays {

	public static void main(String[] args) {

		int[] a1 = new int[2];
		a1[0] = 7;
		a1[1] = 8;

		for (int i = 0; i < a1.length; i++) {

			System.err.println(a1[i]);
		}

		int[][] a2 = new int[2][4];

		a2[0][0] = 7;
		a2[0][1] = 6;

		for (int i = 0; i < a2.length; i++) {

			for (int j = 0; j < 4; j++) {
				System.err.println(i + ":" + j + "==" + a2[i][j]);
			}

		}

	}

}
