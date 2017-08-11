package com.mycompany.ejemplos;

public class TestEmpleado {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        
        // Esto funciona cuando las var son públicas
        //empleado.edad = -2;
        
        // Cuando son privadas, se accede por getters y setters
        empleado.setEdad( 50 );
        
    }
    
}
