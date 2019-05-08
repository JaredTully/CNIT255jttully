/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trialmaven;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Jared
 */
abstract class data extends info{
    
    private stockInfo information;
    private Map<String, String> infoMap;
    
    data(String tick){
        super(tick);
        this.information = new stockInfo(tick);
        this.infoMap = information.getStockInfo();
    }
    
 
    public String getPercentChange(){
        String temp = infoMap.get("changePercent");
        return temp;
    }
    
    public String getPriceHigh(){
        String temp = infoMap.get("high");
        return temp;
    }
    
    public String getPriceLow(){
        String temp = infoMap.get("low");
        return temp;
    }
    
    public String getPrice(){
        
        String temp = "Connection Issues";
        
        try{
            Stock stockRequest =  YahooFinance.get("SPY", true);
            temp = stockRequest.getQuote().toString();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        return temp;
    }
    
    public ArrayList getMonths(){
    
        ArrayList<Integer> months = new ArrayList<Integer>(); 
    
        try{
            Stock tesla =  YahooFinance.get("SPY", true);
            System.out.println(tesla.getHistory());
            
            String history = tesla.getHistory().toString().substring(1, (tesla.getHistory().toString().length() -1));
            
            history = history.replaceAll("\\s", "");
            
            String[] historySplit = history.split(",");
            
            int a = 0;
            
            for (int x = 0; x < historySplit.length; x = x + 2){
                
                String[] temp = historySplit[x].split("@");
                
                String[] temp2 = temp[1].split(":");
                
                String monthNumber = temp2[0].split("-")[1];
                
                String[] temp3 = temp2[1].split("-");
                
                String monthHighPrice = temp3[1];
                
                System.out.println(monthNumber + " " + monthHighPrice);
                
                a = a +1;
                if (!monthNumber.equals("null")){
                    months.add(Integer.parseInt(monthNumber));
                }
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    
        return months;
            
    }
    
    public ArrayList getMonthsHighs(){
    
        ArrayList<Double> months = new ArrayList<Double>(); 
    
        try{
            Stock tesla =  YahooFinance.get("SPY", true);
            System.out.println(tesla.getHistory());
            
            String history = tesla.getHistory().toString().substring(1, (tesla.getHistory().toString().length() -1));
            
            history = history.replaceAll("\\s", "");
            
            String[] historySplit = history.split(",");
            
            int a = 0;
            
            for (int x = 0; x < historySplit.length; x = x + 2){
                
                String[] temp = historySplit[x].split("@");
                
                String[] temp2 = temp[1].split(":");
                
                String monthNumber = temp2[0].split("-")[1];
                
                String[] temp3 = temp2[1].split("-");
                
                String monthHighPrice = temp3[1];
                
                //System.out.println(monthNumber + " " + monthHighPrice);
                
                a = a +1;
                if (!monthHighPrice.equals("null")){
                    months.add(Double.parseDouble(monthHighPrice));
                }
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return months;
            
    }
    
}
