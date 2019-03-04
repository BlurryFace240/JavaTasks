package com.company;
import java.util.Scanner;
public class Task4 {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = s.nextLine();
        word=word.trim();
        word=word.toLowerCase();
        s.close();
        String wordRev="";
        for (int i=word.length()-1; i>=0; i--)
        {
            wordRev+=word.charAt(i);
        }
        if(word.equals(wordRev)){
            System.out.println("True , the word is a palinedrome");
        }
        else
        {
            System.out.println("False , the word isn't a palinedrome");
        }
    }
}
