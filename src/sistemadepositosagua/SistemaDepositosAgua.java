package sistemadepositosagua;

/**
 *
 * @author Miguel-maps
 */
public class SistemaDepositosAgua {

    public static void main(String[] args) {

        SistemaAgua sistema = new SistemaAgua();

        Deposito depoA = new Deposito("depoA", 100);
        depoA.añadirAgua(60);
        Deposito depoB = new Deposito("depoB", 100);
        depoB.añadirAgua(30);
        System.out.println("depoA " + depoA);
        System.out.println("depoB " + depoB);

        sistema.addDeposito(depoA);
        sistema.addDeposito(depoB);
        System.out.println(sistema);

        /*
        Primer test: Traspasar agua dentro de los límites.
         */
        System.out.println("\n*************\n" + "Traspasando 50 litros de agua desde 'depoA' a 'depoB'" + "\n*************\n");
        sistema.traspasarAgua(depoA, 50, depoB);
        System.out.println("depoA " + depoA);
        System.out.println("depoB " + depoB);
        System.out.println(sistema);

        /*
        Segundo test: Intentar traspasar agua de un depósito a sí mismo.
         */
        System.out.println("\n*************\n" + "Traspasando 50 litros de agua desde 'depoA' a 'depoA'" + "\n*************\n");
        sistema.traspasarAgua(depoA, 50, depoA);
        System.out.println("depoA " + depoA);

        /*
        Tercer test: Intentar pasar más agua de la que hay a otro depósito.
         */
        System.out.println("\n*************\n" + "Traspasando 50 litros de agua desde 'depoA' a 'depoB'" + "\n*************\n");
        sistema.traspasarAgua(depoA, 50, depoB);
        System.out.println("depoA " + depoA);
        System.out.println("depoB " + depoB);
        System.out.println(sistema);

        /*
        Cuarto test: Intentar pasar agua a un depósito que ya esté lleno.
         */
        System.out.println("\n*************\n" + "Añadiendo 70 litros a depoA\n" + "Añadiendo 100 litros a depoB\n"
                + "Traspasando 50 litros de agua desde 'depoA' a 'depoB'" + "\n*************\n");
        sistema.llenarDeposito(depoA, 70);
        sistema.llenarDeposito(depoB, 100);
        sistema.traspasarAgua(depoA, 50, depoB);
        System.out.println("depoA " + depoA);
        System.out.println("depoB " + depoB);
        System.out.println(sistema);
        
        /*
        Quinto test: Probar el method vaciarDeposito()
        */
        
        sistema.vaciarDeposito(depoA, 35);
        System.out.println("depoA " + depoA);

    }

}
