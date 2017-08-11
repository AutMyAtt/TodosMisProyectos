package com.netec.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Herramientas {

    // Metodo que convierte string a Date
    public static Date getFecha( String fecha ){
        SimpleDateFormat formato = new SimpleDateFormat( "dd/MM/yyyy" );
        
        String strFecha = fecha;
        Date fechaDate = null;
        
        try{
            fechaDate = formato.parse( strFecha );
        } catch( Exception e ){
            e.printStackTrace();
        } finally{
            return fechaDate;
        }
    }
    
}
