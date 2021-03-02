/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Luan Navarro
 */
public class Homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // Turns on the scanner.
        Random rand = new Random();              // Turns on the generator of the random number
        int[] storedGuesses = new int[10];       // Array "storedGuesses" created with 10 slots
        int numberOfGuesses, guess;              // Variables numberOfGuesses and guess (user input)
        int i = 0;                               // Variable created to loop the storedGuesses in order to always add the next guess into the array
        
        int randomNumber = rand.nextInt((99 - 0) + 1) + 0; // Random number characteristics (< 100 && > 0)
        
        System.out.println("An integer less than 100 has been randomly picked, you have 10 guesses. Good Luck!"); // System gives the rules of the guessing game
        
        for (numberOfGuesses = 0; numberOfGuesses < 10; numberOfGuesses++, i++) { //Loop
            System.out.println("Guess the number"); // System asks the user for a guess
            guess = sc.nextInt(); // User input is stored in the variable "guess"
        
            if (guess == randomNumber) { // If guess is the same as the number generated it will print a victory!
            System.out.println("You win");
            break;
            }
            
            for (int n : storedGuesses) { // Used to check if the number guessed was previously guessed
                if (n == guess) {
                boolean found= true;
                System.out.println("That was a waste – you already guessed that number!");                
                }
            }
            
            if (guess != randomNumber) { // If guess differs from the number generated it will print a message asking to retry
            System.out.println("That is not the correct number, try again!");
            storedGuesses[i] = guess;
            }
        }
        
        if (numberOfGuesses == 10) { // If numberOfGuesses exceeds 10 the program will end.
            System.out.println("Hard luck! The correct number was: " + randomNumber + "!"); // System will print the correct number
            System.out.println("These were your guesses: " + Arrays.toString(storedGuesses)); // System will print all guesses stored
        }
    }  
}
