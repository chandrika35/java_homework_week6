package java_homework_week6;

/**15. Write a Java program to swap two variables.*/

import java.util.Scanner;
public class Program15 {
    public static void main(String[] args) {
int a,b,c;
Scanner in = new Scanner(System.in);
System.out.println("Input the first number: ");
a = in.nextInt();
System.out.println("Input the second number: ");
b = in.nextInt();

c = a;
a = b;
b = c;

System.out.println(" Swapped values are :" + a + " and " + b);
    }
}
