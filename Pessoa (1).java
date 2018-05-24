package conta;

/**
 *
 * @author carlosolarte
 */
public class Pessoa {

    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // set/get
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEamil(String email) {
        this.email = email;
    }

    public String toString() {
        return this.nome;
    }
}
