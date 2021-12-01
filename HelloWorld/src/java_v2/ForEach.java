package java_v2;

public class ForEach {

	 static void min(int arr[])
	{
		int min=arr[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			System.out.print(min);
		}
		System.out.print(arr.length);
	}
	public static void main(String[] args) 
	{


		int a[]= {1,2,3,4,0};
		
		min(a);
	}

}
