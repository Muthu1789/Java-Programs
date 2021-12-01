package java_v1;

public class TestThis5
{
int a;
int b;

TestThis5(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
void display()
{
	System.out.println("a value is "+a+" b value is "+b);
}
void sum()
{
	this.display();
	System.out.println("here comes this invoke the current class method");
}
	public static void main(String[] args)
	{
		This obj=new This(); 
		TestThis5 obj1=new TestThis5(4,5);
		obj1.sum();
		//this.display();
	}

}
