package estacionamentov3;

/**
 *
 * @author carlosolarte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estacionamento E = new Estacionamento(10, 20, 15);
        System.out.println(E);
        E.entrar(2);
        System.out.println(E);
        E.entrar(1);
        System.out.println(E);
        E.entrar(2);
        System.out.println(E);
        E.sair(0);
        System.out.println(E);

    }

}
