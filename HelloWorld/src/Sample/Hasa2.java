package Sample;

import Sample.Hasa2;

public class Hasa2 
	{
		Hasa obj;
		
		double pi=3.14;
		
		double square(int b)
		{
			
			obj=new Hasa();
			int c=obj.area(b);
			return pi*c;
		}
		public static void main(String[] args)
		{
			Has1 obj1=new Has1();
			obj1.square(8);
			System.out.println(obj1.square(8));
		}

	}
