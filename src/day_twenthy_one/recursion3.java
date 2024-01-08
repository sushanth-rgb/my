package day_twenthy_one;

public class recursion3 {
static  void fun(int i,int j) {
	if(i<1) return;
	System.out.print(i+" ");
	fun(i-1,j);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(3,4);
  
	}

}
