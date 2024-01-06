package fifteen_day;

public class pattern_13 {
public static void main(String[]args) {
	int n=5;
	for(int i=0;i<=2*n-1;i++) {
		int stars=2*n-i;
		if(i<=n) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		}
			if(i>n) {
				for(int k=1;k<=stars;k++) {
					System.out.print("*");
				}
			}
			
		
		System.out.println(" ");
		
	}
	
	
	
}
}
