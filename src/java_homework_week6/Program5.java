package java_homework_week6;

import java.util.Scanner;

/**
 *Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first Number: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Please Enter The Second Number: ");
        int b = Integer.parseInt(scan.nextLine());
        Program5 obj = new Program5();
                obj.multiplication(a, b);
                obj.division(a, b);
        addition(a, b);
        subtraction(a, b);
        obj.multiplication(a, b);
        obj.division(a, b);
//created objects of both instance variables in main method

        scan.close();
    }

    public static void addition(int a, int b) {
        int ans = a + b;
        System.out.println("Addition " + ans);

    }

    public static void subtraction(int a, int b) {
        int ans = a - b;
        System.out.println("Subtraction " + ans);
//Two static methods created and called both variables
    }

    public  void multiplication(int a, int b) {
        int ans = a * b;
        System.out.println("Mul " + ans);
    }

    public void division(int a, int b) {
        int ans = a / b;
        System.out.println("Div " + ans);
   //two instance method created, called both variables
    }

}

