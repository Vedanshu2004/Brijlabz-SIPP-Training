import java.util.Scanner;
public class PowerOfNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++)
        {
            result = result * number;
        }

        System.out.print(number + " raised to the power " + power + " is " + result);
    }
}
