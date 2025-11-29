import java.util.*;

/**
 * Write a description of class divisible2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible2
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        if(num%3==0)
        {
            if(num%5==0)
            {
                System.out.println("The number is divisible by both 3 and 5.");
            }
            else
            {
                System.out.println("The number is divisible by 3 but not by 5.");
            }
        }
        else if(num%5==0)
        {
            if(num%3==0)
            {
                System.out.println("The number is divisible by both 5 and 3.");
            }
            else
            {
                System.out.println("The number is divisible by 5 but not by 3.");
            }
        }
        else
        {
            System.out.println("The number is not divisible by both 3 and 5,");
        }
    }
}