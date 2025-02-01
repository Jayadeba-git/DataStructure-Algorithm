package com.jj.Demo;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random ran= new Random();
		int[] a=new int[10];
		
		for(int i=0;i<10;i++) {
			a[i]=ran.nextInt(100);
		}

		System.out.println("Before Sorting ::"+Arrays.toString(a));
		BubbleSort.bubblesortAsc(a);
//		BubbleSort.bubblesortDesc(a);
		System.out.println("After Sorting ::"+Arrays.toString(a));
	}

	private static void bubblesortDesc(int[] a) {


		int i,j,temp;
		
		for(i=0;i<a.length-1;i++) {
			for(j=0;j<a.length-i-1;j++) {
				if(a[j]<a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
				
			}
			
			
		}
	
	}

	private static void bubblesortAsc(int[] a) {

		int i,j,temp;
		
		for(i=0;i<a.length-1;i++) {
			for(j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				
				
			}
			
			
		}
	}

}
