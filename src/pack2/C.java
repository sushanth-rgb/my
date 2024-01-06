package pack2;

import pack1.*;

public class C {
	
	public void m2() {
		System.out.println("m2() in class C");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a g=new a();
		System.out.println(g.s);
		g.m1();
}
}
