package java_v1;

public class Encap1 
{

	
	
	public static void main(String[] args) 
	{


		int a=10;
		
		try
		{
			int b=10/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
			int c=10/0;
		}
		finally
		{
			System.out.println("its execute");
		}
		
		

	}

}
