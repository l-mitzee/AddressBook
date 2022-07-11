package Java_Basic;

import java.util.Scanner;

public class FlipCoinPercentage {
public static void main(String[] args) {
	int tail=0, head=0;
	Scanner input =new Scanner(System.in);
	int num =input.nextInt();
	System.out.println("Enter number to flip coin"+num);
	if(num>0) {
		double[] result = new double[num];
		for(int i=0; i<num; i++) {
			result=Math.random();
			if(result[i]<0.5) {
				tail++;
			}
			else {
				head++;
			}
		}
		float percent_tail = (tail*100)/num;
		System.out.println("percentage of tail: "+percent_tail);
		float percent_head = (head*100)/num;
		System.out.println("percentage of head: "+percent_head);
	}
	else {
		System.out.println("enter positive number");
	}
	
	
	}
}
