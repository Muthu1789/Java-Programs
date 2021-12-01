package java_v1;

public class Staticblock
{

	
 static
	{
		System.out.println("hai1");
	}
 public void arr()
 {
	 System.out.println("Hello world");
	 
 }
 
 public void m()
 {
	 System.out.println("hai hello ");
	 this.arr();
 }
 
 public static void main(String[] args)
 {
	 
	 Staticblock obj=new Staticblock();
	 obj.m();
	 System.out.println("hai");
 }
}
