package com.netec.pedidos;

import static com.netec.pedidos.enums.Paises.*;

public class PedidoEspana extends Pedido {

    @Override
    protected void calcularIVA() {
        this.pais = ESPANA.toString();
        importeIVA = importeSinIVA * ESPANA.getIva();
    }
    
}
