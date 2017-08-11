package com.oracle.consulta.dao;

import com.oracle.consultas.dao.DoctorDao;
import com.oracle.consultas.dao.DoctorDaoImpl;
import com.oracle.consultas.model.Doctor;
import org.junit.Test;

public class DoctorDaoTest {
    
    @Test
    public void crearDoctorTest() {
        // Polimorfismo
        DoctorDao doctorDao = new DoctorDaoImpl();
        
//        Doctor simi = new Doctor();
//        simi.setCodigo( 1 );
//        simi.setNombre( "Dr. Simi" );
//        simi.setApellido( "Juarez" );
//        simi.setEspecialidad( "Generico" );
        
//        doctorDao.crearDoctor( simi );
       
    }
        
}
