//import java.lang.String;
import java.util.Scanner;

public class ConfrontoStringhe {
	public static void main( String[] args ) {
		
		String s1, s2;
	
		Scanner input = new Scanner ( System.in );
	
		System.out.println( "Inserire prima stringa:" );
		s1 = input.nextLine();
		System.out.println( "Inserire seconda stringa:" );
		s2 = input.nextLine();
		
		if ( s1.equals(s2) ) System.out.println( "Le due stringhe sono uguali" );
		else System.out.println( "Le due stringhe non sono uguali" );
		
		System.out.println( "Compare: " + s1.compareTo(s2) );
		
		input.close();
	}
}
