package sistemadepositosagua;

/**
 *
 * @author Miguel-maps
 */
public class SistemaDepositosAgua {

    public static void main(String[] args) {

        Deposito depoA = new Deposito("depoA", 100);
        System.out.println("depoA " + depoA);

        /*
        Primer test: añadir y quitar agua dentro de su capacidad máxima
         */
        depoA.añadirAgua(50);
        System.out.println("depoA " + depoA);

        depoA.quitarAgua(25);
        System.out.println("depoA " + depoA);

        /*
        Segundo test: Añadir y quitar agua excediendo su capacidad máxima
         */
        depoA.añadirAgua(500);
        System.out.println("depoA " + depoA);

        depoA.quitarAgua(500000);
        System.out.println("depoA " + depoA);

    }

}
