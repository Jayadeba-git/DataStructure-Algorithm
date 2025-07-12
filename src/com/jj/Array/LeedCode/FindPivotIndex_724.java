package com.jj.Array.LeedCode;


public class FindPivotIndex_724 {

	public static void main(String[] args) {
		
	int[] nums=	{1,2,3};
//	int[] nums=	{1,7,3,6,5,6};
//	int[] nums=	{2,1,-1};
    System.out.println(pivotIndex(nums));
	}

	 public static int pivotIndex(int[] nums) {
		 int[] lsum = new int[nums.length];
		 int[] rsum = new int[nums.length];
		 
		 for(int i=1;i<nums.length;i++) 
			 lsum[i]=lsum[i-1]+nums[i-1];
		
		 for(int j=nums.length-2;j>=0;j--) 
			 rsum[j]=rsum[j+1]+nums[j+1];
		
		 for(int k=0;k<nums.length;k++) {
			 if(lsum[k]==rsum[k])
				 return k;
		 }
		return -1;
	 }
}
