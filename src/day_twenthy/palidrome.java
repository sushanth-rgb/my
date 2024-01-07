package day_twenthy;

public class palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8897;
		int count =0;
		int rev_se_no=0;
		while(n>0) {
			int p=n%10;
			count++;
			n=n/10;
			System.out.println(p);
			System.out.println(n);
			System.out.println();
			rev_se_no=(rev_se_no*10)+p;
			
		}
		System.out.println(count);
		System.out.println(rev_se_no);

	}
//	while(n>0) {
//		int last=n%10;
//		count++;
//		n=n/10;
//		System.out.println(last);
//		System.out.println(count);
//		System.out.println();
//	}


}

