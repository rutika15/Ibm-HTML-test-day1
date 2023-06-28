package project4;

public class Sportsman extends Person
{
	public String sport;
	
	public Sportsman(String name,int age,String sport)
	{
		super(name,age);
		this.sport=sport;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Sport is:"+ sport);
	}

}

