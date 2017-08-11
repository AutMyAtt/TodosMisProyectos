package com.netec.abstractTest;

public class Casa {

    public static void main(String[] args) {
        // No se puede instanciar un objeto de una clase abstracta
        // Electrodomestico televisor = new Electrodomestico() {
        
        //Polimorfismo: El padre puede crear a objetos de sus hijos
        Electrodomestico pantalla = new Television();
        LineaBlanca secadora = new Lavadora();
        
        Television tele = new Television();
        Lavadora lava = new Lavadora();
        tele.encender();
        tele.tareaDomestica();
        tele.controlRemoto.marca = "Buena";
        tele.controlRemoto.combinacion( "AAA" );
        tele.apagar();
        lava.encender();
        lava.tareaDomestica();
        lava.apagar();
        
        pantalla.encender();
        // Este metodo no existe en Electrodomestico, por eso truena
        pantalla.tareaDomestica();
        pantalla.apagar();
        
        secadora.encender();
        secadora.tareaDomestica();
        secadora.apagar();
    }

}
