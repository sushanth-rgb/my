package day_twenthyfour;
import java.util.*;
import java.util.Arrays;

public class recursion_reverse {
//	static int[] arr;
//	static void create(int n) {
//		Scanner scn=new Scanner(System.in);
//		for(int i=0;i<n;i++) {
//		arr[i]=	scn.nextInt();
//		}
//	}
 static void swap(int []arr,int a,int b) {
	 
	 if(a>=b) return;
	 else {
		 int temp=arr[b];
		 arr[b]=arr[a];
		 arr[a]=temp;
		 
		 
	 } 
	 swap(arr,a+1,b-1);
	
}

public static void main(String[] argfs) {
    int arr[]= {1,2,3,4,5};
	swap(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		}
	
	
}
}