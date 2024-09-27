
package wordguess;

/**
 *
 * @author stefa
 */
public class WordGuessApp {

    public static void main(String[] args) {
       
        String[] secretWord = {"house", "duck", "java", "vscode"};
        WordGuess wg = new WordGuess();

        wg.setSecretWord(secretWord);
        wg.compute();
        wg.getRevealWord();    
        
    }
    
}
