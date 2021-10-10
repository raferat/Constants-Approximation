package cz.martin.constantsapproximation.goldenratio;

public class InfiniteLine implements cz.martin.constantsapproximation.ConstantApproximation
{

  private static double factorial(double i)
  {
    double result = i;
    while (--i > 0)
    {
      result *= i;
    }

    return result == 0 ? 1 : result;
  }

  @Override
  public double calculation()
  {
    double result = 0;
    for (int i = 0; i < 5; i++)
    {
      result += (Math.pow(-1 , i + 1) * factorial ( ( 2d * i + 1d ) ) ) / factorial(Math.pow ( 4d , 2d * i + 3d ) * 4) * factorial( i + 2 );
    }
    
    return result;
  }
}
