import java.util.*;

/**
 * Write a description of class cinema here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Input collection
        System.out.print("Enter age group (child/adult/senior): ");
        String ageGroup = sc.nextLine();

        System.out.print("Enter movie language (nepali, english, hindi): ");
        String language = sc.nextLine();

        System.out.print("Are you a student with valid ID? (yes/no): ");
        String isStudent = sc.next();

        System.out.print("Is it a festival day? (yes/no): ");
        String isFestival = sc.next();
        
        // Base price by age group (Nepali movie)
        double basePrice = 0;
        switch (ageGroup) 
        {
            case "child": basePrice = 150; 
            break;
            case "adult": basePrice = 250; 
            break;
            case "senior": basePrice = 200; 
            break;
            default:
            System.out.println("Invalid age group.");
            return;
        }

        // Language surcharge
        switch (language) 
        {
            case "hindi":basePrice = basePrice + 50; 
            break;
            case "english":basePrice = basePrice + 100; 
            break;
            case "nepali": basePrice = basePrice;
            break;
            default:
            System.out.println("Invalid language.");
            return;
        }

        // Apply student discount
        if (isStudent == "yes") 
        {
            basePrice = basePrice - (basePrice * 0.20);     // 20% off
        }

        // Apply festival discount
        if (isFestival == "yes") 
        {
            basePrice = basePrice - (basePrice * 0.15);    // 15% off
        }
        System.out.println("Final ticket price: Rs. " + basePrice);
    }
}