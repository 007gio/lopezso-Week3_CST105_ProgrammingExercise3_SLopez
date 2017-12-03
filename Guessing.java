/** Program: Guessing
* File: Guessing.java
* Summary: User will need to guess the correct random number between 1 and 10000.
* Author: Sergio M. Lopez
* Date: December 3, 2017 
**/

package guessing;

import java.util.Random;
import java.util.Scanner;

public class Guessing {
    
    public static final Random RANDOM = new Random();
    public static final int MAX_NUMBER = 10000;//the max number will never surpass 10,000.
    
    public static void main(String[] args) {
        //Variables
        int numberToFind = RANDOM.nextInt(MAX_NUMBER) + 1;
        Scanner userInput = new Scanner(System.in);
        int numberGuesses = 0, userGuess = 0;
        
        //logic and while loop
        //prompts users to guess a random number between 1 and 10,000.
        while (userGuess != numberToFind) {
            System.out.println("Guess a number between 1 and " + MAX_NUMBER + " : ");
            userGuess = userInput.nextInt();
            numberGuesses++;
            
            //user will receive an output of HIGHER if guess is smaller and output of LOWER if guess is larger.
            if (userGuess < 1 || userGuess > MAX_NUMBER) {
                System.out.println("Make sure the number you enter is between 1 and " + MAX_NUMBER);      
            } else if (userGuess > numberToFind) {
                System.out.println("LOWER ");
            } else if (userGuess < numberToFind) {
                System.out.println("HIGHER ");
            }         
        }
        
        userInput.close();
        //once the user guesses correctly it will display winning message and how many guesses it had taken them.
        System.out.println("You WIN.  It took you " + numberGuesses + " guesses.");                
	
}

}
