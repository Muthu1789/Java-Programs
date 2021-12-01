package java_v1;

public class FinalVar
{

	final int a=10;//this is final var we cant chnage it
	//int a=10;
	void run()
	{
		a=11;
	}
	public static void main(String[] args) 
	{
		FinalVar obj=new FinalVar();
		obj.run();
		System.out.println(obj.a);
		
	}

}
