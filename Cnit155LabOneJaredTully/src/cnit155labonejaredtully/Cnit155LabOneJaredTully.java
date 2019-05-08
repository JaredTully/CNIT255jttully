/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cnit155labonejaredtully;

package com.company;

import java.util.*;

/**
 *
 * @author Jared
 */
public class Cnit155LabOneJaredTully {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        class hotTub {

            public double WHT;
            public double DHT;

        }

        Scanner in = new Scanner(System.in);

        hotTub HT1 = new hotTub();

        System.out.print("Please enter the hot tub's width (between 8 and 14 feet): ");
        HT1.WHT = in.nextDouble();
        in.nextLine();

        while (HT1.WHT > 14 | HT1.WHT < 8)
        {

            System.out.println("Please enter a value in feet that is between 8 and 14.");
            System.out.print("Enter the hot tub's width: ");
            HT1.WHT = in.nextDouble();
        }

        System.out.print("Please enter the hot tub's depth (between 3 and 5 feet): ");
        HT1.DHT = in.nextDouble();
        in.nextLine();

        while (HT1.DHT > 5 | HT1.DHT < 3)
        {

            System.out.println("Please enter a value in feet that is between 3 and 5.");
            System.out.print("Enter the hot tub's depth: ");
            HT1.DHT = in.nextDouble();
            in.nextLine();
        }

        HT1.DHT = HT1.DHT - 0.5;

        double hotTubVolume = Math.pow((HT1.WHT * 0.5), 2) * HT1.DHT * Math.PI;

        double x = 1;

        Map<Integer, String> poolMap = new HashMap<>();

        for (String yesNo = "y"; yesNo == "Y" | yesNo == "y"; x++)
        {

            Sys
            
        }

        System.out.println("Depth = " + HT1.DHT);
        System.out.println("Width = " + HT1.WHT);
        System.out.println("Volume = " + hotTubVolume);
        
    }
    
}
