package com.netec.pedidos;

public abstract class Pedido {

    protected String pais;
    protected double importeSinIVA;
    protected double importeConIVA;
    protected double importeIVA;
    
    protected abstract void calcularIVA();
    
    public void calcularPrecioConIVA(){
        this.calcularIVA();
        importeConIVA = importeSinIVA + importeIVA;
    }
    
    public void setImporteSinIVA( double importeSinIVA ){
        this.importeSinIVA = importeSinIVA;
    }
    
    public void visualiza(){
        System.out.println( "Pedido: " + this.pais );
        System.out.println( "Importe sin IVA: " + importeSinIVA );
        System.out.println( "Importe con IVA: " + importeConIVA );
        System.out.println( "IVA aplicado: " + importeIVA );
        System.out.println( "" );
    }
    
}
