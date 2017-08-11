package com.netec.persona;

public interface iPersona {

    // Sólo meter constantes
    //public static final String NACIONALIDAD = "Mexicana";
    String NACIONALIDAD = "Mexicana";
    
    
    public abstract void comer( String comida );
    
    public void reproducirse( String persona );
    
}
