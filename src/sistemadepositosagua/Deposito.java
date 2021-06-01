package sistemadepositosagua;

/**
 *
 * @author Miguel-maps
 */
public class Deposito {

    private String nombre;
    private int capacidadMax;
    private int contenidoActual;

    // Los depósitos empiezan vacíos, pero se puede especificar su capacidad máxima    
    public Deposito(String nombre, int capacidadMax) {
        this.nombre = nombre;
        this.capacidadMax = capacidadMax;
        this.contenidoActual = 0;
    }

    /* 
    Los siguientes dos methods representan la posibilidad de que el depósito
    reciba y deje salir agua, sin poder exceder su capacidad máxima ni poder
    vaciarse por debajo de cero.
     */
    
    public void añadirAgua(int agua) {
        if (this.contenidoActual + agua > this.capacidadMax) {
            this.contenidoActual = this.capacidadMax;
        } else {
            this.contenidoActual += agua;
        }
    }
    
    public void quitarAgua(int agua) {
        if (this.contenidoActual - agua < 0) {
            this.contenidoActual = 0;
        } else {
            this.contenidoActual -= agua;
        }
    }
    
    // Getters y toString.    
    public String getNombre() {
        return this.nombre;
    }

    public int getCapacidadMax() {
        return this.capacidadMax;
    }

    public int getContenidoActual() {
        return this.contenidoActual;
    }

    public String toString() {
        return this.contenidoActual + "/" + this.capacidadMax;
    }

}
