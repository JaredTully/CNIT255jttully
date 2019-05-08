/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Jared
 */
public class person {
    
    public name name = new name();
    
    private String PUID = "";
    
    private String message = "";
    
    private String question = "";
    
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
