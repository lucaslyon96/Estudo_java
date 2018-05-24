package estacionamentov3;

/**
 *
 * @author carlosolarte
 */
public class Estacionamento {

    private Andar[] andares;

    public Estacionamento(int cap_andar_1, int cap_andar_2, int cap_andar_3) {
        this.andares = new Andar[3];
        this.andares[0] = new Andar(cap_andar_1);
        this.andares[1] = new Andar(cap_andar_2);
        this.andares[2] = new Andar(cap_andar_3);
    }

    public void entrar(int andar) {
        if (andar < 0 || andar > 2) {
            System.out.println("Andar nao valido");
        } else if (andares[andar].temVagas()) {
            andares[andar].entrar();
        } else {
            System.out.println("Andar sem vagas");

        }
    }

    public void sair(int andar) {
        if (andar < 0 || andar > 2) {
            System.out.println("Andar nao valido");
        } else if (andares[andar].temCarros()) {
            andares[andar].sair();
        } else {
            System.out.println("Andar sem carros");

        }
    }

    public String toString() {
        return "Andar 0:" + this.andares[0]
                + "\nAndar 1:" + this.andares[1]
                + "\nAndar 2:" + this.andares[2];
    }

}
