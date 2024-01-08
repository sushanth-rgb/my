package day_twenthy_one;

public class bactracking {
// static void backtracking1(int i,int j) {
//	 if(i<1) return;
//	 backtracking1(i-1,j);
//	 System.out.print(i+" ");
// }
 static void backtracing2(int i,int n) {
	 if(i>n) return;
	 backtracing2(i+1,n);
	 System.out.print(i+" ");
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //backtracking
		//backtracking1(10,11);
		backtracing2(1,3);
	}

}

