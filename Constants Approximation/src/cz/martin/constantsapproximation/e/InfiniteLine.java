/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.martin.constantsapproximation.e;

/**
 *
 * @author martin
 */
public class InfiniteLine implements cz.martin.constantsapproximation.ConstantApproximation
{
  @Override
  public double calculation()
  {
    long lastFact = 1l;
    double result = 0;
    for ( int i = 1 ; i < 20 ; i ++ )
    {      
      result += 1d / lastFact;
      lastFact *= i;
    }
    
    return result;
  } 
}
