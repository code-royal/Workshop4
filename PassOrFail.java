import java.util.*;

/**
 * Write a description of class PassOrFail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassOrFail
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = input.nextInt();
        if(marks >= 40)
        {
            System.out.println("You've passed the exam.");
        }
        else
        {
            System.out.println("You've failed the exam.");
        }
    }
}