package service;

import dao.AccesoDao;

public class Service {

    public static void main(String[] args) {
        
        try{
            Service.conectarOracle( "url.oracle" );
        } catch( Exception e ){
            e.printStackTrace();
        }
        
    }
    
    public static void conectarOracle( String url ) throws Exception{
        AccesoDao dao = new AccesoDao();
        dao.conectarBase();
    }
    
}
