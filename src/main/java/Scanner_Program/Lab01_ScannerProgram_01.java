package Scanner_Program;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab01_ScannerProgram_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the 1st number = " );
        int FirstNumber= scan.nextInt();
        System.out.print("enter the 2nd number = ");
        int SecondNumber = scan.nextInt();
        int temp = FirstNumber;
        FirstNumber = SecondNumber;
        SecondNumber = temp;
        System.out.println("\nAfter Swapping");
        System.out.println("FirstNumber" + FirstNumber);
        System.out.println("SecondNumber" + SecondNumber);


    }
}
