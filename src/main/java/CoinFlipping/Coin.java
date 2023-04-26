package CoinFlipping;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Coin {
    int coin;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    public void FlipTheCoin(){
        while (true){
            coin = random.nextInt(2);
            System.out.println("Coin has been flipped.");
            System.out.println("Heads or tails?");
            String answer = scanner.nextLine();
            if (answer.toLowerCase().contains("quit") || answer.toLowerCase().contains("off") || answer.toLowerCase().contains("stop")){
                System.out.println("Goodbye!");
                break;
            }
            if (coin == 0 && answer.toLowerCase().contains("heads")){
                System.out.println("...HEADS! well done.");
            } else if (coin == 1 && answer.toLowerCase().contains("tails")) {
                System.out.println("...TAILS! Well done.");
            } else {
                System.out.println("Sorry try again");
            }
        }
    }
}
