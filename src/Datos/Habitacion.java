
package Datos;


public class Habitacion {
    int CODHABITACION;
    String NOMBRE;
    int NUMCAMAS;
    int PISO;

    public Habitacion() {
    }

    public Habitacion(int CODHABITACION, String NOMBRE, int NUMCAMAS, int PISO) {
        this.CODHABITACION = CODHABITACION;
        this.NOMBRE = NOMBRE;
        this.NUMCAMAS = NUMCAMAS;
        this.PISO = PISO;
    }

    public int getCODHABITACION() {
        return CODHABITACION;
    }

    public void setCODHABITACION(int CODHABITACION) {
        this.CODHABITACION = CODHABITACION;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getNUMCAMAS() {
        return NUMCAMAS;
    }

    public void setNUMCAMAS(int NUMCAMAS) {
        this.NUMCAMAS = NUMCAMAS;
    }

    public int getPISO() {
        return PISO;
    }

    public void setPISO(int PISO) {
        this.PISO = PISO;
    }
    
}
