package com.oracle.consultas.controller;

import com.oracle.consultas.dao.DoctorDao;
import com.oracle.consultas.dao.DoctorDaoImpl;
import com.oracle.consultas.model.Doctor;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean        // Permite la comunicación entre la vista y el controlador
@RequestScoped
public class DoctorBean {
    private Doctor doctor = new Doctor();

    // Forzosamente se necesitan getters y setters, para acceder desde la Vista
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    public void registrar(){
        System.out.println("============== " + doctor);
        DoctorDao dao = new DoctorDaoImpl();
        dao.crearDoctor(doctor);
    }
    
}
