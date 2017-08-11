package set;

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {

    public static void main( String[] args ){
        
        // HashMap
        Map<Integer,String> diccionario = new HashMap<Integer, String>();
        
        diccionario.put( 10, "ID");
        diccionario.put( 25, "NOMBRE");
        diccionario.put( 38, "TAM");
        
        System.out.println( "Tamano del hash: " + diccionario.size() );
        
        for( Entry<Integer, String> e: diccionario.entrySet() ){
            System.out.println( "Llave " + e.getKey() + " :: " + "Valor " + e.getValue() );
        }
        
    }
    
}
