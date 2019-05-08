/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Jared
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String p1First, p1Last, p1Mi, p1PUID, p1Email, p1Phone, p1Strt, p1Strt2 = "", p1City, p1State, p1Zip, p1Country; 
        
        String p2First, p2Last, p2Mi, p2PUID, p2Email, p2Phone, p2Strt, p2Strt2 = "", p2City, p2State, p2Zip, p2Country;
        
        String choice = "n";
        
        System.out.println("Welcome to the chatroom!");
        System.out.println("");
        System.out.print("Please enter the first user's first name: ");
        p1First = in.nextLine();
        System.out.print("Please enter the first user's last name: ");
        p1Last = in.nextLine();
        System.out.print("Please enter the first user's middle name: ");
        p1Mi = in.nextLine();
        System.out.print("Please enter the first user's PUID: ");
        p1PUID = in.nextLine();
        System.out.print("Please enter the first user's email: ");
        p1Email = in.nextLine();
        System.out.print("Please enter the first user's phone: ");
        p1Phone = in.nextLine();
        System.out.print("Please enter the first user's street address: ");
        p1Strt = in.nextLine();
        
        System.out.print("Would you like to enter a second address? (y/n): ");
        choice = in.nextLine();
        
        if (choice.equals("y") || choice.equals("Y")){
            System.out.print("Please enter the first user's second street address: ");
            p1Strt2 = in.nextLine();
        }
        
        System.out.print("Please enter the first user's city: ");
        p1City = in.nextLine();
        System.out.print("Please enter the first user's state: ");
        p1State = in.nextLine();
        System.out.print("Please enter the first user's zip: ");
        p1Zip = in.nextLine();
        System.out.print("Please enter the first user's country: ");
        p1Country = in.nextLine();
        
        System.out.println("");
        System.out.print("Please enter the second user's second name: ");
        p2First = in.nextLine();
        System.out.print("Please enter the second user's last name: ");
        p2Last = in.nextLine();
        System.out.print("Please enter the second user's middle initial: ");
        p2Mi = in.nextLine();
        System.out.print("Please enter the second user's PUID: ");
        p2PUID = in.nextLine();
        System.out.print("Please enter the second user's email: ");
        p2Email = in.nextLine();
        System.out.print("Please enter the second user's phone number: ");
        p2Phone = in.nextLine();
        System.out.print("Please enter the second user's street address: ");
        p2Strt = in.nextLine();
        
        choice = "n";
        
        System.out.print("Would you like to enter a second address? (y/n): ");
        choice = in.nextLine();
        
        if (choice.equals("y") || choice.equals("Y")){
            System.out.print("Please enter the second user's second street address: ");
            p2Strt2 = in.nextLine();
        }
        
        System.out.print("Please enter the second user's city: ");
        p2City = in.nextLine();
        System.out.print("Please enter the second user's state: ");
        p2State = in.nextLine();
        System.out.print("Please enter the second user's zip: ");
        p2Zip = in.nextLine();
        System.out.print("Please enter the second user's country: ");
        p2Country = in.nextLine();
        
        chatroom chat = new chatroom(p1First, p1Last, p1Mi, p1PUID, p1Email, p1Phone, p1Strt, p1Strt2, p1City, p1State, p1Zip, p1Country, p2First, p2Last, p2Mi, p2PUID, p2Email, p2Phone, p2Strt, p2Strt2, p2City, p2State, p2Zip, p2Country); //add args here my man
        
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
                    System.out.println("Person 1 set as reciever.");
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