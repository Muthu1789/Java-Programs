package java_v1;

public class SetandGet 
{

	private String name;
	private int age;
	private int salary;
	private String company;
	private int exp;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	
	public void setSalary(int salary)
	{
		if(salary <10000)
		{
			this.salary=salary;
		}
		else
		{
			this.salary=0;
		}
		
		
	}
	public int getSalary()
	{
		return salary;
	}
	public void setCompany(String company)
	{
		this.company=company;
	}
	public String getCompany()
	{
		return company;
	}
	public void setExp(int exp)
	{
		this.exp=exp;
	}
	public int getExp()
	{
		return exp;
	}
	
	
	
	
}
