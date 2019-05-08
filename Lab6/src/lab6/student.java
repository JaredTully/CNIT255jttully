/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Jared
 */
public class student extends person {
    
    private String localMajor, localFavClass, localGradDate;
    
    private Boolean localHogYN;
    
    student(String first, String last, String middle, String street1, String street2, String city, String state, String zip, String country, String birthday, String major, String favoriteClass, String gradDate, Boolean hogYN){
        
        super(first, last, middle, street1, street2, city, state, zip, country, birthday);
        
        this.localMajor = major;
        this.localFavClass = favoriteClass;
        this.localGradDate = gradDate;
        this.localHogYN = hogYN;
        
    }
    
    public void setMajor(String temp){
        
        if (!temp.equals("")){
            localMajor = temp;
        }
        
    }
    
    public String getMajor(){
        return localMajor;
    }
    
    public void setFavoriteClass(String temp){
        
        if (!temp.equals("")){
            localFavClass = temp;
        }
        
    }
    
    public String getFavoriteClass(){
        return localFavClass;
    }
    
    public void setGradDate(String temp){
        
        if (!temp.equals("")){
            localGradDate = temp;
        }
        
    }
    
    public String getGradDate(){
        return localGradDate;
    }
    
    public void set(Boolean temp){
        
        localHogYN = temp;
        
    }
    
    public Boolean getHogYN(){
        return localHogYN;
    }
    
}
