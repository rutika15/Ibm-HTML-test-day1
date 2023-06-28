package project4;

public class Bal {
	public static void main(String args[])
	{
		Bankdb b=new Bankdb(200);
		b.setAccno(123);
		b.setAmt(100);
		System.out.println("balance is :"+b.balance());
	}

}
