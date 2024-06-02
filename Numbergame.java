// Name = Areesha Kaleem
// Roll no = 2022-CE-15

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Guess_number {
    private int guesses = 10;
    private int guessed;
    private ArrayList<Integer> arr = new ArrayList<>();
    private int ran;
    private int warning = 1;

    public void game() {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        this.ran = rn.nextInt(1000);
        System.out.println("Welcome to the Number guessing game!");
        System.out.println("I am thinking of a number between 0-1000.");
        System.out.println("You have 1 warning.");
        System.out.println("------------");
        System.out.println("You have 10 guesses left.");
        System.out.println("guessed numbers: ");
        while(guesses > 0) {
            System.out.print("\nPlease guess a number: ");
            this.guessed = sc.nextInt();
            arr.add(guessed);
            guesses -= 1;
            if(guesses == 0 && guessed != ran){
                System.out.println("Try better next time.You lost!");
            }
            if (guessed < ran && guessed > 0) {
                System.out.println("your guess is smaller");
                System.out.println("------------");
                System.out.printf("You have %d guesses left", guesses);
                System.out.println();
                System.out.print("You have guessed: ");
                for (int ele:arr){
                    System.out.print(ele+" ");
                }
            } else if (guessed > ran && guessed <= 1000) {
                System.out.println("your guess is bigger");
                System.out.println("------------");
                System.out.printf("You have %d guesses left", guesses);
                System.out.println();
                System.out.print("You have guessed: ");
                for (int ele:arr){
                    System.out.print(ele+" ");
                }
            }
            else if(guessed == ran){
                System.out.println("Correct guess,You won!");
                break;
            }
            else if(guessed<0 && warning == 1){
                warning-=1;
                System.out.println("You lost the warning. Next time guesses will start reducing.");
                System.out.println("------------");
                System.out.print("You have guessed: ");
                for (int ele:arr){
                    System.out.print(ele+" ");
                }
            }
            else{
                guesses-=1;
                System.out.println("------------");
                System.out.printf("You have %d guesses left",guesses);
                System.out.println();
                System.out.print("You have guessed: ");
                for (int ele:arr){
                    System.out.print(ele+" ");
                }
            }
        }
    }
}


public class Numbergame {
    public static void main(String[] args) {
        Guess_number gn = new Guess_number();
        gn.game();
    }
}
