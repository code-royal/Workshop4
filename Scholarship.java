import java.util.*;

/**
 * Write a description of class Scholarship here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scholarship
{
    public static void main(String[] Args)
    {
        float GPA;
        int attendance;
        int attitude;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your GPA: ");
        GPA = input.nextFloat();
        System.out.println("Enter your attendance percentage: ");
        attendance = input.nextInt();
        System.out.println("Enter your attitude score: ");
        attitude = input.nextInt();
        
        if(GPA>=3.2)
        {
            if(attendance>80)
            {
               if(attitude<5)
                {
                    System.out.println("You're eligible for the scholarship.");
                }
            }
        }
        else
        {
            System.out.println("You're not eligible for the scholarship.");
        }
    }
}