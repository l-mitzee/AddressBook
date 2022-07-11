package review_problem;



public class StockManagementObject {
	public final String stock_name;
	public final int share_price;
	public final int no_of_shares;
	public int total_no_ofshare;
	
public StockManagementObject(String stock_name, int share_price, int no_of_shares) {
	this.stock_name = stock_name;
	this.share_price = share_price;
	this.no_of_shares = no_of_shares;
	
}

public void setcomapnyshare(int total_no_ofshare) {
	this.total_no_ofshare = total_no_ofshare;
}

@Override
public String toString() {
	return "total no of share : " +stock_name+ " is " +total_no_ofshare;
}
}
