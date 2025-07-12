package com.jj.Array.LeedCode;

import java.util.Arrays;

public class LongestCommonPrefix_14 {

	public static void main(String[] args) {

		String [] str= {"flower","flow","flight"};
		String result=longestCommonPrefix(str);
		System.out.println(result);
		
	}
private static String longestCommonPrefix(String[] strs) {

	
	StringBuilder sb=new StringBuilder();
	
	Arrays.sort(strs);
	char[] start=strs[0].toCharArray();
	char[] end=strs[strs.length-1].toCharArray();
	
	for(int i=0;i<start.length;i++) {
		if(start[i]!=end[i])
		break;
		else
			sb.append(start[i]);
	}
	return sb.toString();
        
}
	}

