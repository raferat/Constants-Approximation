
public class E 
{

  private static final long count = 1_000_000_000l;
	
  public static void main(String[] args) 
  {
	System.out.println ( "Limita:        " + limita() );
	System.out.println ( "Infinite Line: " + infiniteLine() );
	System.out.println ( "Math.E:        " + Math.E );


  }

  private static double limita ()
  {
	double result = 1;
	for ( long i = 0 ; i < count ; i ++ )
	{
	  result *= 1d + 1d / count * 1.0; 
	}
	return result;
  }
  
  private static double infiniteLine ()
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
