
package Datos;




public class Pacientes {
    String DNI;
    String NOMBRES;
    String APELLIDOS;
    String DIRECCION;
    int TELEFONO;
    String SEGURIDAD_SOCIAL;
    String MUTUALIDAD;
    
    public Pacientes() {
    }

    public Pacientes(String DNI, String NOMBRES, String APELLIDOS, String DIRECCION, int TELEFONO, String SEGURIDAD_SOCIAL, String MUTUALIDAD) {
        this.DNI = DNI;
        this.NOMBRES = NOMBRES;
        this.APELLIDOS = APELLIDOS;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
        this.SEGURIDAD_SOCIAL = SEGURIDAD_SOCIAL;
        this.MUTUALIDAD = MUTUALIDAD;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNOMBRES() {
        return NOMBRES;
    }

    public void setNOMBRES(String NOMBRES) {
        this.NOMBRES = NOMBRES;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public void setAPELLIDOS(String APELLIDOS) {
        this.APELLIDOS = APELLIDOS;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public int getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(int TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getSEGURIDAD_SOCIAL() {
        return SEGURIDAD_SOCIAL;
    }

    public void setSEGURIDAD_SOCIAL(String SEGURIDAD_SOCIAL) {
        this.SEGURIDAD_SOCIAL = SEGURIDAD_SOCIAL;
    }

    public String getMUTUALIDAD() {
        return MUTUALIDAD;
    }

    public void setMUTUALIDAD(String MUTUALIDAD) {
        this.MUTUALIDAD = MUTUALIDAD;
    }
    
    
}
