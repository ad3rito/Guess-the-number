import java.util.Random;
import java.util.Scanner;

public class AdivinhaNum {
    
    public static void main (String[] args){

        Random rand = new Random();
        int numAdv = rand.nextInt(100);
        int numTent = 0;
        Scanner input = new Scanner (System.in);
        int guess;
        boolean win = false;

        while (win == false){
            System.out.printf("Adivinhe um numero entre 1 a 100 : ");
            guess = input.nextInt();
            numTent++;

            if (guess == numAdv) {
                win = true;
            }
            else if (guess < numAdv) {
                System.out.println("Muito baixo");
            }
            else if (guess > numAdv) {
                System.out.println("Muito alto");
            }
        }
        System.out.println("Tu ganhaste!");
        System.out.println("O numero era o " + numAdv);
        System.out.println("Levou-te " + numTent + " tentativas");
    }
}