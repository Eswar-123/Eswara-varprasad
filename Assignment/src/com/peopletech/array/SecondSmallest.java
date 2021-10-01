package com.peopletech.array;

public class SecondSmallest {
      public static int getSecondSmallest(int arr[]) {
    	  int smallest = Integer.MAX_VALUE;
    	  int secondSmallest= Integer.MAX_VALUE;
    	  for(int i=0;i<arr.length;i++) {
    		  if(arr[i]<smallest) {
    			  smallest=arr[i];
    			 }
    		  if(arr[i]>smallest&&arr[i]<secondSmallest) {
    			  secondSmallest=arr[i];
    		  }
      }
    	  return secondSmallest;
      }
	public static void main(String[] args) {
		
		int arr[]= {50,90,2,32,65,3,100};
		int result=getSecondSmallest(arr);
		System.out.println(" Second Smallest Number: " +result);

	}

}
