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
public class palin {
    
    public static boolean palindrome(String temp) 
    {
        
        for (int x = 0; x <= temp.length()/2; x++)
        {
        
            if (temp.charAt(x) != temp.charAt(temp.length() - 1 - x))
            {
                
                return false;
            
            }
        
        }
        
        return true;
        
    }

    public static void findAllPalindromes(String str) 
    {
        
        for (int x = 0; x <= str.length(); x++)
        {
            
            for (int j = x; j < str.length();j++)
            {
                
                if (palindrome(str.substring(x, j+1)))
                {
                    
                    if ((str.substring(x, j+1)).length() > 1){
                    
                        System.out.println(str.substring(x, j+1));
                
                    }
                }
            }
        }
    }

}