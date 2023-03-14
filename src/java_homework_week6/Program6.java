package java_homework_week6;
/**Write a program to enter any radius value of the circle and find out the
 *area.(Formula of Area A=PI*r*r)*/

import java.util.Scanner;

public class Program6 {

    public static void main(String args[]) {
       Method1();
    }


        public static void Method1(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the radious: ");
            double radious = scanner.nextDouble();
            double  area=(22*radious*radious)/7 ;
            System.out.println("Area of Circle is: " + area);
        }

//Static method created; scanner imported and called this method in main method

    }



