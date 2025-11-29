import java.util.*;

/**
 * Write a description of class GradeConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeConversion
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your GPA: ");
        float GPA = input.nextFloat();
        if(GPA>=0.0 && GPA<=4.0)
        {
            if(GPA>3.6 && GPA<=4)
            {
                System.out.println("A+");
            }
            else if(GPA<=3.6 && GPA>3.2)
            {
                System.out.println("A");
            }
            else if(GPA<=3.2 && GPA>2.8)
            {
                System.out.println("B+");
            }
            else if(GPA<=2.8 && GPA>2.4)
            {
                System.out.println("B");
            }
            else if(GPA<=2.4 && GPA>2.0)
            {
                System.out.println("C+");
            }
            else if(GPA<=2.0 && GPA>1.6)
            {
                System.out.println("C");
            }
            else if(GPA<=1.6 && GPA>1.2)
            {
                System.out.println("D+");
            }
            else if(GPA<=1.2 && GPA>0.8)
            {
                System.out.println("D");
            }
            else if(GPA<=0.8 && GPA>0.4)
            {
                System.out.println("E");
            }
            else if(GPA<=0.4 && GPA>0.0)
            {
                System.out.println("F");
            }
        }
        else
        {
            System.out.println("Invalid GPA input.");
        }
    }
}