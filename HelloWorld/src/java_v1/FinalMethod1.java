package java_v1;

public final class FinalMethod1 extends FinalMethod
{
	void sum()//this is the error we cant override final nethod
	{
		System.out.println("child class");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FinalMethod1 obj=new FinalMethod1();
		obj.sum();
	}
	

}
