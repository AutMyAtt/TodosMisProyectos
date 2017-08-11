package com.netec.StaticTest;

import com.netec.util.Herramientas;
import java.util.Date;
// Importa todas las utilerias para facilitar su manejo
import static java.lang.Math.*;

public class TestStatic {

    private static final boolean [] switches = new boolean[5];
    
    // Sólo se ejecuta una vez, antes del main
    // Se puede utilizar para cargar archivos de configuración
    static {
        System.out.println( "Este método static se ejecuta antes de main" );
        System.out.println( "Cargando valores" );
        for( int i = 0; i < switches.length; i++ ){
            switches[i] = true;
        }
        
    }
    
    public static void main(String[] args) {
        
        // Som instanciar el objeto, se pueden utilizar sus metodos
        // Math.
       
        // Esto si en utils no es estático
        Herramientas  herramientas = new Herramientas();
        Date fecha = herramientas.getFecha( "13/11/1456" );
        System.out.println( "Fecha: " + fecha );
        
        // Cuando el método en utils es estático, no es necesario instanciarlo:
        Date fecha2 = Herramientas.getFecha( "13/11/1456" );
        System.out.println( "Fecha con static: " + fecha2 );
        
        // Cuando se hace el import estatico:
        Date fecha3 = Herramientas.getFecha( "13/11/1456" );
        System.out.println( "Fecha con import static: " + fecha3 );
        double rdm = random();
        System.out.println( "Valor random con static import: " + rdm );
        
        System.out.println( "Valor de pi: " + Math.PI );
        
        System.out.println( "Apagando algunos switches" );
        switches[1] = false;
        switches[3] = false;
        
        for(boolean swit:switches) {
            System.out.println( swit );
        }
        
        String nombre = "Juan";
        for( int i = 0; i < 1; i++ ){
        //for( ;; ){
            nombre += nombre;
            System.out.println("Nombre: " + nombre);
        }
           
        StringBuilder con = new StringBuilder("Nombre | nombre - ");
        StringBuffer con2;
        
        while( true ){
            con.append( con );
            System.out.println( con );
        }
    }
    
}
