package classroom;

public class Persona {

    long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;        
    }

    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        setTotalPersonas(getTotalPersonas()+1);
    }    
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        setTotalPersonas(getTotalPersonas()+1);
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        setTotalPersonas(getTotalPersonas()+1);
    }

    Persona() {
        this.nombre = "";
        setTotalPersonas(getTotalPersonas()+1);
    }
    
    Persona(String nombre){
    	this(nombre, 1);
    }
    
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static void setTotalPersonas(int totalPersonas) {
    	Persona.totalPersonas = totalPersonas;
    }
    
    static int getTotalPersonas(){
    	return totalPersonas;
    }
    
}
