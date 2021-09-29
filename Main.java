public class Main
{
  private static final int exactness = 100_000;
  private static final int antiOverflowExactness = 8_000;
  
  public static void main(String[] args) 
  {
    System.out.println ( "Gregoryho  : " + gregoryhoLeibnitzovaRada () );
    System.out.println ( "Wallis     : " + johnWallis() );
    System.out.println ( "Viets      : " + viets () );
    System.out.println ( "Archimedes : " + arch ( 0 , 2*Math.sqrt(3) , 3 ) );
    System.out.println ( "Math.PI    : " + Math.PI );
  }
  
  private static final double gregoryhoLeibnitzovaRada ()
  {
    double result = 0;
    for ( int i = 0 ; i < exactness ; i ++ )
    {
      result += (Math.pow(-1,i)/(2.0*i+1));
    }
    result *= 4;
    return result;
  }
  
  private static final double johnWallis ()
  {
    double result = 1;
    for ( int i = 1 ; i < exactness ; i ++ )
    {
      result *= ((Math.pow(2*i,2)) / (Math.pow ( 2 * i , 2 ) - 1));
    }
    return result*2;
  }
  
  private static final double viets ()
  {
    double sqrts = 0;
    double result = 1;
    for ( int i = 0 ; i < exactness ; i ++ )
    {
      sqrts = Math.sqrt ( 2.0 + sqrts );
      result *= sqrts / 2;
    }
    return 2.0 * ( 1.0 / result );
  }
  
  private static final double arch ( int exactness , double lastA , double lastB )
  {
    if ( exactness < antiOwerflowExactness )
    {
      double a = ( 2 * lastA * lastB ) / ( lastA + lastB );
      double b = Math.sqrt ( a * lastB );
      return arch ( exactness +1 , a , b );
    }
    else 
      return lastB;
  }
}
