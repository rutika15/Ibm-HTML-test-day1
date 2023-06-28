package project4;

public class New1 {
	public static int s;
	public int a=10;
	
	static
	{
		s=0;
	}
	public New1()
	{
		s++;
		System.out.println(s);
	}
public static void main(String args[])
{
	New1 o=new New1();
	System.out.println(o.a);
}

}
