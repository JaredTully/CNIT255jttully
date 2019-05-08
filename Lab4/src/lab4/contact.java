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
public class contact {
    
    private String email, phone;
        
    public contact(String emailTemp, String phoneTemp){
        this.email = emailTemp;
        this.phone = phoneTemp;
    }
    
    public String getPhone(){
        return phone;
    }
    
    public void setPhone(String temp){
        phone = temp;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void set(String temp){
        email = temp;
    }
    
}
