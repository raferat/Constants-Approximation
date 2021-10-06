
public class GoldenCut 
{
  private static final int count = 1_000_000;
	
  public static void main(String[] args) 
  {
	System.out.println ( "Square roots:  " + sqrt());
	System.out.println ( "Zlomek:        " + zlomek());
	System.out.println ( "Infinite Line: " + infiniteLine());
	//System.out.println ( "Infinite Line: " + factorial(0));
	System.out.println ( "Right:         1,61803398874989484820458683436563811772030917980576");

  }
  
  private static double sqrt ()
  {
	double sqrt = 0;
	for ( int i = 0 ; i < count ; i ++)
	{
	  sqrt = Math.sqrt( 1 + sqrt );
	}
	
	return sqrt;
  }
  
  private static double zlomek()
  {
	double zlomek = 1;
	for ( int i = 0 ; i < count ; i ++ )
	{
	  zlomek = 1 + 1d / zlomek; 
	}
	 
	return zlomek;
  }
  
  private static long factorial ( long i )
  {
	long result = i;
	while ( --i > 0 )
	{
	  result *= i;  
	} 
	  
	return result == 0 ? 1 : result;
  }
  
  private static double infiniteLine ()
  {
	double result = 0;
	for ( int i = 0 ; i < 20 ; i ++ )
	{
	  result += 1.0*(Math.pow(-1, i+1)*factorial(2*i+1))/((Math.pow(4, 2*i+3)*factorial(i)*factorial(i+2)));
	}
	return result + 13d/8d;
  }
}
