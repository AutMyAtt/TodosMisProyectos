package com.netec.abstractTest;

public class Lavadora extends LineaBlanca {

    @Override
    public void tareaDomestica() {
        System.out.println( "Lavar ropa" );
    }

    @Override
    public void encender() {
        System.out.println( "Encendido automatico" );
    }

    @Override
    public void apagar() {
        System.out.println( "Apagado automatico" );
    }
    
}
