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
public class JohnWallis implements ConstantApproximation
{

  @Override
  public double calculation()
  {
    double result = 1;
    for ( int i = 1 ; i < iterations + 1 ; i ++ )
    {
      result *= ( 2d * 2d * i * i ) / ( 2d * 2d * i * i - 1d );
    }
    
    return result * 2d;
  }
  
}
