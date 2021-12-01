package java_v1;

import java.util.*;

public class Methodoverriding1 extends Methodoverriding
{
	 int sum()//method override the parent class it provide the implementation 
	{
		return 6;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Methodoverriding obj=new Methodoverriding();
		System.out.println(obj.sum());
		String actual="muthuselvan B.E";
		String name="muthu";
		System.out.println(name);
		
		name=name+"selvan";
		System.out.println(name);
		name.concat("selvan1");
		System.out.println(name.concat("selvan1")+" it is");
		
		name=name+" B.E";
		System.out.println(name);
		
		System.out.println(name==actual);
		System.out.println(name.equals(actual));
		System.out.println(name.compareTo(actual));
		
		StringBuffer sb=new StringBuffer("Muthu");
		
		System.out.println(sb);
		sb.append(" selvan");
		System.out.println(sb);
		System.out.println(sb.replace(0, 1, "R"));
		System.out.println(sb.reverse());
		
		
	//	ArrayList<String>al=new ArrayList<String>();
		
		
		
		
		
	}

}
