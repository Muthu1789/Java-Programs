package java_v1;

public class Inter2 extends Inter1{
	
	public void run1()
	{
		System.out.println("run1 is calling");
	}

	public void run2()
	{
		System.out.println("run2 is calling");
	}
	public void run3()
	{
		System.out.println("run3 is calling");
	}
	public static void main(String[] args) {
		Inter obj=new Inter2();
		obj.run();
		obj.run1();
		obj.run2();
		obj.run3();
	}

}
