/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

import java.util.*;

/**
 *
 * @author Jared
 */
public class GuessingGame {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
               
        Fraction frac = new Fraction(2, 1);        
        
    }
    
    public static void guessingGame() {
        String guesses = "";
        Random random = new Random();
        int randomNum = (random.nextInt(2001) -1000);
        
        System.out.println(randomNum);
    
        int count = 8;        
        while(count >= 0) {
            System.out.print("Enter a guess: ");
            Scanner scan = new Scanner(System.in);
            
            int guess;
            
            String temp = scan.nextLine();
            
            if(temp.equals("exit")) {
                System.out.println("Exited game.");
                break;
            }
            else{
                guess = Integer.parseInt(temp);
            }
            
            while(count >= 0){
                if (count == 0) {
                    if (guess == randomNum) {
                        System.out.println("Congrats! You guessed correctly.");
                    }
                    else {
                        System.out.println("Incorrect.  You have run out of tries! You lost.");
                    }
                }
                
                else if (guess == randomNum){
                    System.out.println("Congrats! You guessed correctly.");
                    guesses = guesses + "," + guess;
                    System.out.println("Your guesses were: " + guesses.substring(1));
                    break;
                }
                else if(guess > randomNum) {
                    System.out.println("Answer is too big!  Try again.  You have: " +count + " more tries");
                    guesses = guesses + "," + guess;
                }
                else if (guess < randomNum) {
                    System.out.println("Answer is too small!  Try again.  You have: " +count + " more tries");
                    guesses = guesses + "," + guess;                    
                }                    
                else {
                    break;
                }
                count--;
        }
    }
        
    }
    
}
