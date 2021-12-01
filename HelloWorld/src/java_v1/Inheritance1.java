package java_v1;

public class Inheritance1 
{
	Inheritance obj;
	String name="Muthu";
	String company="HFG";
	
	void sun()
	{
		obj =new Inheritance();
		
	//	System.out.println(obj.name);
	//	System.out.println(obj.company);
		System.out.println(obj.exp);
		System.out.println(obj.salary);
	}
	public static void main(String[] args) 
	{
	
		
		
		Inheritance1 obj1 =new Inheritance1();
		obj1.sun();
		
		//System.out.println(obj.name);
		//System.out.println(obj.company);
		//System.out.println(obj.exp);
		//System.out.println(obj.salary);


	}

}
