package java_v1;

public class Static 
{
	static String name="Kongu";
	public static void add()
	{
		int a=10;
		int b=5;
		int c=a*b;
		
		
		name ="kongu college1";
		
		System.out.println(name);
		System.out.println(c);
	}
	public static void Height(int h)
	{
		float height=h/30;
		
		System.out.println("height in feet is "+height);
	}

	
	public static void main(String[] args)
	{
		Static.add();
		Static.Height(170);
	}
}
