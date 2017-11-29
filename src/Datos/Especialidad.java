
package Datos;


public class Especialidad {
    int IDESPECIALIDAD;
    String NOMBRE_ESP;

    public Especialidad() {
    }

    public Especialidad(int IDESPECIALIDAD, String NOMBRE_ESP) {
        this.IDESPECIALIDAD = IDESPECIALIDAD;
        this.NOMBRE_ESP = NOMBRE_ESP;
    }

    public int getIDESPECIALIDAD() {
        return IDESPECIALIDAD;
    }

    public void setIDESPECIALIDAD(int IDESPECIALIDAD) {
        this.IDESPECIALIDAD = IDESPECIALIDAD;
    }

    public String getNOMBRE_ESP() {
        return NOMBRE_ESP;
    }

    public void setNOMBRE_ESP(String NOMBRE_ESP) {
        this.NOMBRE_ESP = NOMBRE_ESP;
    }
    
}
