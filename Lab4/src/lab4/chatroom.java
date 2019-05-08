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
public class chatroom {
    
    private String p1First, p1Last, p1Mi, p1PUID, p1Email, p1Phone, p1Strt, p1Strt2, p1City, p1State, p1Zip, p1Country; 
        
    private String p2First, p2Last, p2Mi, p2PUID, p2Email, p2Phone, p2Strt, p2Strt2, p2City, p2State, p2Zip, p2Country;
    
    public person person1, person2;
    
    public chatroom(String oneFir, String oneLas, String oneMi, String onePUID, String oneEma, String onePho, String oneStrtOne, String oneStrtTwo, String oneCity, String oneState, String oneZip, String oneCountry, String twoFir, String twoLas, String twoMi, String twoPUID, String twoEma, String twoPho, String twoStrtOne, String twoStrtTwo, String twoCity, String twoState, String twoZip, String twoCountry){
        
        p1First = oneFir;
        p1Last = oneLas;
        p1Mi = oneMi;
        p1PUID = onePUID;
        p1Email = oneEma;
        p1Phone = onePho;
        p1Strt = oneStrtOne;
        p1Strt2 = oneStrtTwo;
        p1City = oneCity;
        p1State = oneState;
        p1Zip = oneZip;
        p1Country = oneCountry;
        
        p2First = twoFir;
        p2Last = twoLas;
        p2Mi = twoMi;
        p2PUID = twoPUID;
        p2Email = twoEma;
        p2Phone = twoPho;
        p2Strt = twoStrtOne;
        p2Strt2 = twoStrtTwo;
        p2City = twoCity;
        p2State = twoState;
        p2Zip = twoZip;
        p2Country = twoCountry;
     
        person1 = new person(p1First, p1Last, p1Mi, p1PUID, p1Email, p1Phone, p1Strt, p1Strt2, p1City, p1State, p1Zip, p1Country);
        person2 = new person(p2First, p2Last, p2Mi, p2PUID, p2Email, p2Phone, p2Strt, p2Strt2, p2City, p2State, p2Zip, p2Country);
        
    }
    
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
