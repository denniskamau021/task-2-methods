//a program that dispalys largest number and smallest number
package java_methods;
//importing scanner
import java.util.Scanner;

public class Methods_in_java {
    //declaring variables
static int num1,num2,num3;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ask user to enter num1
        System.out.println("enter num1");
        num1 =input.nextInt();
        //ask user to enter num2
        System.out.println("enter num2");
        num2 =input.nextInt();
        //ask user to enter num3
        System.out.println("enter num3");
        num3 =input.nextInt();
        if (num1>num2){
            System.out.print(num1+"is largest");
        }
        else 
            if(num1>num3){
            System.out.print(num1+"is largest");
        }
        else 
            if(num2 > num1){
            System.out.print(num2+"is largest");
        }
            else 
            if(num2>num3){
            System.out.print(num3+"is largest");
        }
         else 
            if(num3>num1){
            System.out.print(num3+"is largest");
        }
         else 
            if(num3>num2){
            System.out.print(num3+"is largest");
        }
    }
    
}
