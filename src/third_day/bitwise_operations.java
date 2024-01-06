package third_day;

public class bitwise_operations {
public static void main(String[] args) {
	int x=00001010;
	int y=00000110;
	System.out.println(x&y);
	System.out.println(x|y);
	System.out.println(x^y);
	int a=0b1010,b=0b0110,z;
	z=a&b;
	z=a|b;
		int c=0b0111;
		int q=a&c;
		int f=0b1111;
		int m=f<<1;
		int m1=f>>1;
		int g=-0b1010;
		int m2=g>>>1;
		int r=25>>2;//right shift by two bits
		
	System.out.println(f);
	System.out.println(m);
	System.out.println(r);
}
}
