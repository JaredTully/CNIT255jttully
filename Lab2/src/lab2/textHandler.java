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
public class textHandler {
    
    private String userString;
    private String searchString = "";
    private String removeString = "";
    private String insertString = "";
    private int insertWhere = 0;
    
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
    
    public boolean palindrome() 
    {
        
        String temp = userString;
        
        for (int x = 0; x <= temp.length()/2; x++)
        {
        
            if (temp.charAt(x) != temp.charAt(temp.length() - 1 - x))
            {
                
                return false;
            
            }
        
        }
        
        return true;
        
    }

    private boolean palindromeCheck(String temp) 
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

    public void findAllPalindromes() 
    {
        String str = userString;
        
        for (int x = 0; x <= str.length(); x++)
        {
            
            for (int j = x; j < str.length();j++)
            {
                
                if (palindromeCheck(str.substring(x, j+1)))
                {
                    
                    if ((str.substring(x, j+1)).length() > 1){
                    
                        System.out.println(str.substring(x, j+1));
                
                    }
                }
            }
        }
    }
    
    public void setSearchString(String search)
    {
    
        if (!search.equals("")){
            searchString = search;
        }
    
    }
    
    public int searchText()
    {
        
        int endIndex = 0;
        int num = 0;
        
        while (endIndex != -1){
            
            endIndex = userString.indexOf(searchString, endIndex);
            
            if(endIndex != -1){
                num++;
                endIndex = endIndex + searchString.length();
            }
            
        }
     
        return num;
        
    }
    
    public void setRemoveString(String input)
    {
        
        if (!input.equals("")){
            removeString = input;
        }
        
    }
    
    public String removeText(){
        
        String output = userString.replaceAll(removeString, "");
        
        return output;
        
    }
    
    public void setInsertString(String input)
    {
        
        if (!input.equals("")){
            insertString = input;
        }
        
    }
    
    public void setWhereInsert(int input)
    {
    
        if (input > -1){
            insertWhere = input;
        }
    
    }
    
    public String addText()
    {
        
        String temp = "";
        
        temp = userString.substring(0, insertWhere) + insertString + userString.substring(insertWhere);
        
        //StringBuilder temp = new StringBuilder(userString);
        //temp = temp.insert(insertWhere, insertString);
        return temp;
        
    }
   
    public String reverseText()
    {
        
        String reverse = new StringBuffer(userString).reverse().toString(); 
        
        return reverse;
        
    }
    
    public String reverseEachWord()
    {
    
        String output = "";
        
        String[] words = userString.split("\\s+");
        
        for (int x = 0; x < words.length; x++) 
        {
            words[x] = words[x].replaceAll("[^\\w]", "");
        }
        
        for (int x = 0; x < words.length; x++)
        {
            
            String reverse = new StringBuffer((words[x])).reverse().toString();
            output = output + " " + reverse;
        }
        
        
        return output;
    }
}