package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo2 {

    public static void main(String[] args) {
        File file = new File( "C:\\Users\\Java\\Desktop\\Participante\\notas\\file\\ejemplo2.txt" );
        
        try {
            PrintWriter pw = new PrintWriter( file );
            pw.print( "Lavadora:\n" );
            pw.print( "\tNo mas 50 pesitos semanales" );
            pw.flush();
            pw.close();
            
            FileReader fr = new FileReader( file );
            BufferedReader br = new BufferedReader( fr );
            
            String data = br.readLine();
            String data2 = br.readLine();
            br.close();
            
            System.out.println( data );
            System.out.println( data2 );
            
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
