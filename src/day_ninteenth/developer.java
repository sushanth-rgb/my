package day_ninteenth;
import java.util.*;
public class developer {
	int maths;
	int english;
	int geography;
	int history;
	int marathi;
	double c;
	
	double percentage() {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the marks for maths");
		maths=scn.nextInt();
		System.out.println("");
		System.out.println("Enter the marks for english");
		english=scn.nextInt();
		System.out.println("");
		System.out.println("Enter the marks for geography");
		geography=scn.nextInt();
		System.out.println("");
		System.out.println("Enter the marks for history");
		history=scn.nextInt();
		System.out.println("");
		System.out.println("Enter the marks for marathi");
		marathi=scn.nextInt();
		System.out.println("");
		double c=maths+english+geography+history+marathi;
		System.out.println("");
		return (c/600)*100;
		
	}

	public static void main(String[] args) {
		Scanner scn1=new Scanner(System.in);
		
		
		String name;
		
		System.out.print("Enter your name:");
		name=scn1.nextLine();
		System.out.println(" ");
		System.out.println("hello "+name+" hearty welcome");
		System.out.println(" ");
		developer s1=new developer();
		
		
		
		
		double x=s1.percentage();
		System.out.println(x);
		if(x>=90) {
			System.out.println("congarts you got A");
		}
		else if(x<=65) {
			System.out.println("congarts you got B");
		}
		else if(x<=35) {
			System.out.println("sorry you failed");
		}
	}

}
