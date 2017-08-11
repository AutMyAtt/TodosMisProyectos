package serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestGato {

    public static void main(String[] args) {
        Gato benito = new Gato();
        benito.nombre = "Benito Bodoque";
        benito.raza = "Azul";
        
        try {
            // Escritura del stream
            /*
            FileOutputStream fm = new FileOutputStream( "C:\\Users\\Java\\Desktop\\Participante\\notas\\file\\streamGato" );
            ObjectOutputStream os = new ObjectOutputStream( fm );
            os.writeObject( benito );
            os.close();
            System.out.println( "Benito escrito en el Stream" );
            */
            
            // Lectura del Stream
            FileInputStream fi = new FileInputStream( "C:\\Users\\Java\\Desktop\\Participante\\notas\\file\\streamGato" );
            ObjectInputStream obj = new ObjectInputStream( fi );
            
            try {
                Gato recuperaGato = (Gato)obj.readObject();
                obj.close();
                System.out.println( "Gato recuperado: " + recuperaGato );
                
            } catch (ClassNotFoundException ex) {
                System.out.println( "El objeto leido del stream no es un Gato" );
                ex.printStackTrace();
            }
            
        } catch ( IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
