package java_v1;

public class Overload
{
	static void sum(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	static void sum(int a, int b,int c)
	{
		System.out.println(a+b-c);
	}
	
	public static void main(String [] args)
	{
		Overload.sum(5, 6);
		Overload.sum(10, 15, 25);
	}
}
