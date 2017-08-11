package com.netec.abstractTest;

public abstract class Electrodomestico {

    public String name;
    
    public abstract void encender();
    
    public abstract void apagar();
    
    public void medirEnergiaElectrica(  ){
        System.out.println( "Mucha energia" );
    }
    
}
