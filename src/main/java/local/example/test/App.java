package local.example.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        if (args.length > 0) {
			System.out.println( "Hello World testing !!!!! This is successfull test " + args[0] );
		} else {
			System.out.println("Hello world!");
		}
        System.out.println( "Hello World testing"+System.getenv("NAME"));

                         
    }
}
