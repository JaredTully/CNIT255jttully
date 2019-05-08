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
public class person {
    
    private String PUID = "";
    
    private String message = "";
    
    private String question = "";
    
    private String localFirst, localLast, localMiddle, localPUID, localEmail, localPhone, localStreet1, localStreet2, localCity, localState, localZip, localCountry;
    
    name name;
    address address;
    contact contact;
    
    public person(String first, String last, String middle, String PUID, String email, String phone, String street1, String street2, String city, String state, String zip, String country){
        
        this.localFirst = first;
        this.localLast = last; 
        this.localMiddle = middle;
        this.localPUID = PUID;
        this.localEmail = email;
        this.localPhone = phone;
        this.localStreet1 = street1;
        this.localStreet2 = street2;
        this.localCity = city;
        this.localState = state;
        this.localZip = zip;
        this.localCountry = country;
     
        this.name = new name(localFirst, localLast, localMiddle);
        
        this.address = new address(localStreet1, localStreet2, localCity, localState, localZip, localCountry);
        
        this.contact = new contact(localEmail, localPhone);
        
    }
    
    public void setPUID(String id){
        
        if (!id.equals("")){
            PUID = id;
        }
        
    }
    
    public String getPUID(){
        return PUID;
    }
    
    public void sendMessage(String messa){
        message = messa;
    }
    
    public String receiveMessage(){
        return message;
    }

    public void sendQuestion(String quest){
        question = quest;
    }
    
    public String receiveQuestion(){
        return question;
    }   
    
}
