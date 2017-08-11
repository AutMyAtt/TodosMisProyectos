package com.oracle.bean;

public class Persona {
    
    Persona padre;
    Persona madre;
    
    public String nombre;
    public char sexo;
    
    public Persona reproducirse( Persona p ){
        Persona hijo = null;
        
        if( p!=null && (this.sexo != p.sexo) ){
            hijo = new Persona();
            switch ( this.sexo ) {
                case 'F':
                    hijo.madre = this;
                    hijo.padre = p;
                    break;
                case 'M':
                    hijo.madre = p;
                    hijo.padre = this;
                    break;
                default:
                    System.out.println( "Falta sexo opuesto" );
                    return null;
            }

            System.out.println( "Madre: " + hijo.madre.nombre );
            System.out.println( "Padre: " + hijo.padre.nombre );
        }
        else{
            System.out.println( "Se necesitan dos personas de diferente sexo" );
        }
        
        return hijo;
    }
    
}
