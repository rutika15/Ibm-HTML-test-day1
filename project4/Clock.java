package project4;

public class Clock {
	public int hh,mm,ss;
	
	public Clock(int hh,int mm,int ss)
	{
		this.hh=hh;
		this.mm=mm;
		this.ss=ss;
	}
	
	public void isvalid()
	{
		if(hh>=0 && hh<=24 && mm>=0 &&mm<60 && ss>=0 && ss<60)
		{
			System.out.println("Valid");
		}
		else
		{
			System.out.println("Not valid");
		}
		
	}
	public void setampm()
	{
		if(hh>12)
		{
			System.out.println("PM");
		}
		else
		{
			System.out.println("AM");
		}
	}
}
