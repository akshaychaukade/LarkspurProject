package com.akshay;

public class ArraySort {

	public static void main(String[] args) {
		int a[] = { 5, 5, 8, 9, 6 };
		int temp[] = new int[4];
		for (int i = 0; i < a.length; i++) {
			for (int k = i + 1; k < a.length; k++) {
				if (a[i]>=a[k]) {
					temp[i]=a[i];
					a[i]=a[k];
					
					
				} 
			}
		}
	}

}
