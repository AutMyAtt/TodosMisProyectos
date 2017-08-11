package lambdasMisClases;

public class OperacionLambda {

    public static void main(String[] args) {
        
        OperacionLambda op = new OperacionLambda();
        op.calcular( 6, 20 );
    }
    
    public void calcular( double a, double b ){
        IOperaciones operacion;
        operacion = ( double x, double y ) -> {
            return (x+y)/2;
        };
        
        System.out.println( "Promedio: " + operacion.calcularPromedio( a, b ) );
    }
    
}
