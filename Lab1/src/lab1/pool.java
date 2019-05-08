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
public class pool {
    
    private double shallowEndDepth;
    private double deepEndDepth;
    private double poolWidth;
    private double poolLength;
    private double walkInLength;
    private double shallowEndLength;
    private double deepEndLength;
    private double volume;
    private double gallons;
 
    public void setShallowEndDepth(double depth)
    {
        shallowEndDepth = depth;
    }
    
    public double getShallowEndDepth()
    {
        return shallowEndDepth;
    }
    
    public void setDeepEndDepth(double depth)
    {
        deepEndDepth = depth;
    }
    
    public double getDeepEndDepth()
    {
        return deepEndDepth;
    }
    
    public void setPoolWidth(double width)
    {
        poolWidth = width;
    }
    
    public double getPoolWidth()
    {
        return poolWidth;
    }
    
    public void setPoolLength(double length)
    {
        poolLength = length;
    }
    
    public double getPoolLength()
    {
        return poolLength;
    }
    
    public void setWalkInLength(double length)
    {
        walkInLength = length;
    }
    
    public double getWalkInLength()
    {
        return walkInLength;
    }
    
    public void setShallowEndLength(double length)
    {
        shallowEndLength = length;
    }
    
    public double getShallowEndLength()
    {
        return shallowEndLength;
    }
    
    public void setDeepEndLength(double length)
    {
        deepEndLength = length;
    }
    
    public double getDeepEndLength()
    {
        return deepEndLength;
    }
    
    public double getPoolVolume()
    {
        double transitionLength = poolLength - walkInLength - shallowEndLength - deepEndLength;        
        
        double deepEndVolume = deepEndLength * (deepEndDepth - 0.5) * poolWidth;
        double shallowEndVolume = shallowEndLength * (shallowEndDepth - 0.5) * poolWidth;
        double transitionRectangleVolume = poolWidth * transitionLength * (shallowEndDepth - 0.5);
        double transitionTriangleVolume = poolWidth * transitionLength * (deepEndDepth - shallowEndDepth) * 0.5;
        double walkInVolume = (shallowEndDepth - 0.5) * poolWidth * (walkInLength - 0.5) * 0.5;
        
        volume = deepEndVolume + shallowEndVolume + transitionRectangleVolume + transitionTriangleVolume + walkInVolume;
        
        return volume;
    }
    
    public double getPoolGallons()
    {
        gallons = volume * 7.481;
        return gallons;
    }
    
}
