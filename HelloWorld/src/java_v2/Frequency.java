package java_v2;

public class Frequency {

	public static void main(String[] args)
	{
	int a[]= {1,1,2,2,3,4,5,4,5};
	int b[]=new int[a.length];
	int visited=-1;
	
	
	for(int i=0;i<a.length;i++)
	{
		int count =1;
		
		for (int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
				b[j]=visited;
			}
		}
		if(b[i]!= visited)
		{
			b[i]=count;
		}
	}
	System.out.println();
	System.out.println("elements");
	
	for(int m=0;m<b.length;m++)
	{
		if(b[m]!=visited)
		{
			System.out.println(a[m]+" "+b[m]);
		}
	}
	
	
	}

}
