package com.jj.Array.LeedCode;

import java.util.Arrays;
import java.util.Collections;

public class MissingNumber_268 {

	public static void main(String[] args) {

//		int [] arr= {9,6,4,2,3,5,7,0,1};
		int [] arr=  {0,1};
//		int [] arr ={3,0,1};
	//	Arrays.sort(arr);
		
		
		int num=missingNumberByXorr(arr);
		System.out.println(num);
	}

	

	public static int  missingNumber(int[] nums) { 
		for (int i = 0; i <= nums.length-1; i++) {
			if(i==nums[i]) {
				continue;
			}else {
				return i;
			}
		}
		return nums.length;

	}
	
	public static int missingNumberByXorr(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			result ^= nums[i];
		}
		for(int i = 0; i <= nums.length; i++) {
			result ^= i;
		}
		return result;
	}

}
