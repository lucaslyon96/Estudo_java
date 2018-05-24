package paciente;

/**
 *
 * @author Vanessa Dantas
 */
public class Paciente {
    private int cpf;
    private String nome;
    private int idade;
    private int grauUrgencia;
    private int atendimento;
    
    //Construtor
    public Paciente(int cpf, String nome, int idade, int grauUrgencia,int atendimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.grauUrgencia = grauUrgencia;
        this.atendimento=atendimento;
    }
    //Gets e Sets
    public int getGrauUrgencia() {
        return grauUrgencia;
    }

    public int getAtendimento() {
        return atendimento;
    }
    

    //Metodo prioriza: compara o grau de urgencia de dois
    //objetos da classe paciente e retorna o objeto de maior urgencia
    //caso urgencia seja igual, maior idade tem prioridade
    private Paciente prioriza(Paciente P) {
        //1-alta,2-media,3-baixa
        return (this.grauUrgencia<P.grauUrgencia? this:
                P.grauUrgencia<this.grauUrgencia? P:
                this.idade>P.idade? this: P);
    }
    //toString
    public String toString() {
        return '{'+nome + " GU="+ grauUrgencia + " TA=" + atendimento + '}';
    }
    
}
