import java.util.*;

public class QuestTwo
{
    public static void main(String[]args)
    {
        Shapes();
    }

    public static void Shapes()
    {
        Scanner input =new Scanner(System.in);
        int num;
        double r,l,b,h;
        System.out.println("Pick a Shape: \n" + "1.Square\n" + "2.Rectangle\n" + "3.Triangle\n" + "4.Circle\n");
        num= input.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("You selected a square");
                System.out.println("Enter its length");
                l=input.nextDouble();
                System.out.println("The area of this sqaure is " + l*l );
                break;

            case 2:
                System.out.println("You selected a rectangle");
                System.out.println("Enter its length and breadth");
                l=input.nextDouble();
                b=input.nextDouble();
                System.out.println("The area of this rectangle is " + l*b );
                break;

            case 3:
                System.out.println("You selected a triangle");
                System.out.println("Enter its breadth and height");
                b=input.nextDouble();
                h=input.nextDouble();
                System.out.println("The area of this triangle is " + ((1/2)*b*h));
                break;

            case 4:
                System.out.println("You selected a circle");
                System.out.println("Enter its radius");
                r=input.nextDouble();
                System.out.println("The area of this circle is " + 3.14 * r*r );
                break;

            default:
                System.out.println("Invalid shape!!!");
                break;
        }
    }
}
