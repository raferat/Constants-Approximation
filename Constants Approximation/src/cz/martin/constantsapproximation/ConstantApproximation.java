package cz.martin.constantsapproximation;

@FunctionalInterface
public interface ConstantApproximation
{
  public static int iterations = 1_000_000;
  public static int alignment = 20;
  
  public ConstantApproximation PI = new ConstantApproximation()
  {
    @Override
    public double calculation ()
    {
      return Math.PI;
    }
  };
  
  public ConstantApproximation E = new ConstantApproximation()
  {
    @Override
    public double calculation ()
    {
      return Math.E;
    }
  };
  
  public ConstantApproximation GOLDEN_RATIO = new ConstantApproximation()
  {
    @Override
    public double calculation ()
    {
      return 1.6180339887498948;
    }
  };
  
    
  
  
  public default String getConstant()
  {
    String result = getClass().getSimpleName() + ":";
    
    int length = result . length();
    
    
    for ( int i = 0 ; i < alignment - length  ; i ++ )
      result += " ";
    
    
    
    result += calculation();
    
    
    
    return result;
  }
  
  public default void print()
  {
    System.out.println ( getConstant() );
  }
  
  public double calculation ();
  
}
