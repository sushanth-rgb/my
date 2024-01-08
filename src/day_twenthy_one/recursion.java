package day_twenthy_one;

public class recursion {
	static void  gun(int i,int j) {
		if(i<j)
		return;
		System.out.println("hello");
		gun(i,j+1);
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gun(7,1);
	}

}
