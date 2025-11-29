import java.util.*;

/**
 * Write a description of class Divisible_by_two here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisible_by_two
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        if(num%2==0)
        {
            System.out.println(num + " is divisible by 2.");
        }
        else 
        {
            System.out.println(num + " is not divisible by 2.");
        }
    }
}