package cz.martin.constantsapproximation.goldenratio;

public class InfiniteFraction implements cz.martin.constantsapproximation.ConstantApproximation
{
  @Override
  public double calculation()
  {
    double fraction = 1;
    for ( int i = 0 ; i < iterations ; i ++ )
    {
      fraction = 1 + 1 / fraction;
    }
    
    return fraction;
  } 
}
