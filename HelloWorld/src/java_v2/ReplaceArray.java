package java_v2;


import java.util.Scanner;

public class ReplaceArray {

	public static void main(String[] args)
	{
		int a[]= {2,3,4,5,6,7};
		System.out.println("before updated");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("please enter the value");
		Scanner obj=new Scanner(System.in);
		int muthu=obj.nextInt();
		
		System.out.println("after updated");
		a[0]=muthu;
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}

}
