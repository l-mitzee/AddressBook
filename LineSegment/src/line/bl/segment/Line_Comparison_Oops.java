package line.bl.segment;

public class Line_Comparison_Oops {
	static void compareLine(double a1, double b1,
    double c1, double a2,
    double b2, double c2)
	{
		
		
	    
	    if ((a1 / a2 == b1 / b2)
	            && (a1 / a2 == c1 / c2)
	            && (b1 / b2 == c1 / c2))
	            System.out.println( "The given straight"
	            +" lines are identical");
	   
	    else
	    	System.out.println("the lines are not equal");
	
	}
	
	public static void main(String[] args)
	{
	    double a1 = -2, b1 = 4,
	            c1 = 3, a2 = -6,
	            b2 = 12, c2 = 9;
	    compareLine(a1, b1, c1, a2, b2, c2);
	}


}