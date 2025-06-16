import java.util.Scanner;
public class YoungestAndTallestFriend
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();

        // Taking height inputs
        System.out.print("Enter Amar's height in cm: ");
        int amarHeight = input.nextInt();
        System.out.print("Enter Akbar's height in cm: ");
        int akbarHeight = input.nextInt();
        System.out.print("Enter Anthony's height in cm: ");
        int anthonyHeight = input.nextInt();

        // Find youngest age
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge)
        {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge)
        {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find tallest height
        int tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight)
        {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight)
        {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        System.out.print("The youngest friend is " + youngestFriend + " with age " + youngestAge + 
                         " and the tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");
    }
}
