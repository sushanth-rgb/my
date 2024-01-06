package sixteen_day;

public class pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			int start=1;
			if(i%2==0) {
				start=1;
						
			}
			else {
				start=0;
			}
			for(int j=0;j<=i;j++) {
				System.out.print(start);
				start=1-start;
			}
			System.out.println(" ");
		}
		//System.out.println(0%2);
	}

}
