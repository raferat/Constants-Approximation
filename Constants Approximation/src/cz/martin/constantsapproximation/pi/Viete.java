/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.martin.constantsapproximation.pi;


import cz.martin.constantsapproximation.ConstantApproximation;

public class Viete implements ConstantApproximation
{
  @Override
  public double calculation()
  {
    double result = 1d;
    double sqrts = 0d;  
    
    for ( int i = 0 ; i < iterations ; i ++ )
    {
      sqrts = Math.sqrt ( 2d + sqrts );
      result *= sqrts / 2d;
    }
    
    return 2d / result;
  }
}
