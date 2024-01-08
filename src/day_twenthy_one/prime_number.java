package day_twenthy_one;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int j=scn.nextInt();
		int count=0;
		for(int i=1;i*i<j;i++) {
			if(j%i==0) {
				count++;
				if((j/i)!=i) {
					count++;
					
				}
				
			}
		}
		if(count==2) {
			System.out.println("the number is prime number");
		}
		else{
			System.out.println("no it is not a prime number");
		}

	}

}
