package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        s.close();
        while (n!=0)
         {
             sum+=n%10;
             n/=10;
         }
        System.out.println("Sum= "+sum);
    }
}
