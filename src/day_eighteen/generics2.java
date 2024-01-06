package day_eighteen;

public class generics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generics1<Integer>g1=new generics1<>(30);
		g1.print();
		generics1<String>g2=new generics1<>("susya");
		g2.print();
		generics1<Float>g3=new generics1<>(3.7F);
		g3.print();
	//	ArrayList<Cat>cats=new ArrayList<>();
		

	}

}
