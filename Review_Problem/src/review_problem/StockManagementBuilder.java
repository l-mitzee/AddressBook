package review_problem;

public class StockManagementBuilder {
	
	private int no_of_stockname = 0;
	private StockManagementObject[] StockManagementObjectArray;
	 
		public StockManagementBuilder() {
		
			StockManagementObjectArray = new StockManagementObjectArray[3];
		}
		
	public void addsharename(String stock_name, int share_price, int no_of_share) {
		StockManagementObjectArray[no_of_share] = new StockManagementObject(stock_name, share_price, no_of_share);
		no_of_stockname++;
		
	}
	public void calculateshare() {
		for(int i=0; i<no_of_stockname; i++) {
			StockManagementObjectArray[i].setcomapnyshare(this.calculateshare(StockManagementObjectArray[i]));
			System.out.println(StockManagementObjectArray[i]);
		}
	@public int getcalculateshare(String stock_name) {
		return calculateshare;
	}
	
	}
	public static void main(String[] args) {
		StockManagementBuilder stockmanagementobj = new StockManagementBuilder();
		stockmanagementobj share1 = new StockManagementBuilder("IOCL Share", 100, 5);
		StockManagementBuilder share2 = new StockManagementBuilder("IOCL Share", 100, 5);
		stockmanagementobj.calculateshare();
		
	}

}
