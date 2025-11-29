import java.util.*;

/**
 * Write a description of class SwitchSP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwitchSP
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        float sp;
        char category = input.next().charAt(0);
        System.out.println("Enter the marked price: ");
        float mp = input.nextFloat();
        switch(category)
        {
            case 'A':
                sp = mp-(mp*0.6f);
                System.out.println("The selling price is "+ sp);
                break;
            case 'B':
                sp = mp-(mp*0.4f);
                System.out.println("The selling price is "+ sp);
                break;
            case 'C':
                sp = mp-(mp*0.2f);
                System.out.println("The selling price is "+ sp);
                break;
            case 'D':
                sp = mp-(mp*0.1f);
                System.out.println("The selling price is "+ sp);
                break;
            default:
                System.out.println("Invalid Input.");
        }
    }
}