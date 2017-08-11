package archivos;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivos {

    public static void main(String[] args) throws IOException {
        File file = new File( "C:\\Users\\Java\\Desktop\\Participante\\notas\\file\\ejemplo.txt" );
        char[] in = new char[50];
    
        // Si ya existe el archivo
        // Leer los métodos de este objeto
        if( !file.exists() ){
            try {
                if( file.createNewFile() ){
                    System.out.println( "Archivo nuevo creado" );
                } else {
                    System.out.println( "Archivo no se pudo crear" );
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } else{
            System.out.println( "No se puede crear el archivo; ya existe" );
        }
        
        FileWriter fw = new FileWriter( file );
        fw.write( "Television:\n\tPrecio = $20.00 pesitos" );
        fw.flush();
        fw.close();
        System.out.println( "Se ha escrito texto en archivo" );
        
        // Lectura con caracteres
        FileReader fr = new FileReader( file );
        int size = fr.read( in );
        System.out.println( "Tamano del archivo: " + size );
        in[size] = '\0';
        
        for (char c : in ) {
            System.out.print( c );
        }
        
    }
    
}
