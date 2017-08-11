package ordenar;

import java.util.ArrayList;
import java.util.Collections;

public class TestOrder {

    public static void main(String[] args) {
        
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        Alumno alumno = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        Alumno alumno5 = new Alumno();
        Alumno alumno6 = new Alumno();
        Alumno alumno7 = new Alumno();
        
        alumno.nombre = "Felipe";
        alumno.edad = 65;
        
        alumno2.nombre = "Tania";
        alumno2.edad = 28;
        
        alumno3.nombre = "Ariel";
        alumno3.edad = 10;

        alumno4.nombre = "Filemon";
        alumno4.edad = 10;
        
        alumno5.nombre = "Federico";
        alumno5.edad = 15;
        
        alumno6.nombre = "Ana";
        alumno6.edad = 10;
        
        alumno7.nombre = "Alejandro";
        alumno7.edad = 10;
        
        listaAlumnos.add( alumno );
        listaAlumnos.add( alumno2 );
        listaAlumnos.add( alumno3 );
        listaAlumnos.add( alumno4 );
        listaAlumnos.add( alumno5 );
        listaAlumnos.add( alumno6 );
        listaAlumnos.add( alumno7 );
        
        System.out.println( "Lista sin ordenar: " );
        for (Alumno al : listaAlumnos) {
            System.out.println( al );
        }
        
        Collections.sort( listaAlumnos );
        System.out.println( "Lista ordenada: " );
        
        for (Alumno al : listaAlumnos) {
            System.out.println( al );
        }
    }
    
}
