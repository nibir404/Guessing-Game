import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String secretWord = "Fuck You";
        String guess ="";
        int count = 0;
        int guessLimit=3;
        boolean outOfGuesses = false;

        while (!guess.equals(secretWord) && !outOfGuesses){

            if (count < guessLimit){
                System.out.print("Enter a guess : ");
                guess = input.nextLine();
                count++;
            } else {
                outOfGuesses = true;
            }
        }
        if (outOfGuesses){
            System.out.println("You Lose!! No more guesses");
        }
        System.out.println("You Win!!!");
    }
}
