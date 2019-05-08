/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author Jared
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat value = new DecimalFormat("#.#");
        
        Scanner in = new Scanner(System.in);

        hotTub HT1 = new hotTub();
        
        pool pool1 = new pool();
        
        String yesNo = "y";
        
        while(yesNo.equals("y") || yesNo.equals("Y")){
            
            do{
                
                System.out.print("Please enter the hot tub's width (between 8 and 14 feet): ");
                double tempWidth = in.nextDouble();
                HT1.setWHT(tempWidth);
                in.nextLine();
                
            } while (HT1.getWHT() > 14 || HT1.getWHT() < 8);
            
            do{
                
                System.out.print("Please enter the hot tub's depth (between 3 and 5 feet): ");
                double temp = in.nextDouble();
                HT1.setDHT(temp);
                in.nextLine();
                
            } while (HT1.getDHT() > 5 || HT1.getDHT() < 3);
            
            do{
                
                System.out.print("Please enter the pool's deep end depth (between 6 and 12 feet): ");
                double temp = in.nextDouble();
                pool1.setDeepEndDepth(temp);
                in.nextLine();
                
            } while (pool1.getDeepEndDepth() > 12 || pool1.getDeepEndDepth() < 6);
            
            do{
                
                System.out.print("Please enter the pool's shallow end depth (between 2 and 5 feet): ");
                double temp = in.nextDouble();
                pool1.setShallowEndDepth(temp);
                in.nextLine();
                
            } while (pool1.getShallowEndDepth() > 5 || pool1.getShallowEndDepth() < 2);
            
            do{
                
                System.out.print("Please enter the pool's width (between 15 and 30 feet): ");
                double temp = in.nextDouble();
                pool1.setPoolWidth(temp);
                in.nextLine();
                
            } while (pool1.getPoolWidth() > 30 || pool1.getPoolWidth() < 15);
            
            do{
                
                System.out.print("Please enter the pool's length (between 35 and 60 feet): ");
                double temp = in.nextDouble();
                pool1.setPoolLength(temp);
                in.nextLine();
                
            } while (pool1.getPoolLength() > 60 || pool1.getPoolLength() < 35);
            
            do{
                
                System.out.print("Please enter the pool's walk in length (between 5 and " + value.format( pool1.getPoolLength() / 6 ) +  " feet): ");
                double temp = in.nextDouble();
                pool1.setWalkInLength(temp);
                in.nextLine();
                
            } while (pool1.getWalkInLength() > ( pool1.getPoolLength() / 6 ) || pool1.getWalkInLength() < 5);
            
            do{
                
                System.out.print("Please enter the pool's shallow end length (between 10 and " + value.format( pool1.getPoolLength() / 3 ) +  " feet): ");
                double temp = in.nextDouble();
                pool1.setShallowEndLength(temp);
                in.nextLine();
                
            } while (pool1.getShallowEndLength() > ( pool1.getPoolLength() / 3 ) || pool1.getShallowEndLength() < 10);
            
            do{
                
                System.out.print("Please enter the pool's deep end length (between 12 and " + value.format( pool1.getPoolLength() / 2 ) +  " feet): ");
                double temp = in.nextDouble();
                pool1.setDeepEndLength(temp);
                in.nextLine();
                
            } while (pool1.getDeepEndLength() > ( pool1.getPoolLength() / 2 ) || pool1.getDeepEndLength() < 12);
            
            System.out.println("The volume of the hot tub is: " + value.format(HT1.getVolume()));
            System.out.println("The gallons to fill the hot tub is: " + value.format(HT1.getGallons()));
            System.out.println("the volume of the pool is: " + value.format(pool1.getPoolVolume())); 
            System.out.println("The gallons to fill the pool is: " + value.format(pool1.getPoolGallons()));
            System.out.println("The total gallons for both the pool and hot tub is: " + value.format(pool1.getPoolGallons() + HT1.getGallons()));
            System.out.println("The cost to fill both the pool and the hot tub is: $" + value.format((pool1.getPoolGallons() + HT1.getGallons()) * 0.1));

            System.out.print("Would you like to enter another pool and hot tub? (y/n) ");
            yesNo = in.next();
            System.out.println(yesNo);
            
        } 
        
    }
    
}
