package subprograms;

public class Series {

	public static void main(String[] args) {
		int a=1;
		int count=0;
		for(int i=1;i<=7;i++) {
			System.out.print(a+" ");
			if(i%2!=0)
				count+=8;
			int series=a+count;
			a=series;
		}
		}
		}
