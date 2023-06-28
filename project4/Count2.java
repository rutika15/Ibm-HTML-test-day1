package project4;

public class Count2 {
	private int sn;
	private static int c=0;
	
	public static int getcounter()
	{
		return c;
	}
	public Count2()
	{
		c++;
		sn=c;
	}

}
