package com.Messaris;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = new NumberFactory().getRandomNumber();

        String quote;
        System.out.print("Enter Number 1-120 :");

        Scanner scan = new Scanner(System.in);

        int b = scan.nextInt();
        if (a == b) {
            quote = new QuoteGenerator().getOmg();
        } else {
            quote = new QuoteGenerator().getNope();
        }

        System.out.println(quote + "it was " + a);
    }
}