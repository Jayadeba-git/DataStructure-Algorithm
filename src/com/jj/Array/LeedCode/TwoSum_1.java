package com.jj.Array.LeedCode;

public class TwoSum_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums= {2,4,11,3};
		int result[]=twoSum(nums,6);
		for(int i=0;i<result.length;i++) {
			System.out.print(""+result[i]+",");
		}

	}

	public static int[] twoSum(int[] nums, int target) {
		
		int [] result=new int[2];
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums.length;j++) {
				
				if(i!=j && nums[i]+nums[j]==target) {
					result[0]=j;
					result[1]=i;
					break;
				}
			}
		}
		return result;
	}
}
