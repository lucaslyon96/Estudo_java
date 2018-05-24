package carro;

/**
 *
 * @author carlosolarte
 */
public class Motor {

    private double potencia;

    public Motor(double potencia) {
        this.potencia = potencia;
    }

    // set/get
    public double getPotencia() {
        return this.potencia;
    }

    public String toString() {
        return "Potencia= " + this.potencia;
    }

}
