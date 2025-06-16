import java.util.Scanner;
public class PrimeCheck
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1)
        {
            isPrime = false;
        }
        else
        {
            for (int i = 2; i <= number / 2; i++)
            {
                if (number % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
        {
            System.out.print(number + " is a prime number.");
        }
        else
        {
            System.out.print(number + " is not a prime number.");
        }
    }
}
