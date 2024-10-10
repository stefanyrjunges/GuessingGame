package wordguess;
public class WordGuess {
    
    private String[] secretWord;
    private char userInput;
    private String randomWord, revealWord;
    private boolean found, correctGuess;
    private int count;
    StringBuffer sb;
    
    public WordGuess() {
    }

    //setter
    public void setUserInput(char userInput){
        this.userInput = userInput;
    }
    
    public void setSecretWord(String[] secretWord){
        this.secretWord = secretWord;
    }


    public void initalize(){
        randomWord = secretWord[(int) (Math.random()*secretWord.length)];
        System.out.println(randomWord);

        //initializing sb
        sb = new StringBuffer();

            for (int i = 0; i < randomWord.length(); i++){
                sb.append('*');
            }
        
        revealWord = sb.toString();
        count = 6;
        found = false;
        
    }

    public void compute(){
            correctGuess = false;
            setUserInput(userInput);
            
                for (int i = 0; i < randomWord.length(); i++){
                    if (userInput == randomWord.charAt(i)){
                        sb.setCharAt(i, userInput);
                        correctGuess = true;
                    }
                }

                    revealWord = sb.toString();
                    
                    if (revealWord.equals(randomWord)){
                        found = true;
                    }
                    
                    if (!correctGuess) {
                         count--;}   
    }

    public String getRevealWord() {
        return revealWord;
    }

    public String getRandomWord() {
        return randomWord;
    }

    public boolean isCorrectGuess(){
        return correctGuess;
    }

    public int getCount(){
        return count;
    }

    public boolean isFound(){
        return found;
    }

}
