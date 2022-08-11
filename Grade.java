package com.company;
import java.util.Scanner;

public class Grade
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score ");
        int score = input.nextInt();

        if (score <= 100 && score >= 91)
        {
            System.out.println("You got an AA");
        }
        else if (score <= 90 && score >= 81)
        {
            System.out.println("You got an AB");
        }
        else if (score <= 80 && score >= 71)
        {
            System.out.println("You got an BB");
        }
        else if(score <= 70 && score >= 61)
        {
            System.out.println("You got an BC");
        }
        else if(score <= 60 && score >= 51)
        {
            System.out.println("You got an CD");
        }
        else if (score <= 50 && score >=41)
        {
            System.out.println("You got an DD");
        }
        else
        {
            System.out.println("You got Failed cuz that was failures do!!!");
        }
    }

}
