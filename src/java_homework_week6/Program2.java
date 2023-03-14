package java_homework_week6;

/**Write a Java programme using the following steps.Program 2
 *2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */

public class Program2 {
    //static Method is created
    static int a = 75;
    static int b = 100;
        //a & b are static Variables

    public static void main(String[] args) {
            MyMethod();
//static method was called to main method
        }
        public static void MyMethod() {
            System.out.println(a);
            System.out.println(b);
            //static method was created and both variables were called
        }
    }
