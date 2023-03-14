package java_homework_week6;
/**12. Write a Java program to compute the specified expressions and print the
 output.
 Test Data:
 ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 Expected Output : 2.138888888888889*/

public class Program12 {

    public static void main(String[] args) {
        Calculation();
    }
//called other method in main method
    public static void Calculation(){
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
    }
}
//new Method created