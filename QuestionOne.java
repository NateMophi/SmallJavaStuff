import java.util.*;

public class QuestionOne {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int num = rand.nextInt(10 - 1 + 1) + 1;
        int guessNum = 0;
        int guess = 0;

        System.out.println("Guess a number from 1-10: ");
        while (true) {

            guess = input.nextInt();
            guessNum++;
            if (guess == num) {
                break;
            } else {
                System.out.println("Try again!");
            }
        }

        System.out.println(
                "You got the number! The number is " + guess + " and the number of tries taken is " + guessNum);
        input.close();
    }

}