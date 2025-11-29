import java.util.*;

/**
 * Write a description of class Tutorial4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tutorial4
{
    public static void main(String[] Args)
    {
        int age; //Declaration statement 
        age = 18; //Expression statement
        
        System.out.println("Welcome to the mart!!");
        if(age>=18){
        System.out.println("Eligible fot citizenship.");
        }
        else{
        System.out.println("Not eligible");
        }
        System.out.println("Thank you! Happy Customer!");
        
        
        int num = 15;
        if(num % 3 == 0)
        {
            if (num % 5 ==0)
            {
                System.out.println("Divisible by both");
            }
            else
            {
                System.out.println("Divisible by three but not by 5"); 
            }
        }
        else if(num % 5 == 0)
        {
            if(num % 3 ==0)
            {
                System.out.println("Divisible by both");
            }
            else
            {
                System.out.println("Divisible by 5 but not by 3");
            }
        }
        else
        {
            System.out.println("Not divisibl by either of them");
        }
        
        //Switch Statement
        Scanner input = new Scanner(System.in);
        int choice;
        System.out.println("Enter your choice:");
        choice = input.nextInt();
        
        switch(choice)
        {
            case 1: System.out.println("Pepsi");
            break;
            case 2: System.out.println("Cocacola");
            break;
            case 3: System.out.println("Coffee");
            break;
            default: System.out.println("Invalid Choice");
        }
    }
}