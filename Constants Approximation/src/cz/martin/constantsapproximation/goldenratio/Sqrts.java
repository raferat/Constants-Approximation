package cz.martin.constantsapproximation.goldenratio;

public class Sqrts implements cz.martin.constantsapproximation.ConstantApproximation
{
  @Override
  public double calculation()
  {
    double sqrts = 0;
    for ( int i = 0 ; i < iterations ; i ++ )
    {
      sqrts = Math.sqrt ( 1 + sqrts );
    }
    
    return sqrts;
  } 
}
