package com.oracle.consultas.dao;

import com.oracle.consultas.model.Doctor;
import java.sql.PreparedStatement;
import java.util.List;

// El extends es para heredar la conexion
// El implements es para implementar los métodos declarados
public class DoctorDaoImpl extends Dao implements DoctorDao{

    // Manejar el sql como constante
    private String crearSql = "INSERT INTO DOCTOR ( CODIGO, NOMBRE, APELLIDO, ESPECIALIDAD ) VALUES( ?, ?, ?, ? )";
    
    // TODOS los métodos de DoctorDao deben estar aqui
    @Override
    public void crearDoctor( Doctor doctor ){
        this.conectar();
        try{
            PreparedStatement pst = this.getConnection().prepareStatement( crearSql );
            pst.setInt( 1, doctor.getCodigo() );
            pst.setString( 2, doctor.getNombre() );
            pst.setString( 3, doctor.getApellido() );
            pst.setString( 4, doctor.getEspecialidad() );
            
            pst.executeUpdate();
            
        } catch( Exception e ) {
            e.printStackTrace();
        } finally {
            this.cerrarConexion();
        }
        
    }

    @Override
    public void eliminarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Doctor buscarDoctor(Doctor doctor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Doctor> listarDoctores() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
