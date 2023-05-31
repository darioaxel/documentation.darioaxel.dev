import java.io.Serializable;

public class Tripulante implements Serializable {
    protected String nombre = "";
    protected String DNI = "";

    public Tripulante( String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
    public String toString() {
        return " Tripulante: " + nombre + " con DNI: " + DNI;
    }
}
