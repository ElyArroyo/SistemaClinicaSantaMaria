
package Datos;

public class Doctor {
    int CODDOCTOR;
    String DNI;
    String NOMBRE;
    String APELLIDOS;
    int IDESPECIALIDAD;
    int LIM_PACIENTE;

    public Doctor() {
    }

    public Doctor(int CODDOCTOR, String NOMBRE, String APELLIDOS, int IDESPECIALIDAD, int LIM_PACIENTE,String DNI) {
        this.CODDOCTOR = CODDOCTOR;
        this.DNI=DNI;
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.IDESPECIALIDAD = IDESPECIALIDAD;
        this.LIM_PACIENTE = LIM_PACIENTE;
    }

    public int getCODDOCTOR() {
        return CODDOCTOR;
    }

    public void setCODDOCTOR(int CODDOCTOR) {
        this.CODDOCTOR = CODDOCTOR;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public int getIDESPECIALIDAD() {
        return IDESPECIALIDAD;
    }

    public void setIDESPECIALIDAD(int IDESPECIALIDAD) {
        this.IDESPECIALIDAD = IDESPECIALIDAD;
    }

    public int getLIM_PACIENTE() {
        return LIM_PACIENTE;
    }

    public void setLIM_PACIENTE(int LIM_PACIENTE) {
        this.LIM_PACIENTE = LIM_PACIENTE;
    }
    
    
}
