
package java_homework_week6;
/**1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1 {

    int a = 25;
    int b = 50;
    //two  instance variablesare created

    public static void main(String[] args) {
        Program1 inst  = new Program1();
        inst.instanceMethod();
//objects were created and instance Method is called to main method

    }

    public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
//instance Method is created and both the variables have been called

    }
}