//program that asks a lecturer to enter marks for three units, java programming, 
//networking and maths. The method should compute the average 
package average2;
//import scanner
import java.util.Scanner;

public class Average2 {
//declaring variabes
   static int java, networking, maths, average;
     
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        //ask lec to enter marks for java
        System.out.println(" marks for java is");
        java =input.nextInt();
        //ask lec to enter marks for networking
        System.out.println(" marks for networking is");
        networking =input.nextInt();
        //ask lec to enter marks for maths
        System.out.println(" marks for maths is");
        maths =input.nextInt();
        average=(networking+maths+java)/3;
        System.out.println("the average is: "+average);
    }
    
}
