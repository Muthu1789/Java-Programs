package java_v1;

public class Typepromotion 
{

	public float sum(float a,float b)
	{
		return a+b;
	}
	public int sum(int a, int b)
	{
		return a+b+1;
	}
	public static void main(String[] args) 
	{
		
		Typepromotion obj = new Typepromotion();
		System.out.println(obj.sum(20, 20));
	}

}
