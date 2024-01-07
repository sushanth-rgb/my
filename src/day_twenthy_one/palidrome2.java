package day_twenthy_one;

public class palidrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int c=n;
		int count =0;
		int rev_se_no=0;
		while(n>0) {
			int p=n%10;
			count++;
			n=n/10;
//			System.out.println(p);
//			System.out.println(n);
//			System.out.println();
			rev_se_no=(rev_se_no*10)+p;
			
		}
		System.out.println(count);
		System.out.println(rev_se_no);
 
		if(rev_se_no==c) {
			System.out.println("it is palidrome");
		}
		else {
			System.out.println("sorry");
		}
		
	}
		
}