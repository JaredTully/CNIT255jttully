/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.*;

/**
 *
 * @author Jared
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        textHandler inputString = new textHandler();
        
        Scanner in = new Scanner(System.in);
        
        String userChoice = "1";
        
        String input = "";
        
        do{
            if (userChoice.equals("1")){
                System.out.print("Please enter any text: ");
                input = in.nextLine();
                inputString.setString(input);
            }
            
            System.out.println("");
            System.out.println("1. Check input as palindrome");
            System.out.println("2. Find all palindromes");
            System.out.println("3. Search the text");
            System.out.println("4. Remove some text");
            System.out.println("5. Add some text");
            System.out.println("6. Reverse some text");
            System.out.println("7. Reverse each word");
            System.out.println("");
            System.out.print("Which operation number would you like to perform? ");
            String userSelection = in.nextLine();
            
            if (userSelection.equals("1")){
                System.out.println("The string given is a palandrome: " + inputString.palindrome());
            }
            if (userSelection.equals("2")){
                inputString.findAllPalindromes();
            }
            if (userSelection.equals("3")){
                System.out.print("Enter the text you would like to search for: ");
                String temp = in.nextLine();
                inputString.setSearchString(temp);
                System.out.println("That string appears " + inputString.searchText() + " time(s).");
            }
            if (userSelection.equals("4")){
                System.out.print("Enter the text you would like to remove: ");
                String temp = in.nextLine();
                inputString.setRemoveString(temp);
                System.out.println(inputString.removeText());
            }
            if (userSelection.equals("5")){
                System.out.print("Enter the text you would like to add: ");
                String temp = in.nextLine();
                System.out.print("Enter an index where you would like to insert your text: ");
                int tempDex = in.nextInt();
                //in.next();
                inputString.setInsertString(temp);
                inputString.setWhereInsert(tempDex);
                System.out.println(inputString.addText());
                in.nextLine();
            }
            if (userSelection.equals("6")){
                System.out.println(inputString.reverseText());
            }
            if (userSelection.equals("7")){
                System.out.println(inputString.reverseEachWord());
            }
            
            System.out.println("");
            System.out.println("What would you like to do next?");
            System.out.println("1. Enter new text to manipulate");
            System.out.println("2. Do a different operation on the current text");
            System.out.println("3. Exit the program");
            System.out.print("Enter a number: ");
            userChoice = in.nextLine();
            
        }while(!userChoice.equals("3"));
        
    }
    
}