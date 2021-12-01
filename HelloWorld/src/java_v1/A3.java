package java_v1;

public class A3 implements A2 
{
	public void print()
	{
		System.out.println("runnning");
	}
	public void print1()
	{
		System.out.println("runnning1");
	}
	public static void main(String[] args) 
	{

		A3 obj=new A3();
		obj.print();
		obj.print1();
		
	}

}
