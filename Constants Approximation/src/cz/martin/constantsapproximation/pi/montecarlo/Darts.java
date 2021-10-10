/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.martin.constantsapproximation.pi.montecarlo;


import cz.martin.constantsapproximation.ConstantApproximation;


/**
 *
 * @author martin
 */
public class Darts implements ConstantApproximation
{
  @Override
  public double calculation()
  {
    int in = 0;
    for ( int i = 0 ; i < iterations ; i ++ )
    {
      double x = Math.random();
      double y = Math.random();
      
      if ( Math.sqrt ( x*x + y*y ) <= 1 )
        in ++;
    }
    
    return 4d * in / iterations;
  } 
}
