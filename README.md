<h1>Guessing Game</h1>

<p>This repository contains a simple Java-based <strong>Word Guess Game</strong> where players try to guess a randomly selected word by entering one letter at a time. The player has a limited number of attempts to guess the word correctly.</p>

<h2>Features</h2>

<ul>
    <li>A random word is chosen from a predefined list of words.</li>
    <li>The word is hidden by * symbols, with correct guesses revealing the corresponding letters.</li>
    <li>The player has 6 attempts to guess the word correctly.</li>
    <li>Incorrect guesses reduce the player's remaining attempts.</li>
    <li>Feedback is provided on whether the guess was correct, and the game informs the player when they win or lose.</li>
</ul>

<h2>Project Files</h2>

<p>The project consists of two Java files:</p>
<ul>
    <li><strong>WordGuess.java</strong>: Contains the main logic for the game. Manages word selection, user input, and game progression. Handles incorrect and correct guesses, and updates the word reveal as the player guesses.</li>
    <li><strong>WordGuessApp.java</strong>: Entry point of the application. Starts the game by invoking the methods in <em>WordGuess.java</em>.</li>
</ul>

<h2>How to Run</h2>

<h3>Prerequisites</h3>

<p><strong>Java:</strong> Ensure you have Java Development Kit (JDK) installed on your machine. You can download it from <a href="https://www.oracle.com/java/technologies/javase-jdk11-downloads.html">here</a>.</p>

<h3>Running the Game</h3>

<p><strong>Clone the Repository:</strong></p>
<pre>
git clone https://github.com/your-username/word-guess-game.git
cd word-guess-game
</pre>

<p><strong>Compile the Code:</strong></p>
<pre>
javac wordguess/*.java
</pre>

<p><strong>Run the Game:</strong></p>
<pre>
java wordguess.WordGuessApp
</pre>

<h2>Example Gameplay</h2>
<pre>
The word is: **** You have 6 chances to guess a letter.
Enter a letter:
&gt; a
Not really! You've got 5 chances!
Enter a letter:
&gt; e
Nice! Keep going! **e*
Enter a letter:
&gt; t
Congrats! You did it! The word was "test"
</pre>

<h2>License</h2>

<p>This project is open source and available under the <a href="LICENSE">MIT License</a>.</p>
