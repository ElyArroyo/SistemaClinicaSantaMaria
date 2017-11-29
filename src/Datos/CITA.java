/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author okami
 */
public class CITA {
    int ID_CITAS;
    String DNI_PACIENTES;
    int DOCTOR_ID;
    String URGENCIA;
    Date FECHA_PROG;
    Date FECHA_REG;
    String NUM_ORDEN;

    public CITA(int ID_CITAS, String DNI_PACIENTES, int DOCTOR_ID, String URGENCIA, Date FECHA_PROG, Date FECHA_REG, String NUM_ORDEN) {
        this.ID_CITAS = ID_CITAS;
        this.DNI_PACIENTES = DNI_PACIENTES;
        this.DOCTOR_ID = DOCTOR_ID;
        this.URGENCIA = URGENCIA;
        this.FECHA_PROG = FECHA_PROG;
        this.FECHA_REG = FECHA_REG;
        this.NUM_ORDEN = NUM_ORDEN;
    }

    public CITA() {
    }

    public int getID_CITAS() {
        return ID_CITAS;
    }

    public void setID_CITAS(int ID_CITAS) {
        this.ID_CITAS = ID_CITAS;
    }

    public String getDNI_PACIENTES() {
        return DNI_PACIENTES;
    }

    public void setDNI_PACIENTES(String DNI_PACIENTES) {
        this.DNI_PACIENTES = DNI_PACIENTES;
    }

    public int getDOCTOR_ID() {
        return DOCTOR_ID;
    }

    public void setDOCTOR_ID(int DOCTOR_ID) {
        this.DOCTOR_ID = DOCTOR_ID;
    }

    public String getURGENCIA() {
        return URGENCIA;
    }

    public void setURGENCIA(String URGENCIA) {
        this.URGENCIA = URGENCIA;
    }

    public Date getFECHA_PROG() {
        return FECHA_PROG;
    }

    public void setFECHA_PROG(Date FECHA_PROG) {
        this.FECHA_PROG = FECHA_PROG;
    }

    public Date getFECHA_REG() {
        return FECHA_REG;
    }

    public void setFECHA_REG(Date FECHA_REG) {
        this.FECHA_REG = FECHA_REG;
    }

    public String getNUM_ORDEN() {
        return NUM_ORDEN;
    }

    public void setNUM_ORDEN(String NUM_ORDEN) {
        this.NUM_ORDEN = NUM_ORDEN;
    }

    
    
}
