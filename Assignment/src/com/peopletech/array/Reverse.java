package com.peopletech.array;

public class Reverse {
	public static void main(String[] args) {
	int arr[] = new int[] {12,36,5,55,16,40,56};
	int temp=0;
	System.out.println("Original Array: ");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	System.out.println("\n after sorting: ");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
}

	