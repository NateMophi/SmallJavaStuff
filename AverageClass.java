package com.company;
import java.util.Scanner;

public class AverageClass
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int sum = x+y+z;
        double avg= sum/3;
        System.out.println(average(3,4,5));
    }
    public static double average(int x, int y, int z)
    {
        int sum = x+y+z;
        double avg= sum/3;
        return avg;
    }
}
