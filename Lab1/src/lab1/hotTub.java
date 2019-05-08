/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Jared
 */
public class hotTub {
    
    private double WHT;
    private double DHT;
    private double gallons;
    private double volume;
    
    public void setWHT(double width)
    {
        WHT = width;
    }
    
    public double getWHT()
    {
        return WHT;
    }
    
    public void setDHT(double depth)
    {
        DHT = depth;
    }
    
    public double getDHT()
    {
        return DHT;
    }
    
    public double getVolume()
    {
        volume = Math.pow((WHT * 0.5), 2) * (DHT - 0.5) * Math.PI;
        return volume;
    }
    
    public double getGallons()
    {
        gallons = volume * 7.481;
        return gallons;
    }
    
}
