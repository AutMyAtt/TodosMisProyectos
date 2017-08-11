package com.netec.pedidos;

public class Usuario {

    public static void main(String[] args) {
        Pedido pedidoMexico = new PedidoMexico();
        Pedido pedidoEspana = new PedidoEspana();
        
        pedidoMexico.setImporteSinIVA( 10000 );
        pedidoMexico.calcularPrecioConIVA();
        pedidoMexico.visualiza();
        
        pedidoEspana.setImporteSinIVA( 10000 );
        pedidoEspana.calcularPrecioConIVA();
        pedidoEspana.visualiza();
        
    }
    
}
