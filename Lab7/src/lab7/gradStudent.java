/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Jared
 */
public class gradStudent extends student {
    
    private String localThesis;
    
    private name advisorName;
    
    gradStudent(String first, String last, String middle, String street1, String street2, String city, String state, String zip, String country, String birthday, String major, String favoriteClass, String gradDate, Boolean hogYN, String PUID, String thesisTitle, String advisorFirstName, String advisorLastName){
        super(first, last, middle, street1, street2, city, state, zip, country, birthday, major, favoriteClass, gradDate, hogYN, PUID);
        
        this.localThesis = thesisTitle;
        
        this.advisorName = new name(advisorFirstName, advisorLastName, "");
        
    }
    
    public void setAdvisorFirstName(String temp){
        
        if (!temp.equals("")){
            advisorName.setFirst(temp);
        }
        
    }
    
    public String getAdvisorFirstName(){
        return advisorName.getFirst();
    }
    
    public void setAdvisorLastName(String temp){
        
        if (!temp.equals("")){
            advisorName.setLast(temp);
        }
        
    }
    
    public String getAdvisorLastName(){
        return advisorName.getLast();
    }
    
    public void setThesis(String temp){
        
        if (!temp.equals("")){
            localThesis = temp;
        }
        
    }
    
    public String getThesis(){
        return localThesis;
    }
    
}
