package java_v1;

public class Constructor
{
 
	int id;
	String name;
 
 public void display()
 {
	 System.out.println(id+" "+name);
 }
	

	public static void main(String[] args) 
	{
		Constructor obj = new Constructor();//constructor invoked during initializing th eobject
	
		obj.display();
		//System.out.println("its "+obj.name);
	
		

	}

}
