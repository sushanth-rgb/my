package day_twenthy;

public class digit_extraction {
//digit extraction
	public static void main(String[] args) {
		int count=0;
		int n=3345;
		while(n>0) {
			int last=n%10;
			count++;
			n=n/10;
			System.out.println(last);
			System.out.println(count);
			System.out.println();
		}
	}
	//hello
}
