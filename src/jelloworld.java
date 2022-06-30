import java.util.Random;
import java.util.Scanner;
public class jelloworld {
    static Random r = new Random();
    static Scanner keyboard = new Scanner(System.in);
    static boolean guessRight = false;
    static int num = r.nextInt(100)+1;
    static int totalGuesses = 0;
    public static void eatsU(int arr[]) {
        for (int i : arr) {
            if (i < num) {
                System.out.println("cold");
                totalGuesses++;
            }
            else if (i > num) {
                System.out.println("hot");
                totalGuesses++;
            }
            else {
                System.out.println("Just right");
                totalGuesses++;
                guessRight = true;
                break;
            }
        }
    }
    public static void main(String[] args) {
        int numGuesses = 5;
        while(guessRight == false) {
            int guesses[] = new int[numGuesses];
            for (int i = 0; i < guesses.length; i++) {
                System.out.print("Enter guess: ");
                guesses[i] = keyboard.nextInt();
            }
            eatsU(guesses);
        }
        System.out.println("Guessed in "+totalGuesses+" tries");
    }
}
