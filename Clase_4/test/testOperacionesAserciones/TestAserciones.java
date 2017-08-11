package testOperacionesAserciones;

import asercionesOperaciones.Operaciones;
import org.junit.Test;
import org.junit.Assert;

public class TestAserciones {

    @Test
    public void testSuma( ){
        Operaciones op = new Operaciones();
        int sum = op.sumar( 5, 6 );
        System.out.println("Suma: " + sum);
        Assert.assertEquals( 11, sum);
    }
    
    @Test
    public void testResta( ){
        Operaciones op = new Operaciones();
        int res = op.restar(11, 12);
        System.out.println("Resta: " + res);
        Assert.assertEquals( -1, res);
    }
    
}
