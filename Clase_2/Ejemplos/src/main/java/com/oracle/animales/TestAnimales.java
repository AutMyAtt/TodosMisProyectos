package com.oracle.animales;

class Animal {
    String nombre;
    
    public Animal( String nombre ){
        this.nombre = nombre;
    }
    
    Animal reproducirse( Animal a ){
        Animal hijo = new Animal( nombre );
        return hijo;
    }
}

class Gato extends Animal{
    
    public Gato( String nombre ){
        super( nombre );    // Ejecuta el constructor de la clase que hereda
    }
    
    @Override   // Sobreescritura de método
    Animal reproducirse( Animal animal ){
        Gato gato = null;
        if( !(animal instanceof Gato) )
            System.out.println( "No se puede reproducir" );
        else
            gato = new Gato( "Gato Bebe" );
        
        return gato;
    }
}

class Perro extends Animal{
    
    public Perro( String nombre ){
        super( nombre );
    }
    
    @Override
    Animal reproducirse( Animal animal ){
        return new Animal( "Soy perro" );
    }
}

public class TestAnimales {
    
    public static void main(String[] args) {
        Perro p = new Perro( "Scoobidoo" );
        Gato g = new Gato( "Benito" );
        
        System.out.println( "Nuevo hijo: " + g.reproducirse( p ) );
    }
}


