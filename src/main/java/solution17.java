/*
 *  UCF COP3330 Fall 2021 Assignment 17 Solution
 *  Copyright 2021 Michael Andrich
 */
/*
    prompt user for their weight, gender, total alc consumed in ounces, and time since last drink
    use the BAC formula to calculate their BAC
    display whether it is legal to drive or not to the legal limit of 0.08


 */


import java.util.Scanner;

public class solution17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r;

        System.out.println("Enter a 1 if you are a male or a 2 if you are a female: ");
        int g = sc.nextInt();

        System.out.println("How many ounces of alcohol did you have? ");
        int A = sc.nextInt();

        System.out.println("What is your weight, in pounds? ");
        int W = sc.nextInt();

        System.out.println("How many hours has it been since your last drink? ");
        int H = sc.nextInt();

        if(g==1){
            r = (float) 0.73;
        }
        else{
            r = (float) 0.66;
        }
        double BAC = (A * 5.14/ W * r) - (0.015 * H);

        System.out.println("Your BAC is "+(BAC)+"");
        if(BAC < 0.08){
            System.out.println("It is legal for you to drive.");
        }
        else{
            System.out.println("It is not legal for you to drive");
        }
    }
}