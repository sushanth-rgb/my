package day_ninteenth;

import java.util.Scanner;

public class newtry {
	int maths;
	int english;
	int geography;
	int history;
	int marathi;
	double c;
	double d;
	
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
		d=(c/600)*100;
		return d;
		
		
		
	}
	void statement() {
		System.out.println(" ");
		if(d==100) {
			System.out.println("excellent");
		}
		else if(d<=75) {
			System.out.println("good");
		}
		else if(d<=35) {
			System.out.println(" failed");
		}
	}

	public static void main(String[] args) {
		Scanner scn1=new Scanner(System.in);
		
		
		String name;
		
		System.out.print("Enter your name:");
		name=scn1.nextLine();
		System.out.println(" ");
		System.out.println("hello "+name+" hearty welcome");
		System.out.println(" ");
		newtry s1=new newtry();
		double x=s1.percentage();
		System.out.println(x);
		s1.statement();
	

	}

}
