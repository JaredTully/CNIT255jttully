/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trialmaven;

/**
 *
 * @author Jared
 */
abstract class ticker {
    
    private String tickerLocal;
    
    ticker(String tick){
        this.tickerLocal = tick;
    }
    
        public void setTicker(String tick){
            
            if (!tick.equals("")){
                tickerLocal = tick;
            }
            
    }
    
    public String getFirst(){
        return tickerLocal;
    }
    
}
