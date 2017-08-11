package collecciones;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPerformance {

    public static void main(String[] args) {
        
        long inicio2 = System.currentTimeMillis();
        List<Integer> lista = new ArrayList<Integer>();
        
        for( int i = 0; i < 10000000; i++ ){
            lista.add( i );
        }
        
        long fin2 = System.currentTimeMillis();
        System.out.println( "Primera ejecucion: " + (fin2 - inicio2) );
        
        ///////////////////////////////////////////////////////////////
        // Si sabemos que son 10,000,000 registros:
        long inicio1 = System.currentTimeMillis();
        List<Integer> listaDef = new ArrayList<Integer>(10000000);
    
        for( int i = 0; i < 10000000; i++ ){
            listaDef.add( i );
        }
    
        long fin1 = System.currentTimeMillis();
        System.out.println( "Primera ejecucion: " + (fin1 - inicio1) );
    
    
    }
    
}
