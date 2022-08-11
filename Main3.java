package com.company;
import java.util.*;

public class Main3
{
    public static void main(String[]args)
    {
        Scanner input= new Scanner(System.in);
        double BMI;
        System.out.println("Enter your Body Mass Index");
        BMI=input.nextDouble();
        if(BMI < 18.5)
        {
            System.out.println("You're underweight");
        }
        else if(BMI > 18.5 && BMI < 24.9)
        {
            System.out.println("You have a normal weight");
        }
        else if(BMI > 24.9 && BMI < 29.9)
        {
            System.out.println("You're overweight");
        }
        else
        {
            System.out.println("You're obese");
        }
    }
}
