package day_twenthy_one;
import java.lang.Math;
public class divisor_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=36;
		for(int i=1;i<=Math.sqrt(j);i++) {
			if(j%i==0) {
				System.out.print(i+" ");
			}
			if((j/i)!=i) {
				System.out.print(j/i+" ");
			}
		}

	}

}
