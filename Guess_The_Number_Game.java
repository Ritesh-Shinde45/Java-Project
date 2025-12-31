import java.util.Scanner;
import java.util.Random;


public class Guess_The_Number_Game {
    public static void main(String[] aargs){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int input_num = 0;
        int guessed_num = random.nextInt(100);
        int score = 1;

        do { 
            
            System.out.print("Enter nuber below 100: ");
            input_num = scanner.nextInt();

            if (input_num == guessed_num) {
                System.out.println("Correct Guess !!!");
            }else if(input_num > guessed_num){
                System.out.println("Choose Lower");
            }else{
                System.out.println("Choose Higher");
            }

            score++;
        } while (input_num != guessed_num);

        System.out.println("Your Score is: " + score);

    }
}