package com.jj.Array.LeedCode;

import java.util.Arrays;

public class TwoSum_1 {

	public static void main(String[] args) {
		
		int [] nums= {2,4,11,3};
		int result[]=twoSum(nums,5);
		for(int i=0;i<result.length;i++) {
			System.out.print(""+result[i]+",");
		}

	}

	/*public static int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {

				if (i != j && nums[i] + nums[j] == target) {
					result[0] = j;
					result[1] = i;
					break;
				}
			}
		}
		return result;*/
	
	//Two Pointer
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int low=0;
		int high=nums.length-1;
		Arrays.sort(nums);
		
		while(nums[low]<nums[high]){
			int currentSum=nums[low]+nums[high];
			if(currentSum==target) {
				result[0]=nums[low];
				result[1]=nums[high];
				return result;
			}else if(currentSum>target) {
				high--;
			}else {
				low++;
			}
			
		}
		return result;
		
		
	}
}
