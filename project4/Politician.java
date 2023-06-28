package project4;

public class Politician extends Person
{
	public int sal;
	public int years;
	public Politician(String name,int age,int sal,int years)
	{
		super(name,age);
		this.sal=sal;
		this.years=years;
	}
	public int displaysal()
	{
		return sal*years;
	}
	
	public void display()
	
	{
		super.display();
		System.out.println("Sal is:"+sal);
		System.out.println("Years is:"+years);
		System.out.println("total Sal is:"+displaysal());
	}
}
