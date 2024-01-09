package today;

public class static_var {
	 static int pass1=100;
	int pass2=34;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		static_var v1=new static_var();
		static_var v2=new static_var();
		static_var v3=new  static_var();
		
//		v1.pass2=55;
//		v2.pass2=66;
//		pass1=90; 
		v2.pass1=89; 
		
//		System.out.println(v1.pass2);
//		System.out.println(v2.pass1);
		System.out.println(pass1);
		System.out.println(v3.pass1);
		System.out.println(v3.pass2);
		

	}

}
//
