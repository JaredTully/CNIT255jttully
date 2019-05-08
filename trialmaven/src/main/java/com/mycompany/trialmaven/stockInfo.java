/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trialmaven;

import java.util.HashMap;
import java.util.Map;
import pl.zankowski.iextrading4j.api.stocks.Quote;
import pl.zankowski.iextrading4j.client.IEXTradingClient;
import pl.zankowski.iextrading4j.client.rest.request.stocks.QuoteRequestBuilder;

/**
 *
 * @author Jared
 */
public class stockInfo {
    
    private String ticker;
    private Map<String, String> myMap = new HashMap<String, String>();
    
    stockInfo(String stockTicker){
        
        this.ticker = stockTicker;
        
        final IEXTradingClient iexTradingClient = IEXTradingClient.create();
        
        final Quote quote = iexTradingClient.executeRequest(new QuoteRequestBuilder()
            .withSymbol(ticker)
            .build());         
        
        String str = quote.toString().substring(6, (quote.toString().length() -1));
        
        str = str.replaceAll("\\s", "");
        
        String[] typeData = str.split(",");
        
        for (int x = 0; x < typeData.length; x++){
            
            String[] labelData = typeData[x].split("=");
            
            if (labelData.length > 1){
                myMap.put(labelData[0], labelData[1]);
            }
        }
        
    }
    
    public Map getStockInfo(){
        return myMap;
    }
    
}
