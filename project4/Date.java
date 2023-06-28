package project4;

public class Date {
	public static int dd;
	public static int mm;
	public static int yy;
	/**
	 * @return the dd
	 */
	public static int getDd() {
		return dd;
	}
	/**
	 * @param dd the dd to set
	 */
	public static void setDd(int dd) {
		Date.dd = dd;
	}
	/**
	 * @return the mm
	 */
	public static int getMm() {
		return mm;
	}
	/**
	 * @param mm the mm to set
	 */
	public static void setMm(int mm) {
		Date.mm = mm;
	}
	/**
	 * @return the yy
	 */
	public static int getYy() {
		return yy;
	}
	/**
	 * @param yy the yy to set
	 */
	public static void setYy(int yy) {
		Date.yy = yy;
	}
	
	public static boolean validdate()
	{
		if(dd>0 && dd<=31 && mm>0 && mm<=12 && yy>0 && yy<=2099)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int nextDay()
	{
		int newdate=dd+1;
		return newdate;
	}
	
	
	

}
