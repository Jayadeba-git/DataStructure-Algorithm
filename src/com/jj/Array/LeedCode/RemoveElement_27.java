package com.jj.Array.LeedCode;

public class RemoveElement_27 {

	public static void main(String[] args) {
		int [] nums= {0,1,2,2,3,0,4,2};
		int [] result=removeElement(nums,2);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+",");
		}
	}

	public static int[] removeElement(int[] nums, int val) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]!=val)){
                nums[k] = nums[i];
                 k++;
            }
        }
        return nums;
    }
}
