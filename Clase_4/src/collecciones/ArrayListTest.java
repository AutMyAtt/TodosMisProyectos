package collecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {

    public static void main(String[] args) {
        
        // Si no se define, trabaja sobre cualquier objeto
        /*ArrayList arrayList = new ArrayList();
        arrayList.add("Cadena");
        arrayList.add( 23 );
        arrayList.add( 5.3 );
        */
        
        // Se define para que sólo acepte un tipo de Objeto
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add( 2 );
        arrayList.add( 23 );
        arrayList.add( 100 );        
        arrayList.add( 13 );        
        arrayList.add( 0 );        
        
        System.out.println( "Tamano arreglo: " + arrayList.size() );
        System.out.println( "Esta contenido el 13? " + arrayList.contains( 13 ) );
        System.out.println( "Sin ordenar: " + arrayList );
        Collections.sort( arrayList );
        System.out.println( "Ordenado: " + arrayList );
        
        ArrayList<Persona> arrayListPersona = new ArrayList<Persona>();
        arrayListPersona.add( new Persona( "Raul", "Perez" ) );
        Persona raulPerez = new Persona( "Raul", "Perez" );
        System.out.println( "Tamano arreglo: " + arrayListPersona.size() );
        // Marca falso, por la referencia, no contenido del objeto.
        System.out.println( "Esta contenido el Raul Perez? " + arrayListPersona.contains( raulPerez ) );
        
        
        Persona pepe = new Persona( "Pepe", "Piña" );
        Profesor profe = new Profesor();
        profe.name = "Joel";
        profe.lastName = "Perez";
        profe.especialidad = "fisica";
        arrayListPersona.add( pepe );
        arrayListPersona.add( profe );
        
        System.out.println( "Arreglo de personas y profes: " + arrayListPersona );
        
        
        Iterator iterar = arrayListPersona.iterator();
        while ( iterar.hasNext() ){
            System.out.println( "Iterator" );
            System.out.println( iterar.next() );
        }
        
    }
    
}
