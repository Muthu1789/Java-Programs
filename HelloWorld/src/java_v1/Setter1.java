package java_v1;

public class Setter1 {

	public static void main(String [] args)
	{
		Setter b=new Setter();
		b.setA(10);
		System.out.println(b.getA());
		System.out.println(b.getName());
		b.setName("Muthu");
		System.out.println(b.getName());
	}

}
