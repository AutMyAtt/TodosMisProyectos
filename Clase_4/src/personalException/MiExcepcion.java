package personalException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MiExcepcion extends Exception {

    private int code;
    private String descripcion;
    private Date date;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDate() {
        DateFormat fecha = new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
        return fecha.format( date );
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    // Sobrecargar metodo a mi medida}
    public MiExcepcion( int code, String descripcion, Date date, String mensaje ){
        super( mensaje );   // LLamar al contructor de la clase Exception
                            // Debe ser la primer línea del método
        this.code = code;
        this.descripcion = descripcion;
        this.date = date;
        
        System.out.println("Error code: " + code);
        System.out.println("Error desc: " + descripcion);
        System.out.println("Error date: " + date);
    }
    
    public MiExcepcion() {
    }

    public MiExcepcion(String message) {
        super(message);
    }

    public MiExcepcion(String message, Throwable cause) {
        super(message, cause);
    }

    public MiExcepcion(Throwable cause) {
        super(cause);
    }

    public MiExcepcion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
