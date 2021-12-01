package java_v1;

public class Staticvariable
{

	int id;
	String name;
	static String college ="maharaja";
	
	Staticvariable(int a,String b)
	{
		id=a;
		name =b;
	}
	
	public void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	
	
	public static void main(String[] args) 
	{
		Staticvariable obj=new Staticvariable(01,"Muthu");
		Staticvariable obj1=new Staticvariable(02,"Ranjith");
		
		obj.display();
		obj1.display();

	}

}
