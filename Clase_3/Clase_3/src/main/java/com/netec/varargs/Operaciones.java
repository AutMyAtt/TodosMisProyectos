package com.netec.varargs;

public class Operaciones {

    public static void main(String[] args) {
        
        Operaciones operaciones = new Operaciones();
        float prom = operaciones.promedio( 1, 2, 3, 4 );
        System.out.println( "El promedio es: " + prom );
        
        Operaciones op = new Operaciones();
        op.calcularCalificaciones( "Ariel", "Colmputacion", 10, 10, 10, 9 );
    }
    
    public float promedio( int... calificaciones ){
        int suma = 0;
        
        for (int calificacion : calificaciones)
            suma += calificacion;
        
        return (float) suma / calificaciones.length;
    }
    
    public void calcularCalificaciones( String nombre, String carrera, int... calificaciones ){
        System.out.println( "Alumno: " + nombre );
        System.out.println( "Carrera: " + carrera );
        System.out.println( "Calificaciones: " );
        
        for (int calificacion : calificaciones) 
            System.out.println( "\t" + calificacion );
        
        System.out.println( "Promedio: " + this.promedio(calificaciones) );
        
    }
    
}
