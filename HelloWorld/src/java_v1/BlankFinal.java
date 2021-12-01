package java_v1;

public class BlankFinal {
	
public static void main(String[] args)
{
	//Bank a;
	Bank a=new Bank1();// from the ref of base class we are deriving obj for a sub class 
	System.out.println("interest of bank1 is "+a.interest());
	a = new Bank2();
	System.out.println("interest rate od bank2 is "+a.interest());
	a.interest(); // it method from a Bank class 
}
		

	

}
