package set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();
        
        // No deja duplicados -> No los deja ordenados 
        lista.add( "E" );
        lista.add( "D" );
        lista.add( "C" );
        lista.add( "B" );
        lista.add( "A" );
        lista.add( "A" );
        lista.add( "C" );
        lista.add( "D" );
        lista.add( "E" );
        
        for (String elemento : lista) {
            System.out.println("Elemento: " + elemento);
        }
        
    }
    
}
