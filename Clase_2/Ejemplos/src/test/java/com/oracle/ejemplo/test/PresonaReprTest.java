package com.oracle.ejemplo.test;

import com.oracle.bean.Persona;

public class PresonaReprTest {
    
    public static void main(String[] args) {
        Persona julio = new Persona();
        julio.nombre = "Julio";
        julio.sexo = 'M';
        
        Persona julia = new Persona();
        julia.nombre= "Julia";
        julia.sexo = 'F';
        
        julio.reproducirse( julia );
        julia.reproducirse( julio );
    }
}
