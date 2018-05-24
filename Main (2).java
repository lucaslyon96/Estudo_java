package conta;

/**
 *
 * @author carlosolarte
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta c = new Conta("12345", new Pessoa("carlos", "carlos@gmail"));
        c.depositar(1000);
        System.out.println(c);
    }
    
}
