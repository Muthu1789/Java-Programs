package java_v1;

public class Methodoverloading 
{

	static int add(int a,int b)//methodoverloading 
	
	{
		return a+b;
		
	}
	static double add(int a, double b, double c)//method overloading
	{
		return a+b+c;//changing the number of argumet and as well as datat type
	}
	static float add(float a,float b)
	{
		return a+b;
	}
	public static void main(String [] args)
	{
		System.out.println(Methodoverloading.add(5, 60));
		System.out.println(Methodoverloading.add(10, 10.5, 10.7 ));
		Methodoverloading obj=new Methodoverloading();
		
		System.out.println( Methodoverloading.add(4.5f,5.5f));
	}
}
