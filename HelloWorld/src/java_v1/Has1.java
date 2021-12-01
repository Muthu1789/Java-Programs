package java_v1;

public class Has1 
{
	Has obj;
	
	double pi=3.14;
	
	double square(int b)
	{
		
		obj=new Has();
		int c=obj.sum(b);
		return pi*c;
	}
	public static void main(String[] args)
	{
		Has1 obj1=new Has1();
		obj1.square(8);
		System.out.println(obj1.square(8));
	}

}
