import java.util.Scanner;
public class GreatestFactor
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;

        if (number > 1)
        {
            for (int i = number - 1; i >= 1; i--)
            {
                if (number % i == 0)
                {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.print("The greatest factor of " + number + " besides itself is " + greatestFactor);
        }
        else
        {
            System.out.print("Enter an integer greater than 1.");
        }
    }
}
