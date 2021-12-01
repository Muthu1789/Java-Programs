package java_v2;

public class CopyArray {

	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
		System.out.println("a.length "+a.length);
		
		
		for(int j=0;j<a.length;j++)
		{
			b[j]=a[j];
		}
		
		for(int k=0;k<a.length;k++)
		{
			System.out.print(b[k]+" ");
		}
		System.out.println();

	}

}
