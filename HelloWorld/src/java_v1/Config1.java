package java_v1;

public class Config1 implements Config
{

	public void type()
	{
		System.out.println("typing");
	}
	public void write()
	{
		System.out.println("write");
	}
	public static void main(String[] args) {
		
		Config obj=new Config1();
		obj.write();
		obj.type();
		
		// TODO Auto-generated method stub

	}

}
