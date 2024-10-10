package wordguess;
import java.util.Scanner;
public class WordGuessApp {

    public static void main(String[] args) {
       
        String[] secretWord = {"house", "duck", "java", "vscode"};
        boolean keepPlaying = true;
        WordGuess wg = new WordGuess();
        Scanner scan = new Scanner(System.in);

        wg.setSecretWord(secretWord);

        while (keepPlaying) {
            wg.initalize();

            System.out.println("The word is: " + wg.getRevealWord() + " You have 6 chances to guess a letter.");

            while (!wg.isFound() && wg.getCount() > 0) {
                System.out.println("Enter a letter.");
                char userInput = scan.next().toLowerCase().charAt(0);

                wg.setUserInput(userInput);
                wg.compute();
                
                    if (wg.isCorrectGuess() && !wg.getRevealWord().equals(wg.getRandomWord())){
                        System.out.println("Nice! Keep going! " + wg.getRevealWord());
                    } else if (!wg.isCorrectGuess()){
                        System.out.println("Not really! You've got " + wg.getCount() + " chances!");
                    }

        }

                if (wg.isFound()) {
                    System.out.println("Congrats! You did it! The word was " + wg.getRevealWord());
                } else if (!wg.isFound() && wg.getCount() == 0) {
                    System.out.println("Sorry, you ran out of guesses. The word was " + wg.getRevealWord());
                }
    
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scan.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                keepPlaying = false;
            }
        }
        scan.close();
    }
}
