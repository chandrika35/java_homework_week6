package java_homework_week6;
/**13. Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.*/


import java.util.Scanner;

public class Program13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the first nmber: ");
        double a = in.nextDouble();
        System.out.println("Inout the second number: ");
        double b = in.nextDouble();
        System.out.println("Input the third number: ");
        double c = in.nextDouble();
        System.out.println("The average value is " + average(a, b,c)+ " \n" );

    }

    public static double average(double a, double b, double c){

        return(a + b + c) / 3;
    }
}
