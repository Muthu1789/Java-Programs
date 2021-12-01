package java_v1;

public class Printable1 implements Printable 
{
	public void run()
	{
		System.out.println("running");
	}
	public static void main(String[] args) 
	{
	Printable obj=new Printable1();//upcasting
	obj.run();
	}

}
