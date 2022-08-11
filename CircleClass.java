package com.company;
import java.util.Scanner;

public class CircleClass
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int r= input.nextInt();
        System.out.println(circumference(r));
        System.out.println(area(r));
    }
    public static double circumference(int r)
    {
        double circ= 2 * 3.14 * r;
        return circ;
    }
    public static double area(int r)
    {
        double ar= 3.14* Math.pow(r,2);
        return ar;
    }

}
