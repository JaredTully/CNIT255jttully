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
public class address {
    
private String streetAddress, streetAddress2, city, state, zipCode, country;

    public address(String street1, String street2, String cityLocal, String stateLocal, String zip, String countryLocal){
        
        this.streetAddress = street1;
        this.streetAddress2 = street2;
        this.city = cityLocal;
        this.state = stateLocal;
        this.zipCode = zip;
        this.country = countryLocal;
        
    }
    
    public String getStreet1(){
        return streetAddress;
    }
    
    public void setStreet1(String street){
        streetAddress = street;
    }
    
    public String getStreet2(){
        return streetAddress2;
    }
    
    public void setStreet2(String street){
        streetAddress2 = street;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String temp){
        city = temp;
    }
    
    public String getState(){
        return state;
    }
    
    public void setState(String temp){
        state = temp;
 
    }
    
    public String getZip(){
        return zipCode;
    }
    
    public void setZip(String temp){
        zipCode = temp;
    }
    
    public String getCountry(){
        return country;
    }
    
    public void setCountry(String temp){
        country = temp;
    }
    
}
