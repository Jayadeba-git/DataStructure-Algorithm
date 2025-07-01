package com.jj.Array.LeedCode;

public class RemoveDuplicateFromSortedArray_26 {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		System.out.println("Before remove::");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println();
		int[] rA=removeDuplicates(arr);
		System.out.println("After remove::");
		for (int i = 0; i < rA.length; i++) {
			System.out.print(rA[i] + ",");
		}
	}

/*	public static int removeDuplicates(int[] nums) {
		int k, i = 1;
		for (k = 1; k < nums.length; k++) {
			if (nums[k - 1] != nums[k]) {
				nums[i] = nums[k];
				i++;
			}
		}
		return i;
	}*/
	
	public static int[] removeDuplicates(int[] nums) {
		int k, i = 1;
		int resultArray[]=new int[nums.length];
		resultArray[0]=nums[0];
		for (k = 1; k < nums.length; k++) {
			if (nums[k - 1] != nums[k]) {
				//nums[i] = nums[k];
				//i++;
				resultArray[i]=nums[k];
				i++;
			}
		}
		return resultArray;
	}
	
	
}
