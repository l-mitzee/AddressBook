package Empwage;

public class Emp_time {
	public static void main(String[] args) {
		int part_time=1;
		int full_time=2;
		int emp_rate_per_hr=20;
		int emphrs=0;
		
		
		
		double empcheck=(Math.floor(Math.random()*10)%3);
		
		if (empcheck==full_time) {
			emphrs=16;
			System.out.println("Full time employee   " +emphrs);
		}
		else if (empcheck==part_time) {
			emphrs=8;
			System.out.println("Part time employee   " +emphrs);
		}
		else {
			emphrs=0;
			System.out.println("Absent Employee   " +emphrs);
		}
		
		
		int empwage= emp_rate_per_hr*emphrs;
		System.out.println("Total wage== "+empwage);
	}

		

}
