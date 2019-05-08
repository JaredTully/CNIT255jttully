/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.*;

/**
 *
 * @author Jared
 */
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        chatroom chat = new chatroom();
        
        Scanner in = new Scanner(System.in);
        
        String temp = "";
        
        System.out.print("Please enter the first name of the first chat user: ");
        temp = in.nextLine();
        chat.person1.name.setFirst(temp);
        
        System.out.print("Please enter the last name of the first chat user: ");
        temp = in.nextLine();
        chat.person1.name.setLast(temp);
     
        System.out.print("Please enter the middle initial of the first chat user: ");
        temp = in.nextLine();
        chat.person1.name.setMiddle(temp);
        
        System.out.print("Please enter the PUID of the first chat user: ");
        temp = in.nextLine();
        chat.person1.setPUID(temp);
        
        System.out.print("Please enter the first name of the second chat user: ");
        temp = in.nextLine();
        chat.person2.name.setFirst(temp);
        
        System.out.print("Please enter the last name of the second chat user: ");
        temp = in.nextLine();
        chat.person2.name.setLast(temp);
     
        System.out.print("Please enter the middle initial of the second chat user: ");
        temp = in.nextLine();
        chat.person2.name.setMiddle(temp);
        
        System.out.print("Please enter the PUID of the second chat user: ");
        temp = in.nextLine();
        chat.person2.setPUID(temp);
        
        int x = 0;
        
        int a = 0;
        
        do {
            
            System.out.println("");
            System.out.println("Please begin the chat!");
            
            do {

                System.out.print("Sender last name: ");
                String sendName = in.nextLine();
                
                if (chat.person1.name.getLast().equals(sendName)){
                    chat.setPerson(chat.person1);
                    chat.setRec(chat.person2);
                    a = 1;
                }
                else if (chat.person2.name.getLast().equals(sendName)){
                    chat.setPerson(chat.person2);
                    chat.setRec(chat.person1);
                    a = 1;
                }
                else {
                    System.out.println("Please enther the last name of one of the chat users you entered.");
                }
                
            } while(a == 0);
            
            System.out.println("Reciever name: " + chat.getRec().name.getLast());
                
            System.out.print("Question or message: ");
            String qOrMsg = in.nextLine();

            if (qOrMsg.equals("question") || qOrMsg.equals("Question")){

                System.out.print("Text: ");
                String text = in.nextLine();
                chat.setQuestion(text);

                if (text.equals("EXIT")){
                    x = 1;
                }
                else{

                    chat.getRec().sendQuestion(chat.getQuestion());

                    System.out.println(chat.getPerson().name.getFirst() + " asked " + chat.getRec().name.getFirst() + ", " + chat.getRec().receiveQuestion());
                    System.out.println("");

                }

            }

            else if (qOrMsg.equals("message") || qOrMsg.equals("Message")){

                System.out.print("Text: ");
                String text = in.nextLine();
                chat.setMessage(text);

                if (text.equals("EXIT")){
                    x = 1;
                }
                else{

                    chat.getRec().sendMessage(chat.getMessage());

                    System.out.println(chat.getPerson().name.getFirst() + " told " + chat.getRec().name.getFirst() + ", " + chat.getRec().receiveMessage());
                    System.out.println("");

                }

            }
            else if (qOrMsg.equals("EXIT") || qOrMsg.equals("exit")){
                x = 1;
            }
            else{
                System.out.println("Please enter question or message.");
            }
            
        } while(x == 0);
        
    }
    
}
