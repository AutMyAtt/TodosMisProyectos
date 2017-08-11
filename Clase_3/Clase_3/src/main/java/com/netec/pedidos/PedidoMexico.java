package com.netec.pedidos;

import static com.netec.pedidos.enums.Paises.*;

public class PedidoMexico extends Pedido {

    @Override
    protected void calcularIVA() {
        this.pais = MEXICO.toString();
        importeIVA = importeSinIVA * MEXICO.getIva();
    }
    
}
