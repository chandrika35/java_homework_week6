package java_homework_week6;
/**3. 3. Write a Java programme using the following steps.
*3.1 Declare one instance and one static variable.
*3.2 Declare one instance method.
*.3 Declare one static method.
*3.4 Call both instance and static variables into both instance and static methods inside the
*print statement.
*3.5 Declare the Main method.
*3.6 Call both instance and static methods into the Main method and run the programme.*/

public class Program3 {
    int a = 400;
    static int b = 100;
    //both syatic and instance variables created
    public static void main(String[] args) {
Program3 sink = new Program3();
MyMethod(sink.a);
sink.InstanceVariable();
//Called both Methods in main Main method
    }
    public static void MyMethod(int a) {


        System.out.println(a);
        System.out.println(b);
//Static Method is created and called both variables in it
    }
public void InstanceVariable(){

        System.out.println(a);
        System.out.println(b);
}
//InstanceVariable method is created and  called both variables in it
}