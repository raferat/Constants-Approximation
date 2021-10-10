package cz.martin.constantsapproximation.pi.montecarlo;


import cz.martin.constantsapproximation.ConstantApproximation;


public class BuffonNeadle implements ConstantApproximation
{
  
  @Override
  public double calculation()
  {
    int in = 0;
    
    for ( int i = 0 ; i < iterations ; i ++ )
    {
      double xCenter = Math.random();
      double yCenter = Math.random();
      
      double width = Math.random();
      double height = Math.random();
      
      double x1 = xCenter - width;
      double x2 = xCenter + width;
      
      double y1 = yCenter - height;
      double y2 = yCenter + height;
      
      double length = Math.sqrt( x2 * x2 + y2 * y2 );
      x2 /= length;
      y2 /= length;
      
      x2 += x1;
      
      if ( Math.round ( x1 ) != Math.round( x2 ))
        in ++;
    }
    
    return 2d * iterations / (double)in;
  }
  
}
