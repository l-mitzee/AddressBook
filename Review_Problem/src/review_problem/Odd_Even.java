package review_problem;
import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number= ");
		int num = input.nextInt();
		//int num=7;
		if(num%2 == 0)
			System.out.println("number is even");
		else
			System.out.println("num is odd");
	}

}

