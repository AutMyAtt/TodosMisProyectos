package com.mycompany.ejemplos;

public class Empleado {

    //public int edad;
    //public String nombre;
    
    // Se ponen privadas para que desde otras clases no se pueda acceder
    private int edad;
    private String nombre;

    // Sólo se puede acceder a ellas con getters y setters desde otras clases
    // Esto se hace para proteger las variables. Ej. validarlas.
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if ( edad < 0 ) {
            System.out.println( "Edad no permitida. Es necesario ser mayor a 0" );
        } else if ( edad > 100 ) {
            System.out.println( "Edad muy alta. Favor visitar atencion a clientes" );
        } else {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
