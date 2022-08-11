package com.company;
import java.util.*;
import java.text.SimpleDateFormat;


public class Main
{
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        int age;
        char name;
        System.out.println("Hello, what's your name and how  old are you ?   " + java.time.LocalTime.now());
        name=input.next().charAt(0);
        age= input.nextInt();
        if(age < 16)
        {
            System.out.println("You cannot drive, vote or rent a car");
        }
        else if(age < 18)
        {
            System.out.println("You cannot vote or rent a car");
        }
        else if(age < 25)
        {
            System.out.println("You cannot rent a car");
        }
        else
        {
            System.out.println("You can do anything that is legal");
        }

    }
}
