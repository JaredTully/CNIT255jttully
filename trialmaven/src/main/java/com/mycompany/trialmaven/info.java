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
abstract class info extends ticker{
    
    private String ticker;
    private stockInfo information;
    private Map<String, String> infoMap;
    
    info(String tick){
        super(tick);
        
        this.ticker = tick;
        
        this.information = new stockInfo(tick);
        this.infoMap = information.getStockInfo();
    }
        
    public String getCompanyName(){
        String temp = infoMap.get("companyName");
        return temp;
    }
    
}
