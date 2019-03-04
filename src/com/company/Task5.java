package com.company;
import java.util.Scanner;
public class Task5 {
    public static void main(String [] args)
    {
        int letter=0;
        int space=0;
        int number=0;
        int other=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String st = s.nextLine();
        st=st.trim();
        s.close();
        for (int i=0;i<st.length();i++)
        {
            int control=(int)(st.charAt(i));
            if (control==32){space++;}
            else if(control >= 48 && control <= 57){number++;}
            else if(control >= 65 && control <= 90){letter++;}
            else if(control >= 97 && control <= 122){letter++;}
            else {other++;}
        }
        System.out.println("Results: ");
        System.out.println("Letters= "+letter);
        System.out.println("Spaces= "+space);
        System.out.println("Numbers= "+number);
        System.out.println("Others= "+other);
    }
}
