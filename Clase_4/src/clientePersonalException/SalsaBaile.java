package clientePersonalException;

import java.util.Date;
import javax.swing.JOptionPane;
import personalException.MiExcepcion;

public class SalsaBaile {

    // Puede ser así para regresarlo al proceso que la llama
    /*
    public static void main(String[] args) throws MiExcepcion{
        SalsaBaile.validarEntrar( "Juan" , 17);
    }
    */
    
    // Puede ser así para tratar aqui la excepcion
    public static void main(String[] args) throws MiExcepcion{
        
        try {
            SalsaBaile.validarEntrar( "Juan" , 17);
        } catch (MiExcepcion ex) {
            JOptionPane.showMessageDialog( null, ex.getDate() + "\nERROR - " + ex.getCode() + ": " +
                     ex.getDescripcion() + ". Mensaje: " + ex.getMessage() );
        }
    }
    
    
    public static boolean validarEntrar( String name, int edad ) throws MiExcepcion{
        
        boolean esMayor = false;
        
        if( edad >= 18 ){
            esMayor = true;
            System.out.println( "Bienvenido " + name );
        } else{
            throw new MiExcepcion( 500, "No bienvenido, menor de edad", new Date(), "Intenta "
                    + "entrar un menor de edad" );
        }
        
        return esMayor;
    }
    
}
