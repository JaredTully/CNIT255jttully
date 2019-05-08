/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclasssep17;

import java.util.*;

/**
 *
 * @author Jared
 */
public class InClassSep17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a first name: ");
        person jared = new person();
        String first = in.nextLine();
        jared.name.firstName() = first;
    }
    
}
