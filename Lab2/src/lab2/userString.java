/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Jared
 */
public class userString {
    
    private String userString;
    
    public void setString(String input)
    {
        if (!input.equals("")){
            userString = input;
        }
    }
    
    public String getString()
    {
        
        return userString;
        
    }
    
}
