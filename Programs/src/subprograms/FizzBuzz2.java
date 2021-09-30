package subprograms;

import java.util.Scanner;

public class FizzBuzz2 {
	public static String mul(int a){
		
		if(a% 3 == 0 && a%5 == 0) {
			return "FizzBuzz";
		}
		else if (a % 3 == 0) {
			return "Fizz";
		}
		else if (a % 5 == 0) {
			return "Buzz";
		}
		else {
			String s = Integer.toString(a);
			return s;
		}
	}
public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		
		System.out.println(mul(n));
	}
}





	
