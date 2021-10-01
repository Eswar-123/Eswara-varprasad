package com.peopletech.array;

public class KthLargesmall {
	
		public static void main(String[] args) {
			
		int a[]={5,8,12,7,6,100,2,4};
     	int temp;
		for(int i=0;i<a.length;i++){
		for(int j=i;j<a.length;j++){
		if(a[i]>a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		
		}
		
		}
		System.out.println(" kth[3rd]Smallest element: "+a[2]);
		int lar=a.length-3;
		System.out.println("kth[3rd]Largest element: "+a[lar]);
		}
		}


