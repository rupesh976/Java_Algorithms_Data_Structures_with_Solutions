package com.testskills.hackerearthsolutions.arrays;
/*
https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/beautiful-journey-1/
*/

import java.util.*;

public class BeautifulJourney {
	public static void main(String args[]) throws Exception {

		// Write your code here
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		long temp = 0;
		long res = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = temp + arr[i];
			res = Math.max(temp * (sum - temp), res);

		}
		System.out.println(res);

	}
}
