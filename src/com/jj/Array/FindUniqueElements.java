package com.jj.Array;

public class FindUniqueElements {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 2, 3, 1, 2, 4 };
		int size = 7;

		int uniqueelement = findUnique(arr, size);
		System.out.println("Unique Elements::" + uniqueelement);

	}

	private static int findUnique(int[] arr, int size) {
		int result = 0;

		for (int i = 0; i < size; i++) {
			result = result ^ arr[i];
		}

		return result;
	}

}
