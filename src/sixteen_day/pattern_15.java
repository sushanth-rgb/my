package sixteen_day;

public class pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int space=2*(4-1);
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			//space
			for(int k=1;k<=space;k++) {
				System.out.print(" ");
				
			}
			
			
			
			//right side
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println(" ");
			space-=2;
		}
	}

}
