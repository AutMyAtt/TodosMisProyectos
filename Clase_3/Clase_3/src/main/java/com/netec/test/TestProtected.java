package com.netec.test;

import com.netec.testprotected.Direccion;
import java.math.BigDecimal;

public class TestProtected extends Direccion {

    public static void main(String[] args) {
        Direccion direccion = new Direccion();
        // Desde aqui no se puede acceder a los valored protected de otro paquete.
        // Sólo si esta clase hereda (extends)
        //direccion.
        
        // Aqui si puedo ver los objetos protected
        TestProtected dir = new TestProtected();
        dir.nombreDireccion = "AAA";
        dir.salarioDireccion = new BigDecimal(10.0*0.25);
                
        // Tampoco se ven si son por default
                
    }
    
}
