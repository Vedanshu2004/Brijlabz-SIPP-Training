import java.util.Scanner;
public class NaturalNumberSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number >= 1)
        {
            int sum = number * (number + 1) / 2;
            System.out.print("The sum of " + number + " natural numbers is " + sum);
        }
        else
        {
            System.out.print("The number " + number + " is not a natural number");
        }
    }
}
