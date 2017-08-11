package archivos;

import java.io.File;
import java.io.IOException;

public class Carpetas {

    public static void main(String[] args) throws IOException {
     
       File file = new File( "C:\\Users\\Java\\Desktop\\Participante\\notas\\file\\carpetaEjemplo" );
       File file2 = new File( "C:\\Users\\Java\\Desktop\\Participante\\notas\\file\\carpetaEjemplo", "venta 2017-10-10.txt" );
       
       if( !file.exists() ){
           file.mkdir();
           System.out.println( "Carpeta creada" );
       } else{
           System.out.println( "La carpeta no se crea. Ya existe" );
       }
       
       file2.createNewFile( );
        System.out.println( "Archivo creado" );
       
    }
    
}
