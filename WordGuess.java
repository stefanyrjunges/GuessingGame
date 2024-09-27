package wordguess;

import java.util.Scanner;

public class WordGuess {
    
    private String[] secretWord;
    private char userInput;
    private String randomWord, revealWord;
    private boolean found, correctGuess;
    private int count;
    StringBuffer sb;
    Scanner scan = new Scanner(System.in);
    
    public WordGuess() {
    }

    public void setUserInput(char userInput){
        this.userInput = userInput;
    }
    
    public void setSecretWord(String[] secretWord) {
        this.secretWord = secretWord;
    }
    
    public void compute(){
    
        randomWord = secretWord[(int) (Math.random()*secretWord.length)];
        sb = new StringBuffer();
        
            for (int i = 0; i < randomWord.length(); i++){
                sb.append('*');
            }
        
        revealWord = sb.toString();
        count = 6;
        System.out.println("The word is: " + revealWord + " You have 6 chances to guess a letter.");
        
            while (!found && count > 0){
                correctGuess = false;
                System.out.println("Enter a letter.");
                userInput = scan.next().toLowerCase().charAt(0);
                
                    for (int i = 0; i < randomWord.length(); i++){
                        if (userInput == randomWord.charAt(i)){
                            sb.setCharAt(i, userInput);
                            correctGuess = true;
                        }
                     }
                        
                    revealWord = sb.toString();
                        
                    if (revealWord.equals(randomWord)){
                        System.out.println("Congrats! You did it! The word was " + randomWord);
                        found = true;
                        break;
                    }
                        
                    if (correctGuess && !revealWord.equals(randomWord)){
                        System.out.println("Nice! Keep going! " + revealWord);
                            
                    } else if (!correctGuess) {
                        count--;
                        System.out.println("Not really! You've got " + count + " chances!");
                    }
                    
                    if (!found && count == 0){
                        System.out.println("Sorry, you ran out of guesses :(");
                    }     
            }
    }

    public String getRevealWord() {
        return revealWord;
    }
}
