package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;



public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter sentence ");
    String seq = scan.nextLine();

    //Reversed sentence
        System.out.println("Reversed sentence: ");
    char[] seq2=seq.toCharArray();
    for (int i=seq2.length-1; i>=0; i--)
        {
            System.out.print(seq2[i]);
        }
        System.out.println();
        System.out.println();

    //Divide sentence
        System.out.println("Words in the sentence: ");
        String[] seq3= seq.split(" ");
        for (int i=0; i<seq3.length; i++){
            System.out.println(seq3[i]); }
        System.out.println();


        //Replacing
        String seq4= seq.replace(' ','*');
        System.out.println("After replacing spaces: "+ seq4);
        System.out.println();

        //UpperCase
        String seq5= seq.toUpperCase();
        System.out.println("UpperCase: "+ seq5);
        System.out.println();

        //from symbol 5 to 10
        String seq6= seq.substring(4,10);
        System.out.println("From 5 to 10 symbols: "+ seq6);

    }
}
