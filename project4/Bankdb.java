package project4;

public class Bankdb {
	public int amt;
	public int accno;
	public int amt2;
	public int total=1000;
	/**
	 * @return the amt
	 */
	public int getAmt() {
		return amt;
	}
	/**
	 * @param amt the amt to set
	 */
	public void setAmt(int amt) {
		this.amt = amt;
	}
	/**
	 * @return the accno
	 */
	public int getAccno() {
		return accno;
	}
	/**
	 * @param accno the accno to set
	 */
	public void setAccno(int accno) {
		this.accno = accno;
	}
	
	public Bankdb(int amt2)
	{
		this.amt2=amt2;
	}
	
	public int balance()
	{
		int bal=(amt+total)-amt2;
		return bal;
	}
	@Override
	public String toString() {
		return "Bankdb [amt=" + amt + ", accno=" + accno + ", amt2=" + amt2 + ", total=" + total + ", getAmt()="
				+ getAmt() + ", getAccno()=" + getAccno() + ", balance()=" + balance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
