package com.jj.Array;

public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = { 10, 23, 45, 76, 54, 34, 32, 64, 54 };
		int target = 10;
		boolean found = search(arr, arr.length, target);
		System.out.println(found);
	}

	private static boolean search(int[] arr, int length, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return true;
			}
		}
		return false;
	}
}
