import java.io.Serializable;
import java.util.ArrayList;

public class Avion implements Serializable {
    protected String nombre = "";
    protected int capacidad = 0;
    protected ArrayList<Tripulante> tripulación = new ArrayList<>();

    public Avion( String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public boolean addTripulante(Tripulante tripulante) {
        return tripulación.add(tripulante);
    }

    public String toString() {
        String texto =  " Avión: " + this.nombre +  " con capacidad: " + this.capacidad +": \n";
        for(var t : tripulación) {
            texto = texto + t.toString();
        }
        return texto;
    }
}
