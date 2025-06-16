import java.util.Scanner;
public class MultiplesBelow100
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0 && number < 100)
        {
            int counter = 1;	
            while (counter * number < 100)
            {
                System.out.println(counter * number);
                counter = counter + 1;
            }
        }
        else
        {
            System.out.print("Please enter a positive integer less than 100.");
        }
    }
}
