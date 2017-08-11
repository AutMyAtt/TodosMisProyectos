package com.netec.abstractTest;

// IS A
public class Television extends LineaBlanca {

    // HAS A
    public ControlRemotoUniversal controlRemoto;
    
    // Se necesitan implementar todos sus metodos abstractos
    // utilizando sobreescritura
    @Override
    public void tareaDomestica() {
        System.out.println( "Ver pelis" );
    }

    @Override
    public void encender() {
        System.out.println( "Con el dedo; no hay control" );
    }

    @Override
    public void apagar() {
        System.out.println( "Igual que el encendido" );
    }
    
}
