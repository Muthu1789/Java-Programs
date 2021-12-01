package java_v1;

public class A {
	
	A()
	{
		System.out.println("win");
	}
	public final void sun()
	{
		
		System.out.println("Hai wel come to the developer ");
	}
	public void sun(int a, int b)
	{
		System.out.println("hello this is sum method");
	}
	public static void main(String [] args)
	{
		//new A();
	
		A obj=new A();
		System.out.println("this is sun");
		obj.sun();
		System.out.println("this is sun with parameter");
		obj.sun(5,6);
		
	}
	

}
