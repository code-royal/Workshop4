import java.util.*;

/**
 * Write a description of class divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class divisible
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        if(num%3==0 && num%5==0)
        {
            System.out.println("The number is divisible by both 3 and 5.");
        }
        else
        {
            System.out.println("The number is not divisible by both 3 and 5.");
        }
    }
}