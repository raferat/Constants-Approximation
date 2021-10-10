package cz.martin.constantsapproximation.pi;


import cz.martin.constantsapproximation.ConstantApproximation;


public class GregoryLeibniz implements ConstantApproximation
{

  @Override
  public double calculation()
  {
    double result = 0;
    double operator = 1;
    for ( int i = 0 ; i < iterations ; i ++ )
    {
      result += 1d * operator  / ( 2d * i + 1d );
      operator *= -1d;
    }
    
    return result * 4d;
  }
  
}
