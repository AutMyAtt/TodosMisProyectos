package com.netec.test;

import com.netec.testdefault.EmpleadoDao;

public class TestDao {

    public static void main(String[] args) {
        EmpleadoDao dao = new EmpleadoDao();
        // Desde aqui no se puede acceder a variables default de otros paquetes
    }
    
}
