package tenth_day;


public class pattern_10_ {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<(2*4-(2*i+1));j++) {
				System.out.print("* ");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}

	}

}
