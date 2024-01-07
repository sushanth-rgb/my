package day_twenthy_one;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7789;
		int c=n;
		int cube=0;
		while(n>0) {
			int z=n%10;
			n=n/10;
			cube+=z*z*z;
			
			
		}
		if(cube==c) {
			System.out.println("it is armstrong number");
		}
		else {
			System.out.println("sorry");
		}

	}

}
