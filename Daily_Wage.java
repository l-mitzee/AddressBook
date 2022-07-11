package Empwage;

public class Daily_Wage {
	public static void main(String[] args) {
		int Is_Present=1;
		int wageperhr=20;
		int workhr=8;
		int empwage=wageperhr*workhr;
		double empcheck = Math.floor(Math.random()*10)%2;
		
		if(empcheck==Is_Present) {
			System.out.println("EMployee wage ====   "+empwage);
			System.out.println("EMployee is Present");
		}
		else
		{
			empwage=0;
			System.out.println("Employee wage =====   " +empwage);
			System.out.println("Employee is Absent");
		}
	}


}
