package sistemadepositosagua;

/**
 *
 * @author Miguel-maps
 */
import java.util.List;
import java.util.ArrayList;

public class SistemaAgua {

    private List<Deposito> depositos;

    public SistemaAgua() {
        this.depositos = new ArrayList<>();
    }

    /*
    Operación 1: Traspasar agua de un depósito a otro, especificando cantidad.
    No es posible mandar más agua de la que ya contiene el depósito.
    Tampoco es posible que un depósito se traspase agua a sí mismo.
     */
    public void traspasarAgua(Deposito emisor, int cantidadEmisor, Deposito receptor) {
        while (true) {
            // Impedir que un depósito se mande agua a sí mismo.
            if (emisor.equals(receptor)) {
                break;
            }
            // Impedir que se envíe más agua de la que hay en el depósito.
            if (cantidadEmisor > emisor.getContenidoActual()) {
                cantidadEmisor = emisor.getContenidoActual();
            }
            // Impedir cualquier traspaso si el receptor está lleno.
            if (receptor.getContenidoActual() == receptor.getCapacidadMax()) {
                cantidadEmisor = 0;
            }

            receptor.añadirAgua(cantidadEmisor);
            emisor.quitarAgua(cantidadEmisor);
            break;
        }
    }

    // Operación 2: Llenar un depósito específico según cantidad.
    public void llenarDeposito(Deposito depo, int cantidad) {
        depo.añadirAgua(cantidad);
    }

    // Operación 3: Vaciar un depósito específico según cantidad.
    public void vaciarDeposito(Deposito depo, int cantidad) {
        depo.quitarAgua(cantidad);
    }
    
    public void addDeposito(Deposito depo) {
        this.depositos.add(depo);
    }

    public int getCapacidadTotalDepositos() {
        int sum = 0;
        for (Deposito d : this.depositos) {
            sum = sum + d.getCapacidadMax();
        }
        return sum;
    }

    public int getAguaEnUso() {
        int sum = 0;
        for (Deposito d : this.depositos) {
            sum = sum + d.getContenidoActual();
        }
        return sum;
    }

    public int porcentajeEnUso() {
        double uso = getAguaEnUso();
        double total = getCapacidadTotalDepositos();
        return (int) (((uso / total) * 100));
    }

    public String toString() {
        return "Este sistema tiene " + this.depositos.size() + " depósitos.\n"
                + "Actualmente, se están usando " + getAguaEnUso() + " litros.\n"
                + "La capacidad total de todos los depósitos es de " + getCapacidadTotalDepositos() + " litros.\n"
                + "El sistema está al " + porcentajeEnUso() + "% de su capacidad";
    }

}
