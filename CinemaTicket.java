import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter you age group \n(1 for child/2 for adult/3 for senior)");
      int age = sc.nextInt();
    System.out.println("Enter your movie language\n(1 for hindi/2 for english/3 for nepali)");
     int movie = sc.nextInt();
    System.out.println("Are you a student with valid ID card?\n(1 for yes/2 for no)");
     int student = sc.nextInt();
    System.out.println("Is it a festival day?\n(1 for yes/2 for no)");
     int festival = sc.nextInt();
    double ticket=0;

        if(age==1)
           
            {
                if(movie==1)
                {
                    ticket=150+50;
                }
                else if(movie==2)
                {
                    ticket=150+100;
                }
                else if(movie==3)
                {
                    ticket=150;
                }
                
            }
        else if(age==2)
            {
                if(movie==1)
                {
                    ticket=250+50;
                }
                else if(movie==2)
                {
                    ticket=250+100;
                }
                else if(movie==3)
                {
                    ticket=250;
                }
            }
        else if(age==3)
            {
                if(movie==1)
                {
                    ticket=200+50;
                }
                else if(movie==2)
                {
                    ticket=200+100;
                }
                else if(movie==3)
                {
                    ticket=200;
                }
            }
        else
            {
                System.out.println("Invalid age group");
            }
     
        if(student==2 && festival==2)
            {
                System.out.println("Your ticket price is Rs "+ticket);
            }
        if(student==1 && festival==2)
            {
                
                    ticket=0.8*ticket;
                    System.out.println("Your ticket price is Rs "+ticket);
                
            }
        else if(festival==1 && student==2 )
            {
                
                        ticket=0.8*ticket;
                        System.out.println("Your ticket price is Rs "+ticket);
                    
            }
        else if(festival==1 && student==1)
            {
                ticket=0.75*ticket;
                System.out.println("Your ticket price is Rs "+ticket);
            }
            
        
    }
}