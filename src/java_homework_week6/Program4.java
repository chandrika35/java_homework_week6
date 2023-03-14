package java_homework_week6;
/**Write a Java programme using the following steps.
/*1.1 Declare two instance variables.
 *1.2 Declare one instance method.
 *1.3 Call both instance variables into the instance method inside the print statement.
 *1.4 Declare the Main method.
 *1.5 Call the above instance method into the Main method and Run the programme.*/


public class Program4 {
  static int p = 20;
  static int q = 30;
  int r = 40;
  int s = 50;
//2 static and 2 instance variables are created
    public static void main(String[] args) {
Program4 obj = new Program4();
obj.MyMethod2();
System.out.println();
MyMethod1(obj.r, obj.s);
//Instance objects are created
//Called both instance and static methods are called in main method
    }
public static void MyMethod1(int r , int s) {
    System.out.println(p);
    System.out.println(q);
    System.out.println(r);
    System.out.println(s);
//static method is created and variables are called
}

public void MyMethod2(){
    System.out.println(p);
    System.out.println(q);
    System.out.println(r);
    System.out.println(s);
//static method is created and variables are called
    }
}
