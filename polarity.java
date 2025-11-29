import java.util.*;

/**
 * Write a description of class polarity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class polarity
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        if(num>0)
        {
            System.out.println("The number is positive.");
        }
        else if(num<0)
        {
            System.out.println("The number is negative.");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
}