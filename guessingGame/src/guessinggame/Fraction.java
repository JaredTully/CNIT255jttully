/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessinggame;

/**
 *
 * @author Jared
 */
public class Fraction {
   // Instance Fields declerations
   private int num;
   private int denom;

   // Constructror - method that initializes class
   // Paramaters
   // num   - numerator of fraction
   // denom - denomenator of fraction
   public Fraction(int num, int denom) {
        // throw Exception if denominator is 0
       if (denom == 0) {
           throw new ArithmeticException("Cannot dvide by zero");
       }

       this.num = num;
       this.denom = denom;
   }

   // @return value of numerator
   public int num() {
       return num;
   }

   // @return value of denomenator
   public int denom() {
       return denom;
   }

   // add 2 fractions
   public Fraction add(Fraction other) {
       //
       return new Fraction(1, 2); // return statments add initialy so file compiles
                                  // your will need to change the return statements
   }

}