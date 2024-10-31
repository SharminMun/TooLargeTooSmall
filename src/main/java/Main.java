
import java.util.Scanner;
import java.util.Random;

/*
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
//        Boolean win = false;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int guessCount = 0;
        int randomNumber = random.nextInt(30) + 1;
        guess = scanner.nextInt();

        while (guess != randomNumber) {
            if (guess < randomNumber)
                System.out.println("Too low!");
               else if (guess > randomNumber)
        System.out.println("Too high!");
               else if (guess == randomNumber){
        System.out.println("correct");
    }

        guess = scanner.nextInt();
    }
}}
