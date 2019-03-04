package com.company;
import java.util.Scanner;
public class Task3 {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String to be reversed");
        String str = s.nextLine();
        s.close();
        String rev="";
        str=str.trim();
        for (int i=str.length()-1; i>=0; i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println(rev);
    }
}
