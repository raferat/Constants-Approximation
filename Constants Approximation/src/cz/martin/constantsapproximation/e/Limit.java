package cz.martin.constantsapproximation.e;

public class Limit implements cz.martin.constantsapproximation.ConstantApproximation
{
  @Override
  public double calculation()
  {
    double result = 1;
    for ( int i = 0 ; i < iterations ; i ++ )
    {
      result *= 1d + 1d / iterations * 1d;
    }
    
    return result;
  }
}
