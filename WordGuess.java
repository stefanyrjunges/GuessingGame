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

    //setter
    public void setUserInput(char userInput){
        this.userInput = userInput;
    }
    
    //setter
    public void setSecretWord(String[] secretWord) {
        this.secretWord = secretWord;
    }
    
    public void compute(){
    
        //picking a random word from the array
        randomWord = secretWord[(int) (Math.random()*secretWord.length)];
        
        //initializing sb
        sb = new StringBuffer();
        
            //appending * in the random word chosen
            for (int i = 0; i < randomWord.length(); i++){
                sb.append('*');
            }
        
        //converting word to string
        revealWord = sb.toString();
        
        //initializing variables for guesses and while loop
        count = 6; //will decrease throughout the game
        
        System.out.println("The word is: " + revealWord + " You have 6 chances to guess a letter.");
        //for testing: System.out.println(randomWord);
        
        //while found = false and count is more than 0
        while (!found && count > 0){
        //resetting correctGuess so each guess starts as false
        correctGuess = false;
        System.out.println("Enter a letter.");
        userInput = scan.next().toLowerCase().charAt(0);
        
            //comparing user input to the current letter in the secret word
            //if its the same, replace
            for (int i = 0; i < randomWord.length(); i++){
                if (userInput == randomWord.charAt(i)){
                    //replacing character
                    sb.setCharAt(i, userInput);
                    //guess was correct, so true
                    correctGuess = true;
                }
             }
                //converting to string
                revealWord = sb.toString();
                
                if (revealWord.equals(randomWord)){
                    System.out.println("Congrats! You did it! The word was " + randomWord);
                    found = true;
                    //stop the loop
                    break;
                }
                
                //if guess was correct but the word still hasnt been found
                if (correctGuess && !revealWord.equals(randomWord)){
                    System.out.println("Nice! Keep going! " + revealWord);
                    
                //if guess wasnt correct
                } else if (!correctGuess) {
                    count--;
                    System.out.println("Not really! You've got " + count + " chances!");}
            
                //stopping the game if the word wasnt found and count = 0
                if (!found && count == 0){
                    System.out.println("Sorry, you ran out of guesses :(");
                }
                
    }
        
    }

    //getter
    public String getRevealWord() {
        return revealWord;
    }
}