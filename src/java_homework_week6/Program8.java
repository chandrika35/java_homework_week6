package java_homework_week6;
/**8. Write a program to calculate the area of a triangle.*/

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Triangle();
    }

    public static void Triangle(){
        int height, base, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the triangle : ");
        height = scanner.nextInt();
        System.out.println("Enter the base of the triangle : ");
        base = scanner.nextInt();
        area = (height * base);
        System.out.println("Area of the triangle is : " + area );

        scanner.close();




    }
}
