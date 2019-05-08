/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Jared
 */
public class name {
    
    private String firstName = "";
    private String lastName = "";
    private String middleI = "";
    
    public name(String first, String last, String middle){
        
        this.firstName = first;
        this.middleI = middle;
        this.lastName = last;
        
    }
    
        public void setFirst(String first){
        
        if (!first.equals("")){
            firstName = first;
        }
        
    }
    
    public String getFirst(){
        return firstName;
    }
    
    public void setLast(String last){
        
        if(!last.equals("")){
            lastName = last;
        }
        
    }
    
    public String getLast(){
        return lastName;
    }
    
    public void setMiddle(String middle){
        
        if (!middle.equals("")){
            middleI = middle;
        }
        
    }
    
    public String getMiddle(){
        return middleI;
    }
    
}
