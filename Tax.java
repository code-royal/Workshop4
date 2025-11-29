import java.util.*;

/**
 * Write a description of class Tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tax
{
    public static void main(String[] Args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual income(NPR): ");
        double annualIncome = input.nextInt();
        double totalTax = 0;
        if(annualIncome<=500000)
        {
            totalTax = annualIncome * 0.01;;
            System.out.println("Total Tax = " + totalTax);
        }
        else if(annualIncome>500000 && annualIncome<=700000)
        {
            totalTax = (500000 * 0.01) + (annualIncome - 500000) * 0.10;
            System.out.println("Total Tax = " + totalTax);
        }
        else if(annualIncome>700000 && annualIncome<=1000000)
        {
            totalTax = (500000 * 0.01) + (200000 * 0.10) + (annualIncome-700000) * 0.20;
            System.out.println("Total Tax = " + totalTax);
        }
        else if(annualIncome>1000000 && annualIncome<=2000000)
        {
            totalTax = (500000 * 0.01) + (200000 * 0.10) + (300000 * 0.20) + (annualIncome - 1000000) * 0.30;
            System.out.println("Total Tax = " + totalTax);
        }
        else if(annualIncome>2000000 && annualIncome<=5000000)
        {
            totalTax = (500000 * 0.01) + (200000 * 0.10) + (300000 * 0.20) + (1000000 * 0.30) + (annualIncome - 3000000) * 0.36;
            System.out.println("Total Tax = " + totalTax);
        }
        else if(annualIncome>5000000)
        {
            totalTax = (500000 * 0.01) + (200000 * 0.10) + (300000 * 0.20) + (1000000 * 0.30) + (3000000 * 0.36) + (annualIncome - 5000000) * 0.39;
            System.out.println("Total Tax = " + totalTax);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}