package com.testskills.binarytree;

public class BinarySearchTreeTest {
	public static boolean binarySearch(int target, int[] numbersArray) {
		int l = 0;
		int hi = numbersArray.length - 1;
		int mid = 0;
		while (l <= hi) {
			mid = l + (hi - l) / 2;
			if (numbersArray[mid] == target) {
				return true;
			} else if (numbersArray[mid] < target) {
				l = mid + 1;
			} else if (numbersArray[mid] > target) {
				hi = mid - 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] numbersArray = { 11, 23, 40, 60 };
		if (BinarySearchTreeTest.binarySearch(40, numbersArray)) {
			System.out.println("Given Number Available!");
		} else {
			System.out.println("Given Number not Available!");
		}
	}
}