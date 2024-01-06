package day_twenthy;

public class overiding2 extends Overiding1
{
	
	void marriage() {
		System.out.println("marry katrina");
	}
	public static void main(String[]agrs) {
		overiding2 o=new overiding2();
		o.marriage();
		o.property();
		Overiding1 o1=new overiding2();
		o1.marriage();
		//overiding2 o2=new Overiding1();

		
		
	}
}
