/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trialmaven;

import java.util.Map;

/**
 *
 * @author Jared
 */
public class stock extends data{
    
    private stockInfo information;
    private Map<String, String> infoMap;
    
    stock(String tick){
        super(tick);
        
        this.information = new stockInfo(tick);
        this.infoMap = information.getStockInfo();
    }
    
    public String getSector(){
        String temp = infoMap.get("sector");
        return temp;
    }
    
}
