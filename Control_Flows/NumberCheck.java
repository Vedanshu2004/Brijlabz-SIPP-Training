import java.util.Scanner;
public class NumberCheck
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0)
        {
            System.out.print("The number is positive.");
        }
        else if (number < 0)
        {
            System.out.print("The number is negative.");
        }
        else
        {
            System.out.print("The number is zero.");
        }
    }
}
