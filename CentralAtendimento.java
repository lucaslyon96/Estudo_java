package paciente;
import java.util.*;

/**
 *
 * @author Vanessa Dantas
 */
public class CentralAtendimento {

    private Queue<Paciente> alta;
    private Queue<Paciente> media;
    private Queue<Paciente> baixa;

    //Construtor
    public CentralAtendimento() {
        this.alta = new LinkedList<>();
        this.media = new LinkedList<>();
        this.baixa = new LinkedList<>();
    }
    
    //Inserir: insere o paciente segundo seu grau de urgencia
    public void inserir(Paciente P){
        //1-alta,2-media,3-baixa
        if(P.getGrauUrgencia()==1){
            this.alta.add(P);
        }
        else if(P.getGrauUrgencia()==2){
            this.media.add(P);
        }
        else{
            this.baixa.add(P);
        }
    }
    //Proximo Paciente: retorna o próximo paciente a ser 
    //atendido segundo as regras do hospital.
    public Paciente proximoPaciente(){
        //1)O primeiro paciente na fila de prioridade "Alta" é chamado.
        //2)Se a fila da prioridade "Alta" está vazia, o primeiro 
        //paciente da fila de espera "Média" é chamado.
        //3)Finalmente, se as filas “Alta” e “Média” estão vazias,
        //os médicos começam a atender pacientes da fila “Baixa”.
        if(!this.alta.isEmpty()){//fila alta nao esta vazia,item 1)
            return this.alta.remove();//remove o primeiro elemento
        }
        if(!this.media.isEmpty()){//fila media n esta vazia,item 2
            return this.media.remove();
        }
        if(!this.baixa.isEmpty()){//fila baixa n esta vazia,item 3
            return this.baixa.remove();
        }
        System.out.println("Nao há pacientes nas filas de espera.");
        return null;
    }
    //Vazia
    public boolean empty(){
        if(this.alta.isEmpty() &&this.media.isEmpty() &&this.baixa.isEmpty()){
            return true;
        }
        return false;
    }
    //toString
    public String toString() {
        return "CentralAtendimento\n"+ "alta=" + alta + "\nmedia=" + media + "\nbaixa=" + baixa;
    }
    
    
}
