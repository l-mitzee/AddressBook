package Empwage;

public class Emp_switch {
	
	public static void main(String[] args) {
		
		int no_of_hrs=10;
		 switch (no_of_hrs) {
	      case 16:
	        System.out.println("Full day===no_of_hrs=16");
	        break;
	      case 8:
	        System.out.println("Part time====no_of_hrs=8;");
	        break;
	        default:
	        	System.out.println("Not completed staff hour");
		 }
		 
	}
}
