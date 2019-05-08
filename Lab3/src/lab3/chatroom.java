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
public class chatroom {

    public person person1 = new person();
    public person person2 = new person();
    
    private person currentPerson = null;
    private person reciever = null;
    private String currentMessage = "";
    private String currentQuestion = "";
    
    public void setPerson(person pers){
        currentPerson = pers;
    }
    
    public person getPerson(){
        return currentPerson;
    }
    
    public void setRec (person rec){
        reciever = rec;
    }
    
    public person getRec(){
        return reciever;
    }
    
    public void setMessage(String msg){
        currentMessage = msg;
    }
    
    public String getMessage(){
        return currentMessage;
    }
    
    public void setQuestion(String quest){
        currentQuestion = quest;
    }
    
    public String getQuestion(){
        return currentQuestion;
    }
    
}