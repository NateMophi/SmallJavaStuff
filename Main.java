package com.company;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        //Simple Calculator
        /*char operator;
        double num1, num2, answer;*/

        Scanner input = new Scanner(System.in);
       /*System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();

        switch (operator) {
            case '+':
                answer = num1 + num2;
                System.out.println("The sum of num1 and num2 is " + answer);
                break;

            case '-':
                answer = num1 - num2;
                System.out.println("The difference of num1 and num2 is " + answer);
                break;

            case '*':
                answer = num1 * num2;
                System.out.println("The product of num1 and num2 is " + answer);
                break;

            case '/':
                answer = num1 / num2;
                System.out.println("The quotient of num1 and num2 is " + answer);
                break;

            default:
                System.out.println("INVALID operator");
                break;

        }

        //USER input
        int x;
        System.out.println("Enter the first number: ");
        x = input.nextInt();


        if(x%2 == 0)
        {
            System.out.println("x is even");
        }
        else
        {
            System.out.println("x is odd");
        }
        */


        //Simple Interest
        double P, R, T, SimpInterest;
        System.out.println("Enter a value for P: ");
        P = input.nextDouble();
        System.out.println("Enter a value for R: ");
        R = input.nextDouble();
        System.out.println("Enter a value for T: ");
        T = input.nextDouble();
        SimpInterest = (P*R*T)/100;
        System.out.println("The simple interest is " +SimpInterest);





    }
}

//WELCOME to H3LL
/* class Welcome
{
    public static void main(String[] args)
    {
        System.out.println("welcome to a language of pain and suffering");
    }
}
*/






