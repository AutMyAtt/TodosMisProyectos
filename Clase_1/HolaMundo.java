public class HolaMundo{
	public static void main( String args[] ){
		String argumento = new String();

		try{
			argumento = args[0];
		}
		catch( IOException e ){
			argumento = "aqui";
		}

		System.out.println( "Hola Mundo!! " + argumento + " Desde WTC" );
	}
}
