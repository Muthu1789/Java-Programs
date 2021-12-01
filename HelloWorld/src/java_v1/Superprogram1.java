package java_v1;

public class Superprogram1 extends Superprogram
{
	String color="White";
	
	Superprogram1()
	{
		super();//if this doesnt given then it provided by the compiler implicitly
		System.out.println(super.color);
		System.out.println(color);
		//super();
		System.out.println("child class called");
	}
	

}
