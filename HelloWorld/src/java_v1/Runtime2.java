package java_v1;

public class Runtime2 extends Runtime1 
{

	void eatq()
	{
		System.out.println("Last child class");
	}
	static void method(Runtime c)
	{
		if(c instanceof Runtime)
		{
		Runtime2 obj=(Runtime2)c;//downcasting
		System.out.println(obj.a);
		obj.eatq();
		}
	}
	public static void main(String[] args) 
	{
		Runtime a,b;
		
		a=new Runtime();//upcasting
		a.eat();
		b=new Runtime1();
		b.eat();
		Runtime c=new Runtime2();
		Runtime2.method(c);
		
		
		//c=new Runtime2();
		
		//System.out.println(obj instanceof Runtime);//instanceof variable
	}

}
