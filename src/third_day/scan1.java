package third_day;

import java.util.*;

public class scan1 {
	public static  int dp_no,Salary;
	public static String Name,dp_name;
	static void input(){
		

	Scanner scn=new Scanner(System.in);
	System.out.println("enter Name:");
	Name=scn.nextLine();
	System.out.println("enter dp_no:");
	 dp_no=scn.nextInt();
	 	System.out.println("enter the salary:");
	Salary=scn.nextInt();
	 System.out.println("enter Department Name:");
	 dp_name=scn.next();	
		
	}
	static void output() {
		System.out.println("dp_no  Name        Salary     dp_name");
		System.out.println("-----------------------------");
		System.out.print(dp_no+"   "+Name+"       "+Salary+"   "+dp_name);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		input();
	
		output();
	}

}