/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author Jared
 */
abstract class person implements BirthDateCalculate {
    
    private String localFirst, localLast, localMiddle, localStreet1, localStreet2, localCity, localState, localZip, localCountry, localBirthday, localAge;
    
    name name;
    address address;
    
    public person(String first, String last, String middle, String street1, String street2, String city, String state, String zip, String country, String birthday){
     
        this.localFirst = first;
        this.localLast = last; 
        this.localMiddle = middle;
        this.localStreet1 = street1;
        this.localStreet2 = street2;
        this.localCity = city;
        this.localState = state;
        this.localZip = zip;
        this.localCountry = country;
        
        this.name = new name(localFirst, localLast, localMiddle);
        
        this.address = new address(localStreet1, localStreet2, localCity, localState, localZip, localCountry);
        
        this.localBirthday = birthday;
        
        
        
    }
    
    @Override
    public String calculateBirthday(){
        
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formmat1 = DateTimeFormatter.ofPattern("yyyy", Locale.ENGLISH);
        
        int year = Integer.parseInt(ldt.format(formmat1));

        int ageYear = Integer.parseInt(localBirthday.split("-")[0]);
        
        int intAge = year - ageYear;
        
        localAge = Integer.toString(intAge);
        
        return localAge;
    }
    
    public void setBirthday(String id){
        
        if (!id.equals("")){
            localBirthday = id;
        }
        
    }
    
    public String getBirthday(){
        return localBirthday;
    }
    
}
