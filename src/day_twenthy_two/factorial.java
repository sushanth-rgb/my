package day_twenthy_two;

public class factorial {
	static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int z=fact(5);
	System.out.println(z);
	}

}
