package dao;


public class AccesoDao {

    // Indicar que el metodo puede fallar
    public void conectarBase() throws Exception{
        
        try{
            System.out.println( "Intentando conectarme" );
            throw new Exception( "La url es incorrecta" ); // Simulando la excepcion
        } catch( Exception e ){
            throw new Exception( e );
        }
    }
    
}
