package java_v1;

public class SetandGet1 {

	public static void main(String[] args) 
	{
	
		SetandGet obj=new SetandGet();
		obj.setName("Muthuselvan");
		obj.setAge(25);
		obj.sSalary(12000);
		obj.setCompany("Hfg entertainments");
		
		System.out.println(obj.getName()+" "+ obj.getAge()+" "+ obj.gSalary()+" "+obj.getCompany());
	}

}
