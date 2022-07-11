package Java_Basic;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = input.nextInt();

        if(num % 2 == 0)
            System.out.println( "It is even number : "+num);
        else
            System.out.println("It is odd number : "+num);
    }
}