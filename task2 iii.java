// a program that check if  the year is a leap year
package leap.year;
//importing scanner
import java.util.Scanner;

public class LeapYear {
//declaring variables
    static int year;
   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        // enter year
        System.out.println("enter any year");
        year =input.nextInt();
        boolean flag=false;
        if (year % 400==0){
            flag=true;
        }
        else if (year % 100==0){
            flag=false;
        }
        else flag=year % 4==0;
        if(flag){
            System.out.println("year"+year+" is a leap year");
        }
            
        else
        {
           System.out.println("year"+year+" is not a leap year"); 
        }
    }
    
}
