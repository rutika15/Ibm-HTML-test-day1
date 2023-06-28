package project4;

public class Employee {
	private static int sal;
	
	public static int getdetails()
	{
		sal++;
		return sal;
	}
	
	public static void main(String args[])
	{
		Employee e=new Employee();
		System.out.print(getdetails());
	}

}
