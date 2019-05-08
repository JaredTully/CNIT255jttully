/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scratch;

import java.util.*;

/**
 *
 * @author Jared
 */
public class Scratch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String userString;
        Scanner in = new Scanner(System.in);
        
        userString = in.next();
        //System.out.println(userString);
        
        palin pal = new palin();

        pal.findAllPalindromes(userString);
                
    }
    
}

