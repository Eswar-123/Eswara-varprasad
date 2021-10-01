package AWS;

import java.util.Arrays;

public class SubSequence {

	public static void main(String[] args) {
	int arr[]= {1,2,3,7,8,9,10};
	Arrays.sort(arr);
    System.out.println("The Sorted Array: ");
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]+" ");
    }
    int length=arr.length/2;
    System.out.println("\n The SubSequence: ");
    for(int i=length;i<arr.length;i++) {
    	System.out.println(arr[i]+" ");
    }
	}

}
