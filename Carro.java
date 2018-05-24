package carro;

/**
 *
 * @author carlosolarte
 */
public class Carro {

    private String placa;
    private Motor motor;
    private Roda rodas[];

    public Carro(String placa, Motor motor, Roda rodas[]) {
        this.placa = placa;
        this.motor = motor;
        this.rodas = rodas;
    }

    public String toString() {
        String s = new String();
        s += "Placa: " + this.placa + ". "
                + "Motor: " + this.motor + ". "
                + "\nRodas: ";
        for (int i = 0; i < this.rodas.length; i++) {
            s += "\n" + this.rodas[i];
        }

        return s;
    }

}
