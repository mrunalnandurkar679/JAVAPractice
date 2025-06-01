package org.example;

import java.util.Scanner;

public class ScannerClass {

    public static void main (String[] args){

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("enter the value of a");
        int b = s.nextInt();
        System.out.println("enter the value of b");
        int sum = a+b;
        System.out.println("sum is");
        System.out.println(sum);



    }
}
