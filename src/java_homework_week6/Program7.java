package java_homework_week6;
/**Write a program to insert any temperature value in degree Fahrenheit and
// convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/

import java.util.Scanner;
public class Program7 {

    public static void main(String[] args) {
        Degree();
    }
    public static void Degree(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the Temperature in Fahrenheat: ");
        int x=input.nextInt();
        double result= (x-32)*5/9;
        System.out.println(x+" degree Fahrenheit =  " + result +" in Celsius");
    }

    // crsated new method, scanner importd, called this method in to main method
    }


