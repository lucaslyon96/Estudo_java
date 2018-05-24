package carro;

/**
 *
 * @author carlosolarte
 */
public class Roda {

    private double pressao;

    public Roda(double pressao) {
        this.pressao = pressao;
    }

    // set/get
    public double getPressao() {
        return this.pressao;
    }

    public void setpressao(double val) {
        this.pressao = val;
    }

    public String toString() {
        return "Pressao: " + this.pressao;
    }

}
