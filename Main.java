public class Main
{
    /**
     *
     * 1: 3.1415826535897198
     */
    private static final int count = 100_000;
    
    public static void main(String[] args) 
    {
      
      System.out.println ( "Gregoryho  : " + gregoryho_leibnitzova_rada () );
      System.out.println ( "Wallis     : " + john_wallis() );
      System.out.println ( "Viets      : " + viets () );
      System.out.println ( "Archimedes : " + arch ( 0 , 2*Math.sqrt(3) , 3 ) );
      System.out.println ( "Math.PI    : " + Math.PI );
    }
    
    private static final double gregoryho_leibnitzova_rada ()
    {
      double result = 0;
      for ( int i = 0 ; i < count ; i ++ )
      {
          result += (Math.pow(-1,i)/(2.0*i+1));
      }
      result *= 4;
      return result;
    }

    private static final double john_wallis ()
    {
      double result = 1;
      for ( int i = 1 ; i < count ; i ++ )
      {
        result *= ((Math.pow(2*i,2)) / (Math.pow ( 2 * i , 2 ) - 1));
      }
      return result*2;
    }

    private static final double viets ()
    {
      double sqrts = 0;
      for ( int i = 0 ; i < 20 ; i ++ )
      {
//System.out.println ( sqrts );
	sqrts = Math.sqrt ( 2.0 + sqrts );


      }
      sqrts /= Math.pow ( 2 , 20 );
      return 2.0 * (1.0/sqrts);
    }

    private static final double arch ( int count , double last_a , double last_b )
    {
      if ( count < 2000 )
      {
	double a = ( 2 * last_a * last_b ) / ( last_a + last_b );
	double b = Math.sqrt ( a * last_b );
	return arch ( count +1 , a , b );
      }
      else 
	return last_b;
    }


    
}
