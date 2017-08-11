package clase_4;

public class Clase_4 {

    public static void main(String[] args) {

        // Runtime exception. Al momento de ejecucion
        /*
        int a = 5;
        int b = 0;
        
        int division = a / b;
        
        System.out.println( "Resultado = " + division );
        */
        
        // Indice fuera Y div entre 0

        String[] nombres = { "AAAAA", "BBBBB", "CCCCC" };
        
        // Al ocurrir una excepcion, se va SOLO a un catch
        try{
            int div = 1/0;
            for( int i = 0; i <= nombres.length; i++ ){
                System.out.println( "Nombre[" + i + "]: " + nombres[i] );
            }
        } 
        // Multicatch (usado para excepciones similares)
        catch( ArithmeticException | ArrayIndexOutOfBoundsException e ){
            if( e instanceof ArithmeticException ){
                System.out.println( "Excepcion ArithmeticException" );
            } else{
                System.out.println( "Excepcion ArrayIndexOutOfBoundsException" );
            }
        }
        
        /*
        catch( ArithmeticException e ){
            System.out.println( "Fallo al intentar dividir" );
            e.printStackTrace();
        } catch( ArrayIndexOutOfBoundsException e ){
            System.out.println( "Fallo el ciclo: " + e.getMessage() );
            e.printStackTrace();
        }
        */
        
        catch( Exception e ){
            e.printStackTrace();
        }finally{
            System.out.println( "Bloque Finally" );
            System.out.println( "Liberando Recursos" );
        }
        
        System.out.println( "Continua la ejecucion" );

    }
    
}
