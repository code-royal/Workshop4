import java.util.*;

/**
 * Write a description of class EvenOrOdd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenOrOdd
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = input.nextInt();
        if(num%2==0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }
    }
}