package subprograms;

public class Factors {
		public static void main(String[] args) {
		int number = 250;
		System.out.print("factors of 250: ");
		for(int i=1;i<=number;i++) {
			if(number %i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
