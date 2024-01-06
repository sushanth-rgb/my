package seventh_day;

public class pattern_7 {
	public static void main(String[]args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i-1;j++) {
				System.out.print("");
			}
			
			for(int j=0;j<5-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<5-i-1;j++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		
	}

}


//package seventh_day;
//
//public class Pattern7 {
//    public static void main(String[] args) {
//        int rows = 5;
//
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = 0; j < 2 * i + 1; j++) {
//                System.out.print("*");
//            }
//
//            for (int j = 0; j < rows - i - 1; j++) {
//                System.out.print(" ");
//            }
//
//            System.out.println();
//        }
//    }
//}
