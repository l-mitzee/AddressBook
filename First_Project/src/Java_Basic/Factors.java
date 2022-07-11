package Java_Basic;
import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = input.nextInt();
        int value;

        for ( value = 2; value * value <= num; value++)
        {
            while (num % value == 0)
            {
                System.out.print("factor of " + num + " is "  + value + " ");
                num = num / value;
            }
        }
        if (num != 1)
        {
            System.out.print(num);
        }

    }
}