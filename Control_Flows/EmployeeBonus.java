import java.util.Scanner;
public class EmployeeBonus
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();
        double bonus = 0.0;

        if (yearsOfService > 5)
        {
            bonus = salary * 5 / 100;
        }

        System.out.print("The bonus amount is INR " + bonus);
    }
}
