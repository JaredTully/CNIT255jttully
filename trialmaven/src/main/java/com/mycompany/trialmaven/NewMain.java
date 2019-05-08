/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trialmaven;

import java.util.ArrayList;


/**
 *
 * @author Jared
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        stock newStock = new stock("AAPL");
        
        ArrayList<Integer> temp;
        
        temp = newStock.getMonthsHighs();
        
        System.out.println("This one: " + temp.toString());
        
    }
}
