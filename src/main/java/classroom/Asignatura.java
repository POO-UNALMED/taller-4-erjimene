package classroom;

public class Asignatura {

    String nombre;    
    int codigoInterno;
    long codigoExterno;

    Asignatura() {
        this("Sin nombre");        
    }

    Asignatura(int codigoInterno) {
        this("Sin nombre", codigoInterno, 0);
    }

    Asignatura(long codigoExterno) {
        this("Sin nombre", 0, codigoExterno);
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    Asignatura(String nombre, int codigoInterno, long codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, long codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }     

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }    

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
    
    void cambiarDatos(long codigoExterno) {
        this.codigoExterno = codigoExterno;
    }
    
    public void setCodigoExterno(double codigoExterno) {
        this.codigoExterno = (long) codigoExterno;
    }
}
