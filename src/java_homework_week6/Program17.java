package java_homework_week6;
/**17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *Input a Decimal Number : 5
 *Expected Output
 *Binary number is: 101*/
import java.util.Scanner;
public class Program17 {

    public static void main(String[] args) {
        int dec_num, quot, a=1, b;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();

        quot = dec_num;

        while(quot != 0)
        {
            bin_num[a++] = quot%2;
            quot = quot/2;
        }

        System.out.print("Binary number is: ");
        for(b=a-1; b>0; b--)
        {
            System.out.print(bin_num[b]);
        }
        System.out.print("\n");


    }

}





