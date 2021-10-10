/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.martin.constantsapproximation.pi;


import cz.martin.constantsapproximation.ConstantApproximation;


/**
 *
 * @author martin
 */
public class Archimedes implements ConstantApproximation
{
  @Override
  public double calculation()
  {
    double lastA = 2 * Math.sqrt ( 3 );
    double lastB = 3;
    for ( int i = 0 ; i < iterations ; i ++ )
    {
      double a = ( 2d * lastA * lastB ) / ( lastA + lastB );
      double b = Math.sqrt ( a * lastB );
      
      lastA = a;
      lastB = b;
    }
    
    return lastB;
  }
}
