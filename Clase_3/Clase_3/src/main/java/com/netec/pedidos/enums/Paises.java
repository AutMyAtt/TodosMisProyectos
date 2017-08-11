package com.netec.pedidos.enums;

public enum Paises {

    MEXICO( 0.16f, "www.contacto.com" ),
    ESPANA( 0.21f ),
    ARGENTINA( 0.20f ),
    FRANCIA( 0.30f );
    
    private float iva;
    private String contacto;
    
    private Paises( float iva ){
        this.iva = iva;
    }
    
    private Paises( float iva, String contacto ){
        this.contacto = contacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    
}
