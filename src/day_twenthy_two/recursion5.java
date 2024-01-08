package day_twenthy_two;

public class recursion5 {
static void add(int i,int n) {
	if(i<1) {
		System.out.println(n);
		return;
	}
	add(i-1,n+i);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(45,0);

	}

}
