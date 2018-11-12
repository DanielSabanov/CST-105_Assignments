// made by Daniel Sabanov
package guessinggame;

import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        
        int MAX_RANGE_OF_RANDOMIZER = 10000;
        int LOWEST_RANGE_OF_RANDOMIZER = 1;
        
        int randomNum;
        int numOfGuesses;
        int guessedNum;
        int upperLimit;
        int lowerLimit;
        
        randomNum = (int)(Math.random() * MAX_RANGE_OF_RANDOMIZER + LOWEST_RANGE_OF_RANDOMIZER);
        upperLimit = MAX_RANGE_OF_RANDOMIZER;
        numOfGuesses = 0;
        lowerLimit = LOWEST_RANGE_OF_RANDOMIZER;
        guessedNum = MAX_RANGE_OF_RANDOMIZER + 1;
        
        while(guessedNum != randomNum){
            
            System.out.println("Enter a guess between " + lowerLimit + " and " + upperLimit);
            guessedNum = convertInputToGuessNum(new Scanner(System.in));
            numOfGuesses++;
            
            if(guessedNum <= upperLimit && guessedNum >= lowerLimit){
                
                if(guessedNum > randomNum){
                    upperLimit = guessedNum;
                    System.out.println("LOWER");
                }
                
                if(guessedNum < randomNum){
                    lowerLimit = guessedNum;
                    System.out.println("HIGHER");
                }
                
            }else{
                
                System.out.println("The guessed number is out of range");
                
            }
          
        }
        
        System.out.println("You WIN. it took you " + numOfGuesses + " guesses.");
        
    }
    
    public static int convertInputToGuessNum(Scanner userInput){
        /*
        converts user input, which comes in a form of a Scanner, to 
        integer.
        */
        
        int newInteger = userInput.nextInt();
        
        return newInteger;
    }
    
}
