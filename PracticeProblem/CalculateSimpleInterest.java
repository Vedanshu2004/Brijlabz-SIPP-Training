import java.util.Scanner;
public class CalculateSimpleInterest
{
    public static void main(String[] args)
    {
	Scanner input = new Scanner(System.in);
	int principal = input.nextInt();
	int rate = input.nextInt();
	int time = input.nextInt();
	int simpleInterest = (principal * rate * time) / 100 ;
	System.out.print(simpleInterest);
    }
}