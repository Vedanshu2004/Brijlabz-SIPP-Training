import java.util.Scanner;
public class NaturalNumberSumComparison
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n >= 1)
        {
            int sum = 0;
            int i = 1;

            while (i <= n)
            {
                sum = sum + i;
                i = i + 1;
            }

            int formulaSum = n * (n + 1) / 2;

            System.out.println("Sum using while loop is " + sum);
            System.out.println("Sum using formula is " + formulaSum);

            if (sum == formulaSum)
            {
                System.out.print("Both results are correct and match.");
            }
            else
            {
                System.out.print("The results do not match. There may be an error.");
            }
        }
        else
        {
            System.out.print("The number " + n + " is not a natural number.");
        }
    }
}
