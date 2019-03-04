package com.company;
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
        System.out.println("Enter 2 numbers");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        s.close();
        System.out.println("First number = "+n);
        System.out.println("Second number = "+m);
        System.out.println("Sum = "+(n+m));
        System.out.println("Difference = "+(n-m));
        System.out.println("Product = "+(n*m));
        System.out.println("Average = "+((n+m)/2));
        System.out.println("Distance = "+(n-m));
        if(n>m){
            System.out.println("Max = "+n);
            System.out.println("Min = "+m);
        }
        else
        {
            System.out.println("Max = "+m);
            System.out.println("Min = "+n);
        }
    }
}
