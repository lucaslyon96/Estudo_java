package carro;

/**
 *
 * @author carlosolarte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Motor m = new Motor(1800);
    Roda r1 = new Roda(32);
    Roda r2 = new Roda(32);
    Roda r3 = new Roda(34);
    Roda r4 = new Roda(34);
    Roda rodas[] = new Roda[] {r1,r2,r3,r4};
    Carro c = new Carro("ABC1234" , m, rodas);
    System.out.println(c);

        
    }
    
}
