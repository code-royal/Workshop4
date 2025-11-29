import java.util.*;

/**
 * Write a description of class SellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPrice
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        float sp;
        System.out.println("Enter the category(A/B/C/D): ");
        char category = input.next().charAt(0);
        System.out.println("Enter the marked price: ");
        float mp = input.nextFloat();
        
        if(category=='A')
        {
            sp = mp-(mp*0.6f);
            System.out.println("The selling price is "+ sp);
        }
        else if(category=='B')
        {
            sp = mp-(mp*0.4f);
            System.out.println("The selling price is "+ sp);
        }
        else if(category=='C')
        {
            sp = mp-(mp*0.2f);
            System.out.println("The selling price is "+ sp);
        }
        else if(category=='D')
        {
            sp = mp-(mp*0.1f);
            System.out.println("The selling price is "+ sp);
        }
        else
        {
            System.out.println("Invalid Input.");
        }
    }
}