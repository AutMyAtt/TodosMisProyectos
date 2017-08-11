package com.oracle.bean;

public class Nomina <M,T> {
    
    private M key;
    private T valor;

    public M getKey() {
        return key;
    }

    public void setKey(M key) {
        this.key = key;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
}
