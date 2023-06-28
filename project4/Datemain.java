package project4;

public class Datemain {
	public static void main(String args[])
	{
		Date d=new Date();
		d.setDd(12);
		d.setMm(3);
		d.setYy(2002);
		System.out.println(d.validdate());
		System.out.println(d.nextDay());
		
		
	}

}
