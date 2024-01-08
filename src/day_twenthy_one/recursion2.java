package day_twenthy_one;

public class recursion2 {
	static void  gun(int j) {
		if(j<1)
		return;
		System.out.print(j+" ");
		gun(j-1);
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gun(10);
	}

}