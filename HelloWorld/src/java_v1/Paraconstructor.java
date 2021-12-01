package java_v1;

public class Paraconstructor
{

	int id;
	String name;
	int salary;
	
	Paraconstructor(int a,String b)
	{
		id=a;
		name =b;
		
	}
	
	Paraconstructor(int a,String b,int s)
	{
		id=a;
		name =b;
		salary=s;
		
		
	}

	public void display()
	{
		System.out.println(id+" "+name);
	}

	public void display1()
	{
		System.out.println(id+" "+name+" "+salary);
	}

	public static void main(String[] args) 
	{
		
		Paraconstructor obj = new Paraconstructor(720,"Muthu");
	
		Paraconstructor obj1 = new Paraconstructor(83,"Appa",53000);
		
		
		obj.display();
		obj1.display1();
	
	
	
	}

}
