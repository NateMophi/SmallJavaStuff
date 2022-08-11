package com.company;
import java.util.Scanner;

public class Voting
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age= input.nextInt();
        System.out.println(Age(age));
    }
    public static String Age(int age)
    {
        if (age >= 18 )
        {
            return "You are eligible for voting";
        }
        else
        {
            return "You are ineligible for voting";
        }
    }
}
