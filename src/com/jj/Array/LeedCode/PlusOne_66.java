package com.jj.Array.LeedCode;

public class PlusOne_66 {

	public static void main(String[] args) {
		
		int[] digits= {9,9};
		int[] resultArray=plusOne(digits);
		for(int i=0;i<resultArray.length;i++) {
			System.out.print(resultArray[i]+",");
		}

	}

	

	public static int[] plusOne(int[] digits) {
		
		for(int i=digits.length-1;i>=0;i--) {
			
			if(digits[i]!=9) {
				digits[i]=digits[i]+1;
				break;
			}else {
				digits[i]=0;
			}
		}
		
		if(digits[0]==0) {
			digits=new int[digits.length+1];
			digits[0]=1;
		}
		return digits;
		
		
	}
}
