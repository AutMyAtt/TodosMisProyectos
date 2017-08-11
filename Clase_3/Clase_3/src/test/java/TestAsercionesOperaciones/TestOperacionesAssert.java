package TestAsercionesOperaciones;

import AsercionesOperaciones.OpreacionesAssert;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestOperacionesAssert {

    @Test
    public void testOperaciones( ){
        OpreacionesAssert op = new OpreacionesAssert();
        int res = op.sumar( 4, 5 );
        Assert.assertEquals( 9, res);
    }
    
}
