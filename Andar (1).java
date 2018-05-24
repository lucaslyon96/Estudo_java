package estacionamentov3;

/**
 *
 * @author carlosolarte
 */
public class Andar {

    private int capacidade;
    private int vagas;

    //Construtor
    public Andar(int capacidade) {
        this.capacidade = capacidade;
        this.vagas = capacidade;
    }

    // Metodo Entrar
    public boolean entrar() {
        if (this.vagas == 0) {
            return false;
        } else {
            this.vagas--;
            return true;
        }

    }

    // Metodo Sair
    public boolean sair() {
        if (this.vagas == this.capacidade) {
            return false;
        } else {
            this.vagas++;
            return true;
        }
    }

    // Numero de Vagas
    public int vagas() {
        return this.vagas;
    }

    // Numero de Carros
    public int carros() {
        return this.capacidade - this.vagas;
    }

    public boolean temVagas() {
        return this.vagas > 0;
    }

    public boolean temCarros() {
        return (this.vagas != this.capacidade);
    }

    public String toString() {
        return "Vagas: " + vagas() + " Carros: " + carros();
    }

}
