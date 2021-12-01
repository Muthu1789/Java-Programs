package java_v2;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,6,8,10,12,14,16,18};
		System.out.println(a.length);
		
		int min=0;
		
		for(int i=0;i<a.length;i++)
		{
			min=min+a[i];
		}
		
		
		System.out.println(min);
	}

}
