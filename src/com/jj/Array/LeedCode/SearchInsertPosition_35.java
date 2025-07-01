package com.jj.Array.LeedCode;

public class SearchInsertPosition_35 {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 6 };
		System.out.println(searchInsert(arr, 10));
	}

	public static int searchInsert(int[] nums, int target) {

		int high = nums.length - 1;
		int low = 0;
		int mid;

		while (high >= low) {
			mid = low + (high - low) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}
		return low;
	}

}
